package GradeDeNotas;

public class TesteEstudante {
	public static void main(String[] args) {
		Estudante estude = new Estudante("gabriel", 45);
		Estudante estude2 = new Estudante("gael", 98);
		
		System.out.printf("%s's letter grade is: %s%n", estude.getName(), estude.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n", estude2.getName(), estude2.getLetterGrade());
	}
}