package model;

import base.Medico;

import java.util.ArrayList;

public interface MedicoInterface {

    boolean insere(Medico pMedico);
    Medico busca(String crm);
    ArrayList<Medico> listarMedico();
    boolean exclui(String crm);
}
