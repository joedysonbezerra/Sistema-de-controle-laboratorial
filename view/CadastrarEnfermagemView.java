package view;

import controller.Fachada;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastrarEnfermagemView extends JFrame {

	JLabel cpf = new JLabel("CPF: ");
	JLabel nome = new JLabel("Nome: ");
	JLabel idade = new JLabel("Idade: ");
	JLabel sexo = new JLabel("Sexo: ");
	JLabel departamento = new JLabel("Nome Departamento: ");
	JLabel examesColetados = new JLabel("Exames Coletados: ");


	JTextField campoCpf = new JTextField(30);
	JTextField campoNome = new JTextField(30);
	JTextField campoIdade = new JTextField(30);
	JTextField campoSexo = new JTextField(30);
	JTextField campoDepartamento = new JTextField(30);
	JTextField campoExamesColetados = new JTextField(30);;

	JButton enviar = new JButton("Enviar");

	public CadastrarEnfermagemView(Fachada fachada){

		formaLayout();

		this.setTitle("Cadastrar Enfermeiro(a)");
		this.setSize(700, 450);
		this.setVisible(true);
		setLocationRelativeTo(null);


		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.funcionario.cadastrarFuncionarioEnfermagem(campoCpf.getText(),campoNome.getText(),
					Integer.valueOf(campoIdade.getText()),campoSexo.getText(),
					campoDepartamento.getText(),Integer.valueOf(campoExamesColetados.getText()));
					JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso o funcionario", "Cadastrado", JOptionPane.PLAIN_MESSAGE);
					System.out.println("Cadastrado com Sucesso o funcionario" + campoNome.getText());
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

		pane.add(cpf);
		pane.add(campoCpf);
		pane.add(nome);
		pane.add(campoNome);
		pane.add(idade);
		pane.add(campoIdade);
		pane.add(sexo);
		pane.add(campoSexo);
		pane.add(departamento);
		pane.add(campoDepartamento);
		pane.add(examesColetados);
		pane.add(campoExamesColetados);
		center.add(pane);
		merge.setLayout(new BoxLayout(merge, BoxLayout.Y_AXIS));
		merge.add(center);
		merge.add(enviar);


		enviar.setBackground(new Color(1,1,1));
		enviar.setForeground(Color.WHITE);

		this.add(merge);
	}
}
