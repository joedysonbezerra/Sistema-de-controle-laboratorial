package model;

import base.Venda;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;


public interface VendaInterface {

    void inserirVenda(Venda pVenda) throws InsertException,NullPointerException;
    Venda buscaVenda(Venda pVenda) throws SearchException,NullPointerException;
    void excluiVenda(Venda pVenda) throws RemoveException,NullPointerException;
    ArrayList<Venda> listarVenda();
    boolean verificaVenda(Venda pVenda);
}

