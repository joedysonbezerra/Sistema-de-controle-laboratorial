package controller;

public class Fachada {
	public ClienteController cliente;
	public ExameController exame;
	public FuncionarioController funcionario;
	public MedicoController medico;
	public VendaController venda;

	public Fachada() {
		this.cliente = new ClienteController();
		this.exame = new ExameController();
		this.funcionario = new FuncionarioController();
		this.medico = new MedicoController();
		this.venda = new VendaController();
	}
}
