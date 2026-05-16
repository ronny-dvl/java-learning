package exercise_02;

public class Student {

    public String name;
    public double nota1, nota2, nota3;

    public double calculoNota() {
        return nota1 + nota2 + nota3;
    }

    public void status() {

        if (calculoNota() >= 60) {
            System.out.println("FINAL GRADE = " + String.format("%.2f", calculoNota()) + "\nPASS");
        } else {
            double restante = 60.00 - calculoNota();
            System.out.println("FINAL GRADE = " + String.format("%.2f", calculoNota()) + "\nFAILED" + "\nMISSING " + restante + " POINTS");
        }
    }

}
