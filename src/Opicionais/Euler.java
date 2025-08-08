package Opicionais;


public class Euler {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		float fatorado = 1;
		float e = 1;
		System.out.print("Indice: ");
		int numero = input.nextInt();

		for (int a = numero; a > 1; a--) {
			int aux = a;
			while (aux > 1) {
				fatorado *= aux;
				aux--;
			}
			e += 1/(fatorado);
			fatorado = 1;
		}
		System.out.printf("%s%.10f","Eulier: ", e);
	}
}
