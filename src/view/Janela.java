package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CalculoFrete;
import controller.Postagem;
import model.Dimensao;
import model.Enderecamento;
import enums.Tipo;

import enums.Tipo;

public class Janela implements ActionListener {
	
	
//	Label do destinatario
	JLabel lblDestinatario = new JLabel("Destinatario");
	JLabel lblBlank = new JLabel("-----------------");
	JLabel lblNomeDestinatario = new JLabel ("Nome Destinatario: ");
	JLabel lblCepDestinatario = new JLabel ("CEP Destinatario: ");
	JLabel lblNumeroDestinatario = new JLabel("Nº Destinatario: ");
	
//	Caixa de texto do destinatario
	JTextField txtNomeDestinatario = new JTextField(10);
	JTextField txtCepDestinatario = new JTextField(10);
	JTextField txtNumeroDestinatario = new JTextField(10);
	
//	Label do remetente
	JLabel lblRemetente = new JLabel("Remetente");
	JLabel lblBlank2 = new JLabel("-----------------");
	JLabel lblNomeRemetente = new JLabel  ("Nome Remetente: ");
	JLabel lblCepRemetente = new JLabel   ("CEP Remetente: ");
	JLabel lblNumeroRemetente = new JLabel("Nº Remetente: ");

//	Caixa de texte do remetente	
	JTextField txtNomeRemetente = new JTextField(10);
	JTextField txtCepRemetente = new JTextField(10);
	JTextField txtNumeroRemetente = new JTextField(10);
	
//	Label Pacote	
	JLabel lblPacote = new JLabel("Pacote");
	JLabel lblBlank3 = new JLabel("-----------------");
	JLabel lblAltura = new JLabel("Altura: ");
	JLabel lblLargura = new JLabel("Largura: ");
	JLabel lblProfundidade = new JLabel("Profundidade: ");
	JLabel lblPeso = new JLabel("Peso: ");

//	Caixa de texto do pacote
	JTextField txtAltura = new JTextField(10);
	JTextField txtLargura = new JTextField(10);
	JTextField txtProfundidade = new JTextField(10);
	JTextField txtPeso = new JTextField(20);
	
	
	
	
	JLabel lblTipo = new JLabel("Tipo de postagem: ");
	JComboBox cmbTipo = new JComboBox<>(Tipo.values());
	JButton btnCalcular = new JButton("Calcular");
	JButton btnCancelar = new JButton("Cancelar");

	JFrame janela = new JFrame("Calculo de postagem");
	JPanel painel = new JPanel(new GridLayout(0, 2));
	
	public void janela () {
		
//		Adicionando o Destinatario
		painel.add(lblDestinatario);
		painel.add(lblBlank);
		painel.add(lblNomeDestinatario);
		painel.add(txtNomeDestinatario);
		painel.add(lblCepDestinatario);
		painel.add(txtCepDestinatario);
		painel.add(lblNumeroDestinatario);
		painel.add(txtNumeroDestinatario);
		
//		Adicionando o remetente
		painel.add(lblRemetente);
		painel.add(lblBlank2);
		painel.add(lblNomeRemetente);
		painel.add(txtNomeRemetente);
		painel.add(lblCepRemetente);
		painel.add(txtCepRemetente);
		painel.add(lblNumeroRemetente);
		painel.add(txtNumeroRemetente);
		
//		Infos do pacote
		painel.add(lblPacote);
		painel.add(lblBlank3);
		painel.add(lblAltura);
		painel.add(txtAltura);
		painel.add(lblLargura);
		painel.add(txtLargura);
		painel.add(lblProfundidade);
		painel.add(txtProfundidade);
		painel.add(lblPeso);
		painel.add(txtPeso);
		
		painel.add(lblTipo);
		painel.add(cmbTipo);
		painel.add(btnCalcular);
		painel.add(btnCancelar);
		btnCalcular.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		janela.setContentPane(painel);
		janela.setSize(300, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("Calcular".equals(e.getActionCommand()) ) {
			Enderecamento destinatario = new Enderecamento(txtNomeDestinatario.getText(), (Integer.parseInt(txtCepDestinatario.getText())), (Integer.parseInt(txtNumeroDestinatario.getText())));
			Enderecamento remetente = new Enderecamento(txtNomeRemetente.getText(), (Integer.parseInt(txtCepRemetente.getText())), (Integer.parseInt(txtNumeroRemetente.getText())));
			Dimensao dimensao = new Dimensao((Double.parseDouble(txtAltura.getText())), (Double.parseDouble(txtLargura.getText())), (Double.parseDouble(txtProfundidade.getText())));
			int peso = Integer.parseInt(txtPeso.getText());
			Postagem post = new Postagem(remetente, destinatario);
			Tipo tipoEscolhido = Tipo.valueOf(cmbTipo.getSelectedItem().toString());
			CalculoFrete calc = new CalculoFrete(post.calcDistancia(), peso, dimensao, tipoEscolhido);
			JOptionPane.showMessageDialog(null, "O valor do Frente é: " + calc.calcularFrete());
		} else  {
			janela.dispose();
		}
		
	}
	
}
