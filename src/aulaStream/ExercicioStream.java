package aulaStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExercicioStream {
    public static void main(String[] args) {


    List <String> list = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima tods dos item da lista\n");

      /*  list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //outra maneira de impimir os numeros
       // System.out.println("Refatorando o codigo usando modo mais simplificado...olhe o codigo e vai entendeer");
       // list.forEach( s-> System.out.println(s));
        //outra forma de mostrar os numeros

        // System.out.println("Refatorando o codigo usando modo mais simplificado...olhe o codigo e vai entendeer");

        //list.stream().forEach( s-> System.out.println(s));
        System.out.println("Refatorando o codigo usando modo mais simplificado...olhe o codigo e vai entendeer. existem outros meetodos acima dessa linha");

        list.forEach(System.out::println);


        System.out.println("###########################################################################");

        System.out.println("Pegue os cinco primeiro numero e coloque debtro de um SET");

        list.stream()
                .limit(5).collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\n###########################################################################");

        System.out.println("transforme a lista em uma lista de inteiros");
       List<Integer> inteiro =  list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
               ;
/*
        System.out.println("Pegue os numeros pares e maiores do que dois");
       List<Integer> paresMaiorque2 =  list.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i%2 ==0 && i>2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());

        System.out.println(paresMaiorque2);*/

        System.out.println("Pegue os numeros pares e maiores do que dois refatorado, OLHE O CODIGO ACIMA");
        List<Integer> paresMaiorque2 =  list.stream()
                .map(Integer::parseInt)
                .filter(i -> i%2 ==0 && i>2).collect(Collectors.toList());

        System.out.println(paresMaiorque2);





        System.out.println("\n###########################################################################");

        System.out.println("Mostre a media dos numeros");

        list.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double v) {
                        System.out.println(v);
                    }
                });






    }




    }
