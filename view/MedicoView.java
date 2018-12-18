package view;

import controller.Fachada;

import javax.swing.*;

public class MedicoView extends JFrame {

	MedicoView(Fachada fachada){
		this.setTitle("Medico");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 300);
		this.setVisible(true);
	}
}
