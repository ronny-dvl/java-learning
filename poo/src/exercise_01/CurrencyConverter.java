package exercise_01;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convertToReais(double dollarPrice, double dollarQuantity){
        return dollarPrice * dollarQuantity * (1 + IOF);
    }


}
