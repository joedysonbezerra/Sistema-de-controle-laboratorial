package model;

import base.Medico;

import java.util.ArrayList;

public class MedicoRepositorio implements MedicoInterface {
    @Override
    public boolean insere(Medico pMedico) {
        return false;
    }

    @Override
    public Medico busca(String crm) {
        return null;
    }

    @Override
    public ArrayList<Medico> listarMedico() {
        return null;
    }

    @Override
    public boolean exclui(String crm) {
        return false;
    }
}
