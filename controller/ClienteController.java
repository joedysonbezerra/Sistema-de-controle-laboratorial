package controller;


import model.ClienteInterface;
import model.ClienteRepositorio;

import java.util.ArrayList;

import base.Cliente;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;


public class ClienteController {
    ClienteInterface listaClientes = new ClienteRepositorio();

    public void cadastrarCliente(String cpf, String nome, int idade, String sexo,
                                 String estado,String cidade, String bairro, String rua,
                                 int cod, String pPlanodesaude) throws InsertException,NullPointerException{
        try {
        Cliente novoCliente = new Cliente(cpf, nome, idade, sexo,
                estado, cidade, bairro, rua, cod, pPlanodesaude);

        listaClientes.inserirCliente(novoCliente);

        }catch (InsertException e){
            throw new InsertException("Error - O Cliente não foi cadastrado com sucesso");
        }catch (NullPointerException e){
            throw new NullPointerException("Error - por favor, cadastre um cliente válido");
        }

    }
    public Cliente procuraCliente(String cpf) throws SearchException,NullPointerException{
        try {

            Cliente cliente = new Cliente(cpf);
            cliente = listaClientes.buscaCliente(cliente);
            return cliente;
        }catch (SearchException e){
            throw new SearchException("Error - O Cliente não foi encontrado");
        }catch (NullPointerException e){
            throw new NullPointerException("Error - por favor, informe todos os dados.");
        }

    }
    public void removeCliente(String cpf) throws SearchException,NullPointerException{
        try {

            Cliente cliente = new Cliente(cpf);
            listaClientes.excluiCliente(cliente);
        }catch (SearchException e){
            throw new RemoveException("Error - Não conseguimos remover o cliente");
        }catch (NullPointerException e){
            throw new NullPointerException("Error - por favor, informe todos os dados.");
        }

	 }

	 public ArrayList<Cliente> ListarTodos(){
		 return listaClientes.listarClientes();
	 }

}
