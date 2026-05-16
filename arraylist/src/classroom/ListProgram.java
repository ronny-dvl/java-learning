package classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListProgram {
    public static void main (String[]args){

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Maicom");
        list.add("Jose");
        list.add("Ron");
        //Add com uma condição
        list.add(2, "Marcos");

        for (String obj : list){
            System.out.println(obj);
        }

        System.out.println("------------------------");

        //remore com uma condição
        list.removeIf(x -> x == "Maria");

        for (String obj : list){
            System.out.println(obj);
        }

        System.out.println("------------------------");

        //Procura com base em um predicado lambda(sera printado somente aqueles que começam com R
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());

        for (String obj: result){
            System.out.println(obj);
        }

        System.out.println("------------------------");

        //Pega o primeiro elemento da lista que começa com R, caso não tenha retorna null
        String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);



    }
}
