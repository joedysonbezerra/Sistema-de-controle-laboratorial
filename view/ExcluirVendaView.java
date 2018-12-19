package view;

import base.Venda;
import controller.Fachada;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExcluirVendaView extends JFrame {
	JLabel cod = new JLabel("Cod: ");
	JTextField campoCod = new JTextField(30);
	JButton enviar = new JButton("Enviar");

	public ExcluirVendaView(Fachada fachada){

		formaLayout();

		this.setTitle("Excluir Venda");
		this.setSize(350, 130);
		this.setVisible(true);
		setLocationRelativeTo(null);

		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.venda.removeVenda(Integer.valueOf(campoCod.getText()));
					JOptionPane.showMessageDialog(null, "Excluido com Sucesso", "Excluido", JOptionPane.PLAIN_MESSAGE);
					System.out.println("Excluido com Sucesso");

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
		center.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));

		pane.add(cod);
		pane.add(campoCod);
		center.add(pane);
		merge.setLayout(new BoxLayout(merge, BoxLayout.Y_AXIS));
		merge.add(center);
		merge.add(enviar);


		enviar.setBackground(new Color(1,1,1));
		enviar.setForeground(Color.WHITE);

		this.add(merge);
	}
}
