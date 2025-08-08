package IntroduçãoBasica;
import java.util.Scanner;

public class Calculadora {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira dois inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%n%s%d%n","O valor da soma é ",+a+b);
		System.out.printf("%s%d%n","O valor da subtação é ",+a-b);
		System.out.printf("%s%d%n","O valor da multiplicação é ",+a*b);
		System.out.printf("%s%.3f%n","O valor da divisão é ",+ (float)a/b);
		System.out.printf("%s%d%n","O valor da resto é ",+a%b);
	}
}
