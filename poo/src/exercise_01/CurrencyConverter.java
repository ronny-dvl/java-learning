package exercise_01;

public class CurrencyConverter {

    //Variavel estatica pois não há mudança
    public static final double IOF = 0.06;

    public static double convertToReais(double dollarPrice, double dollarQuantity){
        return dollarPrice * dollarQuantity * (1 + IOF);
    }


}
