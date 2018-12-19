package model;

import base.Cliente;
import util.exception.InsertException;
import util.exception.SearchException;
import util.exception.RemoveException;


import java.util.ArrayList;

public class ClienteRepositorio implements ClienteInterface {

    ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

    @Override
    public void inserirCliente(Cliente pCliente) throws InsertException,NullPointerException {
        try {
            if(verificaCliente(pCliente)) throw new NullPointerException("BD: Cliente Invalido");
            this.listaDeClientes.add(pCliente);
            throw new NullPointerException("BD: Cliente Invalido");
        }catch (Exception e){
            throw new InsertException("BD: Cliente não foi cadastrado");
        }
    }

    @Override
    public Cliente buscaCliente(Cliente pCliente) throws SearchException,NullPointerException {
            if(verificaCliente(pCliente)) throw new NullPointerException("BD: Cliente Invalido");
            int i = listaDeClientes.indexOf(pCliente);

            if(i >= 0) {
                return (Cliente) listaDeClientes.get(i);
            }else {
                throw new SearchException("BD: Cliente não foi encontrado");
            }
    }

    @Override
    public void excluiCliente(Cliente pCliente) throws RemoveException,NullPointerException {
            try {
                if(verificaCliente(pCliente)) throw new NullPointerException("BD: Cliente Invalido");
                this.listaDeClientes.remove(pCliente);
            }catch (Exception e){
                throw new RemoveException("BD: Cliente não foi removido");
            }
    }

    @Override
    public ArrayList<Cliente> listarClientes() {
        return listaDeClientes;
    }

    @Override
    public boolean verificaCliente(Cliente pCliente) {
        if(pCliente == null){
            return true;
        }
        return false;
    }
}
