package model;
import base.Exame;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public interface ExameInterface {

    void inserirExame(Exame pCliente) throws InsertException,NullObjectException;
    Exame buscaExame(Exame pCliente) throws SearchException,NullObjectException;
    void excluiExame(Exame pCliente) throws RemoveException,NullObjectException;
    ArrayList<Exame> listarExame();
    boolean verificaExame(Exame pCliente);
}
