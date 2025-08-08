package Bancaria;

public class TesteConta {
	public static void main(String[] args) {
	ContaBancaria conta1 = new ContaBancaria("nicolas",100);
	ContaBancaria conta2 = new ContaBancaria("caleb",200);
	
	System.out.printf("%s%s%s%.2f","Cliente: ",conta1.getNome(),"\tSaldo: R$",conta1.getSaldo());
	System.out.printf("%s%s%s%.2f","\nCliente: ",conta2.getNome(),"\t\tSaldo: R$",conta2.getSaldo());
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("\n\nValor do seu deposito na conta 1: ");
	double deposito = sc.nextDouble();
	conta1.deposito(deposito);
	System.out.println("Valor do seu deposito na conta 2: ");
	deposito = sc.nextDouble();
	conta2.deposito(deposito);
	
	System.out.printf("%s%s%s%.2f","Conta de ",conta1.getNome(),"\tSaldo: R$",conta1.getSaldo());
	System.out.printf("%s%s%s%.2f","\nConta de ",conta2.getNome(),"\t\tSaldo: R$",conta2.getSaldo());
}
}
