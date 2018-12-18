package controller;

import base.Medico;
import model.MedicoInterface;
import model.MedicoRepositorio;
import util.exception.InsertException;
import util.exception.NullObjectException;
import util.exception.RemoveException;
import util.exception.SearchException;

public class MedicoController {
	MedicoInterface listaMedicos = new MedicoRepositorio();

	public void cadastrarMedico(String crm, String nome) throws InsertException, NullObjectException{
		try {
		Medico novoMedico = new Medico(crm, nome);

		listaMedicos.insereMedico(novoMedico);

		}catch (InsertException e) {
			throw new InsertException("O medico nao foi cadastrado com sucesso");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, cadastre um medico valido");
		}

	}
	public Medico procurarMedico(String crm) throws SearchException, NullObjectException{
		try {
			Medico medico = new Medico(crm);
			return (Medico) medico;
		}catch (SearchException e) {
			throw new SearchException("O medico nao foi encontrado");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados");
		}
	}
	public void removeCliente(String crm) throws SearchException, NullObjectException{
		try {

			Medico medico = new Medico(crm);
			listaMedicos.excluiMedico(medico);
		}catch (SearchException e) {
			throw new RemoveException("Nao foi possivel remover o medico");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados");
		}
	}
}
