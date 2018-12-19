package view;

import base.Medico;
import controller.Fachada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MedicoView extends JFrame {
	JButton cadastrar = new JButton("Cadastrar");
	JButton buscar = new JButton("Buscar");
	JButton excluir = new JButton("Excluir");
	JButton listar = new JButton("Listar");

	MedicoView(Fachada fachada){

		formaLayout();

		cadastrar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarMedicoView novaMedicoCadastrarView = new CadastrarMedicoView(fachada);
			}
		});

		buscar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarMedicoView novaBuscarMedicoView = new BuscarMedicoView(fachada);
			}
		});

		excluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExcluirMedicoView novaExcluirMedicoView = new ExcluirMedicoView(fachada);
			}
		});

		listar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Medico> medicos = fachada.medico.ListarTodos();
				for(int i = 0; i < medicos.size(); i++){
					System.out.println(medicos.get(i).getNome());
				}
			}
		});

		this.inicializarCores();
		this.setTitle("Medico");
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
