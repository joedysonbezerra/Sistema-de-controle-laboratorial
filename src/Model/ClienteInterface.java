package model;
import base.Cliente;
import base.Pessoa;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public interface ClienteInterface {
    void inserirCliente(Pessoa pCliente) throws InsertException, NullObjectException;
    Cliente buscaCliente(Pessoa pCliente) throws SearchException,NullObjectException;
    void excluiCliente(Pessoa pCliente) throws RemoveException,NullObjectException;
    ArrayList<Pessoa> listarClientes();
    boolean verificaCliente(Pessoa pCliente);
}
