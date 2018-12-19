package base;

import java.util.Date;

public class Venda {
	int cod;
	Date Atendimento;
	Cliente cliente;
	Medico medico;
	Exame exame;
	Administrativo administrativo;
	Enfermagem enfermagem;
	private static int sequence = 0;

	public Venda(int pCod){
		this.cod = pCod;
	}

	public Venda(Cliente pCliente, Medico pMedico, Administrativo pAdministrativo, Enfermagem pEnfermagem, Exame pExame) {
		this.cod = sequence;
		this.Atendimento = new Date();
		this.cliente = pCliente;
		this.medico = pMedico;
		this.administrativo = pAdministrativo;
		this.enfermagem = pEnfermagem;
		this.exame = pExame;
		sequence++;
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
