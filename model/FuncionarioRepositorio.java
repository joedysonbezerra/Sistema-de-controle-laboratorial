package model;
import base.Funcionario;
import base.Administrativo;
import base.Enfermagem;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public class FuncionarioRepositorio implements FuncionarioInterface {

	ArrayList<Administrativo> listaDeFuncionariosAdministrativo = new ArrayList<Administrativo>();
	ArrayList<Enfermagem> listaDeFuncionariosEnfermagem = new ArrayList<Enfermagem>();

	@Override
	public void inserirFuncionarioAdministrativo(Administrativo pFuncionario) throws InsertException, NullPointerException {
		try {
				if(verificarFuncionario(pFuncionario)) throw new NullPointerException("Funcionario Invalido");
				this.listaDeFuncionariosAdministrativo.add(pFuncionario);

		}catch (Exception e) {
			throw new InsertException("Funcionario não foi cadastrado");
		}
	}

	@Override
	public Administrativo buscaFuncionarioAdministrativo(Administrativo pFuncionario) throws SearchException, NullPointerException {
			if(verificarFuncionario(pFuncionario)) throw new NullPointerException("Funcionario Invalido");
			int i = listaDeFuncionariosAdministrativo.indexOf(pFuncionario);

			if(i >= 0) {
				return listaDeFuncionariosAdministrativo.get(i);
			}else {
				throw new SearchException("Funcionario não foi encontrado");
			}
	}

	@Override
	public void excluiFuncionarioAdministrativo(Administrativo pFuncionario) throws RemoveException, NullPointerException {
			try {
				if(verificarFuncionario(pFuncionario)) throw new NullPointerException ("Funcionario Invalido");
				this.listaDeFuncionariosAdministrativo.remove(pFuncionario);
			}catch (Exception e) {
				throw new RemoveException("Funcionario não foi removido");
			}
	}

	@Override
	public ArrayList<Administrativo> listarFuncionariosAdministrativo() {
		return listaDeFuncionariosAdministrativo;
	}

	public void inserirFuncionarioEnfermagem(Enfermagem pFuncionario) throws InsertException, NullPointerException {
		try {
				if(verificarFuncionario(pFuncionario)) throw new NullPointerException("Funcionario Invalido");
				this.listaDeFuncionariosEnfermagem.add(pFuncionario);

		}catch (Exception e) {
			throw new InsertException("Funcionario não foi cadastrado");
		}
	}

	@Override
	public Enfermagem buscaFuncionarioEnfermagem(Enfermagem pFuncionario) throws SearchException, NullPointerException {
			if(verificarFuncionario(pFuncionario)) throw new NullPointerException("Funcionario Invalido");
			int i = listaDeFuncionariosEnfermagem.indexOf(pFuncionario);

			if(i >= 0) {
				return listaDeFuncionariosEnfermagem.get(i);
			}else {
				throw new SearchException("Funcionario não foi encontrado");
			}
	}

	@Override
	public void excluiFuncionarioEnfermagem(Enfermagem pFuncionario) throws RemoveException, NullPointerException {
			try {
				if(verificarFuncionario(pFuncionario)) throw new NullPointerException ("Funcionario Invalido");
				this.listaDeFuncionariosEnfermagem.remove(pFuncionario);
			}catch (Exception e) {
				throw new RemoveException("Funcionario não foi removido");
			}
	}

	@Override
	public ArrayList<Enfermagem> listarFuncionariosEnfermagem() {
		return listaDeFuncionariosEnfermagem;
	}


	@Override
	public boolean verificarFuncionario(Funcionario pFuncionario) {
		if(pFuncionario == null) {
			return true;
		}
		return false;
	}

}
