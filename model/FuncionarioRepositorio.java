package model;
import base.Funcionario;
import base.Pessoa;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public class FuncionarioRepositorio implements FuncionarioInterface {
	
	ArrayList<Pessoa> listaDeFuncionarios = new ArrayList<Pessoa>();

	@Override
	public void inserirFuncionario(Pessoa pFuncionario) throws InsertException, NullObjectException {
		try {
			if(pFuncionario instanceof Funcionario) {
				if(verificarFuncionario(pFuncionario)) throw new NullObjectException("Funcionario Inv?lido");
				this.listaDeFuncionarios.add(pFuncionario);
			}else {
				throw new NullObjectException("Funcionario Inv?lido");
			}
		}catch (Exception e) {
			throw new InsertException("Funcionario n?o foi cadastrado");
		}
	}

	@Override
	public Funcionario buscaFuncionario(Pessoa pFuncionario) throws SearchException, NullObjectException {
		if(pFuncionario instanceof Funcionario) {
			if(verificarFuncionario(pFuncionario)) throw new NullObjectException("Funcionario Inv?lido");
			int i = listaDeFuncionarios.indexOf(pFuncionario);
			
			if(i >= 0) {
				return (Funcionario) listaDeFuncionarios.get(i);
			}else {
				throw new SearchException("Funcionario n?o foi encontrado");
			}
		}else {
			throw new NullObjectException("Funcionario Inv?lido");
		}
	}

	@Override
	public void excluiFuncionario(Pessoa pFuncionario) throws RemoveException, NullObjectException {
		if(pFuncionario instanceof Funcionario) {
			try {
				if(verificarFuncionario(pFuncionario)) throw new NullObjectException ("Funcionario Inv?lido");
				this.listaDeFuncionarios.remove(pFuncionario);
			}catch (Exception e) {
				throw new RemoveException("Funcionario n?o foi removido");
			}
		}else {
			throw new NullObjectException("Funcionario Inv?lido");
		}
	}
	
	@Override
	public ArrayList<Pessoa> listarFuncionarios() {
		return null;
	}
	
	@Override
	public boolean verificarFuncionario(Pessoa pFuncionario) {
		if(pFuncionario == null) {
			return true;
		}
		return false;
	}
	
}
