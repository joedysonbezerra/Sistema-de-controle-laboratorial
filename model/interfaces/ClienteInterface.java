package model.interfaces;

import base.Cliente;
import util.exception.InsertException;
import util.exception.SearchException;
import util.exception.RemoveException;


import java.util.ArrayList;

public interface ClienteInterface {
    void inserirCliente(Cliente pCliente) throws InsertException, NullPointerException;
    Cliente buscaCliente(Cliente pCliente) throws SearchException,NullPointerException;
    void excluiCliente(Cliente pCliente) throws RemoveException,NullPointerException;
    ArrayList<Cliente> listarClientes();
    boolean verificaCliente(Cliente pCliente) ;
}
