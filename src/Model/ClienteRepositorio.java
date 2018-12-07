package model;
import base.Cliente;

import java.util.ArrayList;

public class ClienteRepositorio implements ClienteInterface {

    ArrayList<Cliente> ListaDeClientes = new ArrayList<Cliente>();

    @Override
    public boolean inserirCliente(Cliente pCliente) {
        return false;
    }

    @Override
    public Cliente buscaCliente(String pCpf) {
        return null;
    }

    @Override
    public boolean excluiCliente(String pCpf) {
        return false;
    }

    @Override
    public ArrayList<Cliente> listarClientes() {
        return null;
    }

    @Override
    public boolean verificaCliente() {
        return false;
    }
}
