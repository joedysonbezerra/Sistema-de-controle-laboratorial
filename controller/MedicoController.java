package controller;

import java.util.ArrayList;

import base.Medico;
import model.MedicoInterface;
import model.MedicoRepositorio;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

public class MedicoController {
	MedicoInterface listaMedicos = new MedicoRepositorio();

	public void cadastrarMedico(String crm, String nome) throws InsertException, NullPointerException{
		try {
		Medico novoMedico = new Medico(crm, nome);

		listaMedicos.insereMedico(novoMedico);

		}catch (InsertException e) {
			throw new InsertException("O medico nao foi cadastrado com sucesso");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por favor, cadastre um medico valido");
		}

	}
	public Medico procurarMedico(String crm) throws SearchException, NullPointerException{
		try {
			Medico medico = new Medico(crm);
			return (Medico) medico;
		}catch (SearchException e) {
			throw new SearchException("O medico nao foi encontrado");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por favor, informe todos os dados");
		}
	}
	public void removeCliente(String crm) throws SearchException, NullPointerException{
		try {

			Medico medico = new Medico(crm);
			listaMedicos.excluiMedico(medico);
		}catch (SearchException e) {
			throw new RemoveException("Nao foi possivel remover o medico");
		}catch (NullPointerException e) {
			throw new NullPointerException("Por favor, informe todos os dados");
		}
	}
	public ArrayList<Medico> ListarTodos(){
		return listaMedicos.listarMedico();
	}
}
