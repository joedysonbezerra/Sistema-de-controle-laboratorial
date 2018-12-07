package model;
import base.Cliente;

import java.util.ArrayList;

public interface ClienteInterface {
    boolean inserirCliente(Cliente pCliente);
    Cliente buscaCliente(String pCpf);
    boolean excluiCliente(String pCpf);
    ArrayList<Cliente> listarClientes();
    boolean verificaCliente();
}
