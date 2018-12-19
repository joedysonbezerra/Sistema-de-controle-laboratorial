package view;

import controller.Fachada;

import javax.swing.*;

import base.Venda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VendaView extends JFrame {
	JButton cadastrar = new JButton("Cadastrar");
	JButton buscar = new JButton("Buscar");
	JButton excluir = new JButton("Excluir");
	JButton listar = new JButton("Listar");

	VendaView(Fachada fachada){

		formaLayout();

		cadastrar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarVendaView novaVendaCadastrarView = new CadastrarVendaView(fachada);
			}
		});

		buscar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarVendaView novaBuscarVendaView = new BuscarVendaView(fachada);
			}
		});

		excluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExcluirVendaView novaExcluirVendaView = new ExcluirVendaView(fachada);
			}
		});

		listar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Venda> Vendas = fachada.venda.ListarTodos();
				for(int i = 0; i < Vendas.size(); i++){
					System.out.println(Vendas.get(i).cliente.getNome() +" " + Vendas.get(i).medico.getNome() +" " + Vendas.get(i).exame.getNome() );
			  }
			}
		});

		this.inicializarCores();
		this.setTitle("Venda");
		this.setSize(700, 300);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	void inicializarCores(){
		cadastrar.setForeground(Color.WHITE);
		excluir.setForeground(Color.WHITE);
		buscar.setForeground(Color.WHITE);
		listar.setForeground(Color.WHITE);
		excluir.setBackground(new Color(255,23,68));
		cadastrar.setBackground(new Color(0,176,255));
		buscar.setBackground(new Color(0,230,118));
		listar.setBackground(new Color(255,196,0));
	}

	void formaLayout() {
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(1, 4, 2, 2));
		pane.add(cadastrar);
		pane.add(buscar);
		pane.add(excluir);
		pane.add(listar);
	}
}
