package controller;


import model.ClienteInterface;
import model.ClienteRepositorio;
import base.Pessoa;
import base.Cliente;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;


public class ClienteController {
    ClienteInterface listaClientes = new ClienteRepositorio();

    public void cadastrarCliente(String cpf, String nome, int idade, String sexo,
                                 String estado,String cidade, String bairro, String rua,
                                 int cod, String pPlanodesaude) throws InsertException,NullObjectException{
        try {
        Pessoa novoCliente = new Cliente(cpf, nome, idade, sexo,
                estado, cidade, bairro, rua, cod, pPlanodesaude);

        listaClientes.inserirCliente(novoCliente);

        }catch (InsertException e){
            throw new InsertException("Error - O Cliente não foi cadastrado com sucesso");
        }catch (NullObjectException e){
            throw new NullObjectException("Error - por favor, cadastre um cliente válido");
        }

    }
    public Cliente procuraCliente(String cpf) throws SearchException,NullObjectException{
        try {

            Pessoa cliente = new Cliente(cpf);
            cliente = listaClientes.buscaCliente(cliente);
            return (Cliente) cliente;
        }catch (SearchException e){
            throw new SearchException("Error - O Cliente não foi encontrado");
        }catch (NullObjectException e){
            throw new NullObjectException("Error - por favor, informe todos os dados.");
        }

    }
    public void removeCliente(String cpf) throws SearchException,NullObjectException{
        try {

            Pessoa cliente = new Cliente(cpf);
            listaClientes.excluiCliente(cliente);
        }catch (SearchException e){
            throw new RemoveException("Error - Não conseguimos remover o cliente");
        }catch (NullObjectException e){
            throw new NullObjectException("Error - por favor, informe todos os dados.");
        }

    }

}
