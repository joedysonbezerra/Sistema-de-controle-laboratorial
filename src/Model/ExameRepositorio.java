package model;
import base.Exame;

import java.util.ArrayList;

public class ExameRepositorio implements ExameInterface {
    @Override
    public boolean insere(Exame pExame) {
        return false;
    }

    @Override
    public Exame busca(int cod) {
        return null;
    }

    @Override
    public ArrayList<Exame> listarExame() {
        return null;
    }

    @Override
    public boolean exclui(int cod) {
        return false;
    }
}
