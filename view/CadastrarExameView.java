package view;


import controller.Fachada;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CadastrarExameView extends JFrame {

	JLabel nome = new JLabel("Nome: ");
	JLabel preco = new JLabel("Preço: ");

	JTextField campoNome = new JTextField(30);
	JTextField campoPreco = new JTextField(30);


	JButton enviar = new JButton("Enviar");

	public CadastrarExameView(Fachada fachada){

		formaLayout();

		this.setTitle("Cadastrar Exame");
		this.setSize(700, 450);
		this.setVisible(true);
		setLocationRelativeTo(null);


		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.exame.cadastrarExame(campoNome.getText(),
					Float.valueOf(campoPreco.getText()));
					System.out.println("Cadastrado com Sucesso o exame" + campoNome.getText());
				} catch (Exception error) {
					System.out.println(error.getMessage());
				}
			}
		});
	}
	void formaLayout(){
		JPanel pane = new JPanel();
		JPanel center = new JPanel();
		JPanel merge = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		center.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

		pane.add(nome);
		pane.add(campoNome);
		pane.add(preco);
		pane.add(campoPreco);

		center.add(pane);
		merge.setLayout(new BoxLayout(merge, BoxLayout.Y_AXIS));
		merge.add(center);
		merge.add(enviar);


		enviar.setBackground(new Color(1,1,1));
		enviar.setForeground(Color.WHITE);

		this.add(merge);
	}
}
