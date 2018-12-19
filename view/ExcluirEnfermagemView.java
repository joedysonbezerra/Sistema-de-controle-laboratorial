package view;

import controller.Fachada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcluirEnfermagemView extends JFrame {
	JLabel cpf = new JLabel("CPF: ");
	JTextField campoCpf = new JTextField(30);
	JButton enviar = new JButton("Enviar");

	public ExcluirEnfermagemView(Fachada fachada) {
		JPanel pane = new JPanel();
		JPanel center = new JPanel();
		JPanel merge = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		center.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));

		pane.add(cpf);
		pane.add(campoCpf);
		center.add(pane);
		merge.setLayout(new BoxLayout(merge, BoxLayout.Y_AXIS));
		merge.add(center);
		merge.add(enviar);


		enviar.setBackground(new Color(1,1,1));
		enviar.setForeground(Color.WHITE);

		this.add(merge);
		this.setTitle("Excluir Enfermeiro(a)");
		this.setSize(350, 130);
		this.setVisible(true);
		setLocationRelativeTo(null);

		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.enfermagem.removeFuncionarioEnfermagem(campoCpf.getText());
					System.out.println("Excluido com Sucesso");

				} catch (Exception error) {
					System.out.println(error.getMessage());
				}

			}
		});
	}
}

