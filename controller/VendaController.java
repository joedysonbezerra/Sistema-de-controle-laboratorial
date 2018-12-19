package controller;

import base.Venda;
import model.VendaInterface;
import model.VendaRepositorio;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public class VendaController {
	VendaInterface listaVendas = new VendaRepositorio();

public void cadastrarVenda(Fachada fachada, String cpfCliente, String crm,
	 								String cpfAdministrativo, String cpfEnfermagem,int codExame)
	 throws InsertException,NullPointerException{
	try {

		Venda novaVenda = new Venda(fachada.cliente.procuraCliente(cpfCliente),
												fachada.medico.procurarMedico(crm),
												fachada.funcionario.procuraFuncionarioAdministrativo(cpfAdministrativo),
												fachada.funcionario.procuraFuncionarioEnfermagem(cpfEnfermagem),
												fachada.exame.procuraExame(codExame));

		listaVendas.inserirVenda(novaVenda);

	}catch (InsertException e){
	throw new InsertException("Error - O Venda não foi cadastrado com sucesso");
	}catch (NullPointerException e){
	throw new NullPointerException("Error - por favor, cadastre um Venda válido");
	}

	}
public Venda procuraVenda(int cod) throws SearchException,NullPointerException{
	try {

		Venda venda = new Venda(cod);
		venda = listaVendas.buscaVenda(venda);
		return venda;
	}catch (SearchException e){
	throw new SearchException("Error - O Venda não foi encontrado");
	}catch (NullPointerException e){
	throw new NullPointerException("Error - por favor, informe todos os dados.");
	}
	}
public void removeVenda(int cod) throws SearchException,NullPointerException{
	try {
		Venda venda = new Venda(cod);
		listaVendas.excluiVenda(venda);
	}catch (SearchException e){
	throw new RemoveException("Error - Não conseguimos remover o Venda");
	}catch (NullPointerException e){
	throw new NullPointerException("Error - por favor, informe todos os dados.");
	}

	}

public ArrayList<Venda> ListarTodos(){
	return listaVendas.listarVenda();
	}

}
