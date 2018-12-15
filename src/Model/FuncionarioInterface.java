package Model;
import java.util.ArrayList;

import base.Funcionario;
import base.Pessoa;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

public interface FuncionarioInterface {
	void inserirFuncionario(Pessoa pFuncionario) throws InsertException, NullObjectException;
	Funcionario buscaFuncionario(Pessoa pFuncionario) throws SearchException, NullObjectException;
	void excluiFuncionario(Pessoa pFuncionario) throws RemoveException, NullObjectException;
	public boolean verificarFuncionario(Pessoa pFuncionario);
	ArrayList<Pessoa> listarFuncionarios();
}
