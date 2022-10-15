package Collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {

        //List notas = new ArrayList(); Metodo usado no JAVA 5
        //List<Double> notas = ArrayList<Double>();
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9d,9.5,0d));
        //List<Double> notas = Arrays.asList(7d,8.5,9d,9.5,0d); Nao e possivel inserir ou excluir itens dessa lista.
        System.out.println("Crie uma lista e adicione 7 notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8d);
        notas.add(6.8);
        notas.add(5.9);
        notas.add(8.9);
        notas.add(9d);
        notas.add(6.5);
        System.out.println(notas);

        System.out.println("Mostre emque posicao enta a nota da 6.8:" );
        System.out.println("A nota 6.8 esta na posicao:"  + notas.indexOf(6.8));

        //Insert new word in specific location
        System.out.println("Add in list the nota 8.0 in the fourth position");
        notas.add(4,8d);
        System.out.println(notas);

        //replace

        System.out.println("Replace information nota 5.9  to 8.5");

        notas.set(3,8.5);
        System.out.println(notas);

        //checking if list contain a especific nota or word

        System.out.println("Confira se a nota 5 esta na lista: " + notas.contains(5d));

        //show all notas in the exactly order that was writer.

        //System.out.println("Exiba as notas na ordem em que foi inserido");
        //for (Double nota : notas) System.out.println(nota);

        
    }
}
