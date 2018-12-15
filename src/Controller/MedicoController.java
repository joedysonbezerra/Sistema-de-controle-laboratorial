package Controller;

import base.Medico;
import Model.MedicoInterface;
import Model.MedicoRepositorio;
import util.InsertException;
import util.NullObjectException;
import util.RemoveException;
import util.SearchException;

public class MedicoController {	
	MedicoInterface listaMedicos = new MedicoRepositorio();
	
	public void cadastrarMedico(String crm, String nome) throws InsertException, NullObjectException{
		try {
		Medico novoMedico = new Medico(crm, nome);
		
		listaMedicos.insereMedico(novoMedico);
		
		}catch (InsertException e) {
			throw new InsertException("O médico não foi cadastrado com sucesso");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, cadastre um médico válido");
		}
		
	}
	public Medico procurarMedico(String crm) throws SearchException, NullObjectException{
		try {
			Medico medico = new Medico(crm);
			return (Medico) medico;
		}catch (SearchException e) {
			throw new SearchException("O medico não foi encontrado");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados");
		}
	}
	public void removeCliente(String crm) throws SearchException, NullObjectException{
		try {
			
			Medico medico = new Medico(crm);
			listaMedicos.excluiMedico(medico);
		}catch (SearchException e) {
			throw new RemoveException("Não foi possível remover o médico");
		}catch (NullObjectException e) {
			throw new NullObjectException("Por favor, informe todos os dados");
		}
	}
}
