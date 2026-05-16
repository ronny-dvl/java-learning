package exercise_04;

public class Funcionarios {
    public String name;
    public double salary;

    public void increaseSalary(double porcentage){
        double increase = salary * (porcentage/100);
        salary += increase;

    }
    public double annualSalary(){
        return salary * 12;
    }

    public static double tax(double salary){
        if (salary <= 3000.00){
            return salary *= 0.10;
        } else if (salary <= 6000.00) {
            return salary *= 0.15;
        } else{
            return salary *= 0.20;
        }

    }

    public String toString() {
        return String.format(
                "\nSalary: %.2f%nAnnual total: %.2f",
                salary,
                annualSalary());

    }
}
