package model;
import base.Exame;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public interface ExameInterface {

    void inserirExame(Exame pExame) throws InsertException,NullPointerException;
    Exame buscaExame(Exame pExame) throws SearchException,NullPointerException;
    void excluiExame(Exame pExame) throws RemoveException,NullPointerException;
    ArrayList<Exame> listarExame();
    boolean verificaExame(Exame pExame);
}
