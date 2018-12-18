package view;

import controller.Fachada;

import javax.swing.*;

public class ExameView extends JFrame {

	ExameView(Fachada fachada){
		this.setTitle("Cliente");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 300);
		this.setVisible(true);
	}
}
