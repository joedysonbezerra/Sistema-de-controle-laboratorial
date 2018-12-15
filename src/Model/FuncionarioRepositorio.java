package Model;
import base.Funcionario;
import base.Pessoa;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

import java.util.ArrayList;

public class FuncionarioRepositorio implements FuncionarioInterface{
	
	ArrayList<Pessoa> listaDeFuncionarios = new ArrayList<Pessoa>();

	@Override
	public void inserirFuncionario(Pessoa pFuncionario) throws InsertException, NullObjectException {
		try {
			if(pFuncionario instanceof Funcionario) {
				if(verificarFuncionario(pFuncionario)) throw new NullObjectException("Funcionario Inválido");
				this.listaDeFuncionarios.add(pFuncionario);
			}else {
				throw new NullObjectException("Funcionario Inválido");
			}
		}catch (Exception e) {
			throw new InsertException("Funcionario não foi cadastrado");
		}
	}

	@Override
	public Funcionario buscaFuncionario(Pessoa pFuncionario) throws SearchException, NullObjectException {
		if(pFuncionario instanceof Funcionario) {
			if(verificarFuncionario(pFuncionario)) throw new NullObjectException("Funcionario Inválido");
			int i = listaDeFuncionarios.indexOf(pFuncionario);
			
			if(i >= 0) {
				return (Funcionario) listaDeFuncionarios.get(i);
			}else {
				throw new SearchException("Funcionario não foi encontrado");
			}
		}else {
			throw new NullObjectException("Funcionario Inválido");
		}
	}

	@Override
	public void excluiFuncionario(Pessoa pFuncionario) throws RemoveException, NullObjectException {
		if(pFuncionario instanceof Funcionario) {
			try {
				if(verificarFuncionario(pFuncionario)) throw new NullObjectException ("Funcionario Inválido");
				this.listaDeFuncionarios.remove(pFuncionario);
			}catch (Exception e) {
				throw new RemoveException("Funcionario não foi removido");
			}
		}else {
			throw new NullObjectException("Funcionario Inválido");
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
