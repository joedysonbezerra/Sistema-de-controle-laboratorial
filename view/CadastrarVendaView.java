package view;


import controller.Fachada;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CadastrarVendaView extends JFrame {

	JLabel cpfCliente = new JLabel("Cpf - Cliente: ");
	JLabel crm = new JLabel("Crm: ");
	JLabel cpfAdministrativo = new JLabel("Cpf - Administrativo: ");
	JLabel cpfEnfermeiro = new JLabel("Cpf - Enfermeiro: ");
	JLabel codExame = new JLabel("Cod - Exame: ");

	JTextField campoCpfCliente = new JTextField(30);
	JTextField campoCrm = new JTextField(30);
	JTextField campoCpfAdministrativo = new JTextField(30);
	JTextField campoCpfEnfermeiro = new JTextField(30);
	JTextField campoCodExame = new JTextField(30);

	JButton enviar = new JButton("Enviar");

	public CadastrarVendaView(Fachada fachada){

		formaLayout();

		this.setTitle("Cadastrar Venda");
		this.setSize(700, 450);
		this.setVisible(true);
		setLocationRelativeTo(null);


		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.venda.cadastrarVenda(fachada,campoCpfCliente.getText(),
					campoCrm.getText(),campoCpfAdministrativo.getText(),campoCpfEnfermeiro.getText(),
					Integer.valueOf(campoCodExame.getText()));
					JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso o Venda", "Cadastrado", JOptionPane.PLAIN_MESSAGE);
					System.out.println("Cadastrado com Sucesso o Venda");
				} catch (Exception error) {
					JOptionPane.showMessageDialog(null, error.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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

		pane.add(cpfCliente);
		pane.add(campoCpfCliente);
		pane.add(crm);
		pane.add(campoCrm);
		pane.add(cpfAdministrativo);
		pane.add(campoCpfAdministrativo);
		pane.add(cpfEnfermeiro);
		pane.add(campoCpfEnfermeiro);
		pane.add(codExame);
		pane.add(campoCodExame);

		center.add(pane);
		merge.setLayout(new BoxLayout(merge, BoxLayout.Y_AXIS));
		merge.add(center);
		merge.add(enviar);


		enviar.setBackground(new Color(1,1,1));
		enviar.setForeground(Color.WHITE);

		this.add(merge);
	}
}
