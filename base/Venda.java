package base;

import java.util.Date;

public class Venda {
	private int cod;
	private Date atendimento;
	public Cliente cliente;
	public Medico medico;
	public Exame exame;
	public Administrativo administrativo;
	public Enfermagem enfermagem;
	private static int sequence = 0;

	public Venda(int pCod){
		this.cod = pCod;
	}

	public Venda(Cliente pCliente, Medico pMedico, Administrativo pAdministrativo, Enfermagem pEnfermagem, Exame pExame) {
		this.cod = sequence;
		this.atendimento = new Date();
		this.cliente = pCliente;
		this.medico = pMedico;
		this.administrativo = pAdministrativo;
		this.enfermagem = pEnfermagem;
		this.exame = pExame;
		sequence++;
	}

	public Date getAtendimento() {
		return atendimento;
	}

	public int getCod() {
		return cod;
	}

	public boolean equals(Object o) {
		boolean valor = false;

		if(this.cod == (((Venda) o).getCod())) {
			 valor = true;
		}

		return valor;
  }
}
