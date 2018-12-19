package view;
import base.Administrativo;
import controller.Fachada;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BuscarAdministrativoView extends JFrame {
	JLabel cpf = new JLabel("CPF: ");
	JTextField campoCpf = new JTextField(30);
	JButton enviar = new JButton("Enviar");

	public BuscarAdministrativoView(Fachada fachada){

		formaLayout();

		this.setTitle("Buscar Administrativo");
		this.setSize(350, 130);
		this.setVisible(true);
		setLocationRelativeTo(null);

		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Administrativo resultado = fachada.funcionario.procuraFuncionarioAdministrativo(campoCpf.getText());
					System.out.println(resultado.getNome() + "\n" + resultado.getSexo()+ "\n" + resultado.getIdade());

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
	}
}
