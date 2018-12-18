package controller;
import model.FuncionarioInterface;
import model.FuncionarioRepositorio;
import base.Departamento;
import base.Funcionario;
import base.Pessoa;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;

public class FuncionarioController {
	FuncionarioInterface listaFuncionarios = new FuncionarioRepositorio();

	public void cadastrarFuncionario(String cpf, String nome, int idade, String sexo, Departamento departamento) throws InsertException, NullObjectException{
		try {
			Funcionario novoFuncionario = new Funcionario(cpf, nome, idade, sexo, departamento);

			listaFuncionarios.inserirFuncionario(novoFuncionario);

		}catch (InsertException e) {
			throw new InsertException("O funcionario n�o foi cadastrado com sucesso");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por Favor, cadastre um funcionario v�lido");
		}

	}

	public Funcionario procuraFuncionario(String cpf) throws SearchException, NullObjectException{
		try {

			Pessoa funcionario = new Funcionario(cpf);
			funcionario = listaFuncionarios.buscaFuncionario(funcionario);
			return (Funcionario) funcionario;
		}catch (SearchException e) {
			throw new SearchException("O funcionario n�o foi encontrado");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados");
		}
	}

	public void removeFuncionario(String cpf) throws SearchException, NullObjectException{
		try {

			Pessoa funcionario = new Funcionario(cpf);
			listaFuncionarios.excluiFuncionario(funcionario);
		}catch (SearchException e) {
			throw new RemoveException("N�o conseguimos remover o cliente");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados.");
		}
	}
}
