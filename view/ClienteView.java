package view;

import controller.Fachada;

import javax.swing.*;

import base.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ClienteView extends JFrame {
	JButton cadastrar = new JButton("Cadastrar");
	JButton buscar = new JButton("Buscar");
	JButton excluir = new JButton("Excluir");
	JButton listar = new JButton("Listar");

	ClienteView(Fachada fachada){

		formaLayout();

		cadastrar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarClienteView novaClienteCadastrarView = new CadastrarClienteView(fachada);
			}
		});

		buscar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarClienteView novaBuscarClienteView = new BuscarClienteView(fachada);
			}
		});

		excluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExcluirClienteView novaExcluirClienteView = new ExcluirClienteView(fachada);
			}
		});

		listar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				ArrayList<Cliente> clientes = fachada.cliente.ListarTodos();
				while(!clientes.isEmpty()){
					System.out.println(clientes.get(i).getNome());
					i++;
			  }
			}
		});

		this.inicializarCores();
		this.setTitle("Cliente");
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
