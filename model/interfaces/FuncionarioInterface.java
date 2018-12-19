package model.interfaces;
import java.util.ArrayList;

import base.Administrativo;
import base.Enfermagem;
import base.Funcionario;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

public interface FuncionarioInterface {
	void inserirFuncionarioAdministrativo(Administrativo pFuncionario) throws InsertException, NullPointerException;
	Administrativo buscaFuncionarioAdministrativo(Administrativo pFuncionario) throws SearchException, NullPointerException;
	void excluiFuncionarioAdministrativo(Administrativo pFuncionario) throws RemoveException, NullPointerException;
	ArrayList<Administrativo> listarFuncionariosAdministrativo();
	void inserirFuncionarioEnfermagem(Enfermagem pFuncionario) throws InsertException, NullPointerException;
	Enfermagem buscaFuncionarioEnfermagem(Enfermagem pFuncionario) throws SearchException, NullPointerException;
	void excluiFuncionarioEnfermagem(Enfermagem pFuncionario) throws RemoveException, NullPointerException;
	ArrayList<Enfermagem> listarFuncionariosEnfermagem();
	public boolean verificarFuncionario(Funcionario pFuncionario);
}
