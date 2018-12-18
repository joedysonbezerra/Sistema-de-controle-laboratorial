package view;

import controller.Fachada;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastrarClienteView extends JFrame {

	JLabel cpf = new JLabel("CPF: ");
	JLabel nome = new JLabel("Nome: ");
	JLabel idade = new JLabel("Idade: ");
	JLabel sexo = new JLabel("Sexo: ");
	JLabel estado = new JLabel("Estado: ");
	JLabel cidade = new JLabel("Cidade: ");
	JLabel bairro = new JLabel("Bairro: ");
	JLabel rua = new JLabel("Rua: ");
	JLabel cod = new JLabel("Codigo: ");
	JLabel planodesaude = new JLabel("Plano De Saúde: ");


	JTextField campoCpf = new JTextField(30);
	JTextField campoNome = new JTextField(30);
	JTextField campoIdade = new JTextField(30);
	JTextField campoSexo = new JTextField(30);
	JTextField campoEstado = new JTextField(30);
	JTextField campoCidade = new JTextField(30);
	JTextField campoBairro = new JTextField(30);
	JTextField campoRua = new JTextField(30);
	JTextField campoCod = new JTextField(30);
	JTextField campoPlanodesaude = new JTextField(30);

	JButton enviar = new JButton("Enviar");

	public CadastrarClienteView(Fachada fachada){

		formaLayout();

		this.setTitle("Cadastrar Cliente");
		this.setSize(700, 450);
		this.setVisible(true);
		setLocationRelativeTo(null);


		enviar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.cliente.cadastrarCliente(campoCpf.getText(),campoNome.getText(),
					Integer.valueOf(campoIdade.getText()),campoSexo.getText(),
					campoEstado.getText(),campoCidade.getText(),campoBairro.getText(),
					campoRua.getText(),Integer.valueOf(campoCod.getText()),
					campoPlanodesaude.getText());
					System.out.println("Cadastrado com Sucesso o cliente" + campoNome.getText());
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

		pane.add(cpf);
		pane.add(campoCpf);
		pane.add(nome);
		pane.add(campoNome);
		pane.add(idade);
		pane.add(campoIdade);
		pane.add(sexo);
		pane.add(campoSexo);
		pane.add(estado);
		pane.add(campoEstado);
		pane.add(cidade);
		pane.add(campoCidade);
		pane.add(bairro);
		pane.add(campoBairro);
		pane.add(rua);
		pane.add(campoRua);
		pane.add(cod);
		pane.add(campoCod);
		pane.add(planodesaude);
		pane.add(campoPlanodesaude);
		center.add(pane);
		merge.setLayout(new BoxLayout(merge, BoxLayout.Y_AXIS));
		merge.add(center);
		merge.add(enviar);


		enviar.setBackground(new Color(1,1,1));
		enviar.setForeground(Color.WHITE);

		this.add(merge);
	}
}
