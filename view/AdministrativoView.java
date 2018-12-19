package view;

import base.Administrativo;
import controller.Fachada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class AdministrativoView extends JFrame {
	JButton cadastrar = new JButton("Cadastrar");
	JButton buscar = new JButton("Buscar");
	JButton excluir = new JButton("Excluir");
	JButton listar = new JButton("Listar");

	AdministrativoView(Fachada fachada){

		formaLayout();

		cadastrar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarAdministrativoView novaAdministrativoCadastrarView = new CadastrarAdministrativoView(fachada);
			}
		});

		buscar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarAdministrativoView novaBuscarAdministrativoView = new BuscarAdministrativoView(fachada);
			}
		});

		excluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExcluirAdministrativoView novaExcluirAdministrativoView = new ExcluirAdministrativoView(fachada);
			}
		});

		listar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Administrativo> administrativos = fachada.funcionario.ListarTodosAdministrativo();
				for(int i = 0; i < administrativos.size(); i++){
					System.out.println(administrativos.get(i).getNome());
				}
			}
		});

		this.inicializarCores();
		this.setTitle("Administrativo");
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
