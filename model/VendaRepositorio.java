package model;

import base.Venda;
import util.exception.InsertException;
import util.exception.RemoveException;
import util.exception.SearchException;

import java.util.ArrayList;

public class VendaRepositorio implements VendaInterface {

	ArrayList<Venda> listaDeVendas = new ArrayList<Venda>();

	@Override
	public void inserirVenda(Venda pVenda) throws InsertException, NullPointerException {
		try {
			if(verificaVenda(pVenda)) throw new NullPointerException("BD: Venda Invalido");
			this.listaDeVendas.add(pVenda);
	  }catch (Exception e){
			throw new InsertException("BD: Venda não foi cadastrado");
	  }
	}

	@Override
	public Venda buscaVenda(Venda pVenda) throws SearchException, NullPointerException {
		if(verificaVenda(pVenda)) throw new NullPointerException("BD: Venda Invalido");

		int i = listaDeVendas.indexOf(pVenda);

		if(i >= 0) {
			 return listaDeVendas.get(i);
		}else {
			 throw new SearchException("BD: Venda não foi encontrado");
		}
	}

	@Override
	public void excluiVenda(Venda pVenda) throws RemoveException, NullPointerException {
		try {
			if(verificaVenda(pVenda)) throw new NullPointerException("BD: Venda Invalido");
			this.listaDeVendas.remove(pVenda);
	  }catch (Exception e){
			throw new RemoveException("BD: Venda não foi removido");
	  }
	}

	@Override
	public ArrayList<Venda> listarVenda() {
		return listaDeVendas;
	}

	@Override
	public boolean verificaVenda(Venda pVenda) {
		if(pVenda == null){
			return true;
	  }
	  return false;
 }
}
