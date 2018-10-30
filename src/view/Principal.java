package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import controller.CalculoFrete;
import controller.Postagem;
import model.Dimensao;
import model.Enderecamento;
import enums.Tipo;

public class Principal {

	Tipo tipoEscolhido;

	public static void main(String[] args) {
//		Principal p = new Principal();
//		Enderecamento destinatario;
//		Enderecamento remetente;
//		Dimensao dimensao;
//		CalculoFrete calc;
//		int peso;
//		Tipo tipo;
//
//		destinatario = p.parte("Destinatario");
//		remetente = p.parte("Remetente");
//
//		dimensao = new Dimensao(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")),
//				Double.parseDouble(JOptionPane.showInputDialog("Digite a largura")),
//				Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade")));
//		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso"));
//
//		Postagem post = new Postagem(remetente, destinatario);
//
//		tipo = p.selecionaOpc();
//		
//
//		calc = new CalculoFrete(post.calcDistancia(), peso, dimensao, tipo);
//
//		JOptionPane.showMessageDialog(null, "O valor do Frente é: " + calc.calcularFrete());
		Janela janela = new Janela();
		janela.janela();

	}

	public Tipo selecionaOpc() {

		JButton btnOk = new JButton("OK");
		JComboBox cmbTipo = new JComboBox<>(Tipo.values());

		cmbTipo.setEditable(true);

		Object[] options = new Object[] {};
		JOptionPane escolhaTipo = new JOptionPane("Escolha o tipo", JOptionPane.QUESTION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, options, null);

		escolhaTipo.add(cmbTipo);
		escolhaTipo.add(btnOk);

		JDialog janela = new JDialog();
		janela.getContentPane().add(escolhaTipo);
		janela.pack();
		janela.setVisible(true);
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tipoEscolhido = Tipo.valueOf(cmbTipo.getSelectedItem().toString());
				janela.dispose();
			}
		});

		return tipoEscolhido;

	}

	public Enderecamento parte(String tipo) {
		Enderecamento parte = new Enderecamento(JOptionPane.showInputDialog("Digite nome do " + tipo),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP do " + tipo)),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do " + tipo)));
		return parte;
	}

}
