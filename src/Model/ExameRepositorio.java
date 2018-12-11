package model;

import base.Exame;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public class ExameRepositorio implements ExameInterface {

    ArrayList<Exame> listaDeExames = new ArrayList<Exame>();

    @Override
    public void inserirExame(Exame pExame) throws InsertException, NullObjectException {
        try {
            if(verificaExame(pExame)) throw new NullObjectException("BD: Exame Invalido");
            this.listaDeExames.add(pExame);
        }catch (Exception e){
            throw new InsertException("BD: Exame não foi cadastrado");
        }
    }

    @Override
    public Exame buscaExame(Exame pExame) throws SearchException, NullObjectException {
        if(verificaExame(pExame)) throw new NullObjectException("BD: Exame Invalido");
            int i = listaDeExames.indexOf(pExame);

            if(i >= 0) {
                return (Exame) listaDeExames.get(i);
            }else {
                throw new SearchException("BD: Exame não foi encontrado");
            }
    }

    @Override
    public void excluiExame(Exame pExame) throws RemoveException, NullObjectException {
            try {
                if(verificaExame(pExame)) throw new NullObjectException("BD: Exame Invalido");
                this.listaDeExames.remove(pExame);
            }catch (Exception e){
                throw new RemoveException("BD: Exame não foi removido");
            }
        }

    @Override
    public ArrayList<Exame> listarExame() {
        return null;
    }

    @Override
    public boolean verificaExame(Exame pExame) {
        if(pExame == null){
            return true;
        }
        return false;
    }
}
