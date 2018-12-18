package view;

import controller.Fachada;

import javax.swing.*;

public class VendaView extends JFrame {

	VendaView(Fachada fachada){
		this.setTitle("Venda");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 300);
		this.setVisible(true);
	}
}
