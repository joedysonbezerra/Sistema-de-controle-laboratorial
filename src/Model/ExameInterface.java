package model;
import base.Exame;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public interface ExameInterface {

    void inserirExame(Exame pExame) throws InsertException,NullObjectException;
    Exame buscaExame(Exame pExame) throws SearchException,NullObjectException;
    void excluiExame(Exame pExame) throws RemoveException,NullObjectException;
    ArrayList<Exame> listarExame();
    boolean verificaExame(Exame pExame);
}
