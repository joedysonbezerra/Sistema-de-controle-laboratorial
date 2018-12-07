package model;
import base.Exame;

import java.util.ArrayList;

public interface ExameInterface {

    boolean insere(Exame pExame);
    Exame busca(int cod);
    ArrayList<Exame> listarExame();
    boolean exclui(int cod);
}
