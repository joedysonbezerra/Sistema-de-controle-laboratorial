package controller;

import base.Exame;
import model.ExameInterface;
import model.ExameRepositorio;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;

public class ExameController {
    ExameInterface listaClientes = new ExameRepositorio();

    public void cadastrarExame(String nome, float preco) throws InsertException, NullObjectException {
        try {
            Exame novoCliente = new Exame(nome, preco);

            listaClientes.inserirExame(novoCliente);

        }catch (InsertException e){
            throw new InsertException("Error - O Exame não foi cadastrado com sucesso");
        }catch (NullObjectException e){
            throw new NullObjectException("Error - por favor, cadastre um exame válido");
        }

    }
    public Exame procuraExame(int cod) throws SearchException,NullObjectException{
        try {

            Exame exame = new Exame(cod);
            exame = listaClientes.buscaExame(exame);
            return (Exame) exame;
        }catch (SearchException e){
            throw new SearchException("Error - O Exame não foi encontrado");
        }catch (NullObjectException e){
            throw new NullObjectException("Error - por favor, informe todos os dados.");
        }

    }
    public void removeExame(int cod) throws SearchException,NullObjectException{
        try {

            Exame exame = new Exame(cod);
            listaClientes.excluiExame(exame);
        }catch (SearchException e){
            throw new RemoveException("Error - Não conseguimos remover o exame");
        }catch (NullObjectException e){
            throw new NullObjectException("Error - por favor, informe todos os dados.");
        }

    }

}

