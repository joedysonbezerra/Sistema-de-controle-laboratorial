package model;

import base.Pessoa;
import base.Cliente;
import util.exception.InsertException;
import util.exception.SearchException;
import util.exception.RemoveException;
import util.exception.NullObjectException;


import java.util.ArrayList;

public interface ClienteInterface {
    void inserirCliente(Pessoa pCliente) throws InsertException, NullObjectException;
    Cliente buscaCliente(Pessoa pCliente) throws SearchException,NullObjectException;
    void excluiCliente(Pessoa pCliente) throws RemoveException,NullObjectException;
    ArrayList<Pessoa> listarClientes();
    boolean verificaCliente(Pessoa pCliente) ;
}
