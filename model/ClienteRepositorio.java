package model;

import base.Pessoa;
import base.Cliente;
import util.exception.InsertException;
import util.exception.SearchException;
import util.exception.RemoveException;
import util.exception.NullObjectException;


import java.util.ArrayList;

public class ClienteRepositorio implements ClienteInterface {

    ArrayList<Pessoa> listaDeClientes = new ArrayList<Pessoa>();

    @Override
    public void inserirCliente(Pessoa pCliente) throws InsertException,NullObjectException {
        try {
            if(pCliente instanceof Cliente) {
                if(verificaCliente(pCliente)) throw new NullObjectException("BD: Cliente Invalido");
                this.listaDeClientes.add(pCliente);
            }else {
                throw new NullObjectException("BD: Cliente Invalido");
            }
        }catch (Exception e){
            throw new InsertException("BD: Cliente não foi cadastrado");
        }
    }

    @Override
    public Cliente buscaCliente(Pessoa pCliente) throws SearchException,NullObjectException {
        if(pCliente instanceof Cliente) {
            if(verificaCliente(pCliente)) throw new NullObjectException("BD: Cliente Invalido");
            int i = listaDeClientes.indexOf(pCliente);

            if(i >= 0) {
                return (Cliente) listaDeClientes.get(i);
            }else {
                throw new SearchException("BD: Cliente não foi encontrado");
            }
        }else {
            throw new NullObjectException("BD: Cliente Invalido");
        }
    }

    @Override
    public void excluiCliente(Pessoa pCliente) throws RemoveException,NullObjectException {
        if(pCliente instanceof Cliente) {
            try {
                if(verificaCliente(pCliente)) throw new NullObjectException("BD: Cliente Invalido");
                this.listaDeClientes.remove(pCliente);
            }catch (Exception e){
                throw new RemoveException("BD: Cliente não foi removido");
            }
        }else {
            throw new NullObjectException("BD: Cliente Invalido");
        }
    }

    @Override
    public ArrayList<Pessoa> listarClientes() {
        return null;
    }

    @Override
    public boolean verificaCliente(Pessoa pCliente) {
        if(pCliente == null){
            return true;
        }
        return false;
    }
}
