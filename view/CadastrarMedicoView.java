package view;

import controller.Fachada;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastrarMedicoView extends JFrame {

	JLabel crm = new JLabel("Crm: ");
	JLabel nome = new JLabel("Nome: ");



	JTextField campoCrm = new JTextField(30);
	JTextField campoNome = new JTextField(30);

	JButton enviar = new JButton("Enviar");

	public CadastrarMedicoView(Fachada fachada){

		formaLayout();

		this.setTitle("Cadastrar Medico");
		this.setSize(700, 450);
		this.setVisible(true);
		setLocationRelativeTo(null);


		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.medico.cadastrarMedico(campoCrm.getText(),campoNome.getText());
					JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso o Medico", "Cadastrado", JOptionPane.PLAIN_MESSAGE);
					System.out.println("Cadastrado com Sucesso o medico " + campoNome.getText());
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

		pane.add(crm);
		pane.add(campoCrm);
		pane.add(nome);
		pane.add(campoNome);
		center.add(pane);
		merge.setLayout(new BoxLayout(merge, BoxLayout.Y_AXIS));
		merge.add(center);
		merge.add(enviar);


		enviar.setBackground(new Color(1,1,1));
		enviar.setForeground(Color.WHITE);

		this.add(merge);
	}
}
