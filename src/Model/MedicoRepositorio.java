package model;

import base.Medico;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public class MedicoRepositorio implements MedicoInterface {
    ArrayList<Medico> listaDeMedicos = new ArrayList<Medico>();
    @Override
    public void insereMedico(Medico pMedico) throws InsertException, NullObjectException {
        try {
            if(verificaMedico(pMedico)) throw new NullObjectException("BD: Medico Invalido");
            this.listaDeMedicos.add(pMedico);
        }catch (Exception e){
            throw new InsertException("BD: Medico não foi cadastrado");
        }
    }

    @Override
    public Medico buscaMedico(Medico pMedico) throws SearchException, NullObjectException {
        if(verificaMedico(pMedico)) throw new NullObjectException("BD: Medico Invalido");

        int i = listaDeMedicos.indexOf(pMedico);

        if(i >= 0) {
            return (Medico) listaDeMedicos.get(i);
        }else {
            throw new SearchException("BD: Medico não foi encontrado");
        }
    }

    @Override
    public ArrayList<Medico> listarMedico() {
        return null;
    }

    @Override
    public void excluiMedico(Medico pMedico) throws RemoveException, NullObjectException {
        try {
            if(verificaMedico(pMedico)) throw new NullObjectException("BD: Exame Invalido");
            this.listaDeMedicos.remove(pMedico);
        }catch (Exception e){
            throw new RemoveException("BD: Exame não foi removido");
        }
    }

    @Override
    public boolean verificaMedico(Medico pMedico) {
        if(pMedico == null){
            return true;
        }
        return false;
    }
}
