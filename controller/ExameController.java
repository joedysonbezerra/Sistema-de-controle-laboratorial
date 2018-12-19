package controller;

import java.util.ArrayList;

import base.Exame;
import model.ExameInterface;
import model.ExameRepositorio;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

public class ExameController {
    ExameInterface listaExames = new ExameRepositorio();

    public void cadastrarExame(String nome, float preco) throws InsertException, NullPointerException {
        try {
            Exame novoCliente = new Exame(nome, preco);

            listaExames.inserirExame(novoCliente);

        }catch (InsertException e){
            throw new InsertException("Error - O Exame não foi cadastrado com sucesso");
        }catch (NullPointerException e){
            throw new NullPointerException("Error - por favor, cadastre um exame válido");
        }

    }
    public Exame procuraExame(int cod) throws SearchException,NullPointerException{
        try {

            Exame exame = new Exame(cod);
            exame = listaExames.buscaExame(exame);
            return (Exame) exame;
        }catch (SearchException e){
            throw new SearchException("Error - O Exame não foi encontrado");
        }catch (NullPointerException e){
            throw new NullPointerException("Error - por favor, informe todos os dados.");
        }

    }
    public void removeExame(int cod) throws SearchException,NullPointerException{
        try {

            Exame exame = new Exame(cod);
            listaExames.excluiExame(exame);
        }catch (SearchException e){
            throw new RemoveException("Error - Não conseguimos remover o exame");
        }catch (NullPointerException e){
            throw new NullPointerException("Error - por favor, informe todos os dados.");
        }

	 }

	 public ArrayList<Exame> ListarTodos(){
		return listaExames.listarExame();
	}

}

