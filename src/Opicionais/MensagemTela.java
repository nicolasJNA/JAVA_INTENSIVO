package Opicionais;
import javax.swing.JOptionPane;

public class MensagemTela {
	public static void main (String [] args) {
	
	String valor = JOptionPane.showInputDialog("Digite um numero");
		int num = Integer.parseInt(valor);
	String valor2 = JOptionPane.showInputDialog("Digite outro numero");
		int num2 = Integer.parseInt(valor2);
	//usada para GUI, o null faz que a caixa de texto seja centralizada
	String mensagem = String.format("%s %d+ %d=%d","O resultado da soma de",num,num2,num+num2);
		
		JOptionPane.showMessageDialog(null,mensagem);
}
	}
