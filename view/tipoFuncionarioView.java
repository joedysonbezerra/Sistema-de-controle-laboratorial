package view;

import controller.Fachada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class tipoFuncionarioView extends JFrame {
	JButton administrativo = new JButton("Administrativo");
	JButton enfermeiro = new JButton("Enfermeiro");


	tipoFuncionarioView(Fachada fachada){

		formaLayout();

		administrativo.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdministrativoView novaAdministrativoView = new AdministrativoView(fachada);
			}
		});

		enfermeiro.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnfermagemView novaEnfermagemView = new EnfermagemView(fachada);
			}
		});

		this.inicializarCores();
		this.setTitle("Tipo de Funcionário");
		this.setSize(700, 300);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	void inicializarCores(){
		administrativo.setForeground(Color.WHITE);
		enfermeiro.setForeground(Color.WHITE);
		administrativo.setBackground(new Color(255,23,68));
		enfermeiro.setBackground(new Color(0,176,255));
	}

	void formaLayout() {
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(1, 4, 2, 2));
		pane.add(administrativo);
		pane.add(enfermeiro);
	}
}
