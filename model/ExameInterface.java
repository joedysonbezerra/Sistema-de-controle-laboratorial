package model;
import base.Exame;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public interface ExameInterface {

    void inserirExame(Exame pExame) throws InsertException,NullObjectException;
    Exame buscaExame(Exame pExame) throws SearchException,NullObjectException;
    void excluiExame(Exame pExame) throws RemoveException,NullObjectException;
    ArrayList<Exame> listarExame();
    boolean verificaExame(Exame pExame);
}
