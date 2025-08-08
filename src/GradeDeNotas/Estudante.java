package GradeDeNotas;

public class Estudante {
    private String name;
    private double average;

    // Construtor inicializa variáveis de instância
    public Estudante(String name, double average) {
        this.name = name;
        
        // Valida que a média é > 0.0 e <= 100.0
        if (average >= 0.0 && average <= 100.0) {
            this.average = average;
        } else {
            this.average = 0.0; // Valor padrão se inválido
        }
    }

    // Define o nome do Student
    public void setName(String name) {
        this.name = name;
    }

    // Recupera o nome do Student
    public String getName() {
        return name;
    }

    // Define a média do Student
    public void setAverage(double average) {
        // Valida que a média é > 0.0 e <= 100.0
        if (average > 0.0 && average <= 100.0) {
            this.average = average;
        }
        // Se inválido, mantém o valor atual
    }

    // Recupera a média do Student
    public double getAverage() {
        return average;
    }

    // Determina e retorna a letra da nota do Student
    public String getLetterGrade() {
        if (average >= 90.0) {
            return "A";
        } else if (average >= 80.0) {
            return "B";
        } else if (average >= 70.0) {
            return "C";
        } else if (average >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }
}