package model;
import java.util.ArrayList;

import base.Funcionario;
import base.Pessoa;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;

public interface FuncionarioInterface {
	void inserirFuncionario(Pessoa pFuncionario) throws InsertException, NullObjectException;
	Funcionario buscaFuncionario(Pessoa pFuncionario) throws SearchException, NullObjectException;
	void excluiFuncionario(Pessoa pFuncionario) throws RemoveException, NullObjectException;
	public boolean verificarFuncionario(Pessoa pFuncionario);
	ArrayList<Pessoa> listarFuncionarios();
}
