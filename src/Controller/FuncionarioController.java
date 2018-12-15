package Controller;
import Model.FuncionarioInterface;
import Model.FuncionarioRepositorio;
import base.Departamento;
import base.Funcionario;
import base.Pessoa;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

public class FuncionarioController {
	FuncionarioInterface listaFuncionarios = new FuncionarioRepositorio();
	
	public void cadastrarFuncionario(String cpf, String nome, int idade, String sexo, Departamento departamento) throws InsertException, NullObjectException{
		try {
			Funcionario novoFuncionario = new Funcionario(cpf, nome, idade, sexo, departamento);
			
			listaFuncionarios.inserirFuncionario(novoFuncionario);
			
		}catch (InsertException e) {
			throw new InsertException("O funcionario não foi cadastrado com sucesso");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por Favor, cadastre um funcionario válido");
		}
		
	}
	
	public Funcionario procuraFuncionario(String cpf) throws SearchException, NullObjectException{
		try {
			
			Pessoa funcionario = new Funcionario(cpf);
			funcionario = listaFuncionarios.buscaFuncionario(funcionario);
			return (Funcionario) funcionario;
		}catch (SearchException e) {
			throw new SearchException("O funcionario não foi encontrado");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados");
		}
	}
	
	public void removeFuncionario(String cpf) throws SearchException, NullObjectException{
		try {
			
			Pessoa funcionario = new Funcionario(cpf);
			listaFuncionarios.excluiFuncionario(funcionario);
		}catch (SearchException e) {
			throw new RemoveException("Não conseguimos remover o cliente");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados.");
		}
	}
}
