package exercise_11;

public class FixacaoVetorObject {

    private String name;
    private int idade;
    private double altura;

    public FixacaoVetorObject(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

}
