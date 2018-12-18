package model;

import base.Medico;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public interface MedicoInterface {

    void insereMedico(Medico pMedico) throws InsertException, NullObjectException;
    Medico buscaMedico(Medico pMedico) throws SearchException,NullObjectException;
    ArrayList<Medico> listarMedico();
    void excluiMedico(Medico pMedico) throws RemoveException,NullObjectException;
    boolean verificaMedico(Medico pMedico) ;
}
