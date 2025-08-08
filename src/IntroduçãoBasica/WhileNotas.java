package IntroduçãoBasica;

public class WhileNotas {
public static void main(String[] args) {
	float media = 0;
	int cont = 1;
	//nome de classe completamente qualificado
	java.util.Scanner sc = new java.util.Scanner(System.in);
	while (cont < 11){
		System.out.printf("%dº %s:",cont,"grade ");
		float nota = sc.nextInt();
		if (nota >100 || nota<0) {
			continue;
		}
		media += nota;
		cont++;
	}
	System.out.printf("%s: %f","The average is: ",media/cont);
}
}
