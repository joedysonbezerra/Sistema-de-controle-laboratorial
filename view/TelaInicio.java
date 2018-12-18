package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaInicio extends JFrame {
	JButton cliente = new JButton("Cliente");
	JButton exame = new JButton("Exame");
	JButton medico = new JButton("Médico");
	JButton funcionario = new JButton("Funcionário");
	JButton venda = new JButton("Venda");
	JButton sair = new JButton("Sair");


	public TelaInicio() {
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(2,3));
		pane.add(cliente);
		pane.add(exame);
		pane.add(medico);
		pane.add(funcionario);
		pane.add(venda);
		pane.add(sair);

		cliente.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteView novaClienteView = new ClienteView();
			}
		});

		exame.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExameView novaExameView = new ExameView();
			}
		});

		medico.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedicoView novaMedicoView = new MedicoView();
			}
		});

		venda.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendaView novaVendaView = new VendaView();
			}
		});

		sair.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});



		this.setTitle("BioTech");
		this.inicializarCores();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 300);
		this.setVisible(true);
	}

	void inicializarCores(){
		cliente.setForeground(Color.WHITE);
		exame.setForeground(Color.WHITE);
		medico.setForeground(Color.WHITE);
		funcionario.setForeground(Color.WHITE);
		venda.setForeground(Color.WHITE);
		sair.setForeground(Color.WHITE);
		cliente.setBackground(new Color(255,23,68));
		exame.setBackground(new Color(0,176,255));
		medico.setBackground(new Color(0,230,118));
		funcionario.setBackground(new Color(255,145,0));
		venda.setBackground(new Color(255,196,0));
		sair.setBackground(new Color(1,1,1));
	}
}
