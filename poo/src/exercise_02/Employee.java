package exercise_02;

public class Employee {
    public String name;
    public double Grosssalary;
    public double tax;

    public double netSalary(){
        return Grosssalary - tax;
    }

    public void increaseSalary (double porcentage){
        this.Grosssalary = (Grosssalary * porcentage / 100) + netSalary();

    }
    public String toString(){
        return "Employee: "
                + name
                + ", $ "
                + String.format("%.2f" , netSalary());

    }


}
