package exercise_08;

public class AlunosVetor {

    private String name;
    private double nota1s;
    private double nota2s;

    public AlunosVetor(String name, double nota1s, double nota2s) {
        this.name = name;
        this.nota1s = nota1s;
        this.nota2s = nota2s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota1s() {
        return nota1s;
    }

    public double getNota2s() {
        return nota2s;
    }

    public double somaNotas(){
        return (nota1s + nota2s) / 2;
    }
}
