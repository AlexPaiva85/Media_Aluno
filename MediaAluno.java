package treinando;

import javax.swing.JOptionPane;

public class MediaAluno {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Qual a sua nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a sua nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a sua nota 3?");
		String nota4 = JOptionPane.showInputDialog("Qual a sua nota 4?");

		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		double media = 0;

		media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;

		if (media <= 7) {
			if (media >= 6) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média de: " + media);
			}
		} else
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de " + media);
	
	}
}


