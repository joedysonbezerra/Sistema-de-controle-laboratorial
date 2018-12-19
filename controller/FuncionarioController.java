package controller;
import base.Administrativo;
import base.Enfermagem;
import model.FuncionarioInterface;
import model.FuncionarioRepositorio;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public class FuncionarioController {
	FuncionarioInterface listaFuncionarios = new FuncionarioRepositorio();

	public void cadastrarFuncionarioAdministrativo(String cpf, String nome, int idade, String sexo, String nomeDepartamento, int qtdVendida) throws InsertException, NullPointerException{
		try {
			Administrativo novoFuncionario = new Administrativo(cpf, nome, idade, sexo, nomeDepartamento,qtdVendida);

			listaFuncionarios.inserirFuncionarioAdministrativo(novoFuncionario);

		}catch (InsertException e) {
			throw new InsertException("O funcionario não foi cadastrado com sucesso");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por Favor, cadastre um funcionario válido");
		}

	}



	public Administrativo procuraFuncionarioAdministrativo(String cpf) throws SearchException, NullPointerException{
		try {

			Administrativo funcionario = new Administrativo(cpf);
			funcionario = listaFuncionarios.buscaFuncionarioAdministrativo(funcionario);
			return funcionario;
		}catch (SearchException e) {
			throw new SearchException("O funcionario não foi encontrado");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por favor, informe todos os dados");
		}
	}

	public void removeFuncionarioAdministrativo(String cpf) throws SearchException, NullPointerException{
		try {

			Administrativo funcionario = new Administrativo(cpf);
			listaFuncionarios.excluiFuncionarioAdministrativo(funcionario);
		}catch (SearchException e) {
			throw new RemoveException("Não conseguimos remover o cliente");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por favor, informe todos os dados.");
		}
	}
	public ArrayList<Administrativo> ListarTodosAdministrativo(){
		return listaFuncionarios.listarFuncionariosAdministrativo();
	}

	public void cadastrarFuncionarioEnfermagem(String cpf, String nome, int idade, String sexo, String nomeDepartamento,int examesColetados) throws InsertException, NullPointerException{
		try {
			Enfermagem novoFuncionario = new Enfermagem(cpf, nome, idade, sexo, nomeDepartamento,examesColetados);

			listaFuncionarios.inserirFuncionarioEnfermagem(novoFuncionario);

		}catch (InsertException e) {
			throw new InsertException("O funcionario não foi cadastrado com sucesso");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por Favor, cadastre um funcionario válido");
		}

	}
	public Enfermagem procuraFuncionarioEnfermagem(String cpf) throws SearchException, NullPointerException{
		try {

			Enfermagem funcionario = new Enfermagem(cpf);
			funcionario = listaFuncionarios.buscaFuncionarioEnfermagem(funcionario);
			return funcionario;
		}catch (SearchException e) {
			throw new SearchException("O funcionario não foi encontrado");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por favor, informe todos os dados");
		}
	}

	public void removeFuncionarioEnfermagem(String cpf) throws SearchException, NullPointerException{
		try {

			Enfermagem funcionario = new Enfermagem(cpf);
			listaFuncionarios.excluiFuncionarioEnfermagem(funcionario);
		}catch (SearchException e) {
			throw new RemoveException("Não conseguimos remover o cliente");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por favor, informe todos os dados.");
		}
	}
	public ArrayList<Enfermagem> ListarTodosEnfermagem(){
		return listaFuncionarios.listarFuncionariosEnfermagem();
	}
}
