package Model;

import base.Medico;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public interface MedicoInterface {

    void insereMedico(Medico pMedico) throws InsertException, NullObjectException;
    Medico buscaMedico(Medico pMedico) throws SearchException,NullObjectException;
    ArrayList<Medico> listarMedico();
    void excluiMedico(Medico pMedico) throws RemoveException,NullObjectException;
    boolean verificaMedico(Medico pMedico) ;
}
