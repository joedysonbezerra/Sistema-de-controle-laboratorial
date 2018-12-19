package model.interfaces;

import base.Medico;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public interface MedicoInterface {

    void insereMedico(Medico pMedico) throws InsertException, NullPointerException;
    Medico buscaMedico(Medico pMedico) throws SearchException,NullPointerException;
    ArrayList<Medico> listarMedico();
    void excluiMedico(Medico pMedico) throws RemoveException,NullPointerException;
    boolean verificaMedico(Medico pMedico) ;
}
