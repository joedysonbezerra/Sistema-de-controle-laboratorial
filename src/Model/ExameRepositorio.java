package model;
import base.Cliente;
import base.Exame;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public class ExameRepositorio implements ExameInterface {


    @Override
    public void inserirExame(Exame pCliente) throws InsertException, NullObjectException {
        
    }

    @Override
    public Exame buscaExame(Exame pCliente) throws SearchException, NullObjectException {
        return null;
    }

    @Override
    public void excluiExame(Exame pCliente) throws RemoveException, NullObjectException {

    }

    @Override
    public ArrayList<Exame> listarExame() {
        return null;
    }

    @Override
    public boolean verificaExame(Exame pCliente) {
        return false;
    }
}
