package setSingularidade;

import java.util.*;

public class Set {

    public static void main(String[] args) {

        System.out.println("Crie uma lista com Hashset e adicione nota");

        java.util.Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8d, 8d, 0d, 4d, 5d, 9.5d));
        System.out.println(notas.toString());
        System.out.println("\n#######################################################################################\n");

        System.out.println("Exiba a posicao da nota 5");

        System.out.println("\n#######################################################################################\n");
        System.out.println("Usando o metodo set, nao e possivel determinar a posicao poque esse metodo se comporta de maneira aleatoria");
        System.out.println("\n#######################################################################################\n");
        System.out.println("Nao e possivel substituit uma posicao, adicionar numa determinada posicao");

        System.out.println("\n#######################################################################################\n");
        System.out.println("Confira se a nota 5 esta dentro do conjunto");
        System.out.println(notas.contains(5d));
        System.out.println("\n#######################################################################################\n");
        System.out.println("Exiba a menor nota" + Collections.min(notas));

        System.out.println("\n#######################################################################################\n");
        System.out.println("Exibir soma dos elementos, use o iterator");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {

            Double next = iterator.next();
            soma += next;

        }
        System.out.println(soma);
        System.out.println("\n#######################################################################################\n");
        System.out.println("Exiba a media das notas" + soma / notas.size());
        System.out.println("\n#######################################################################################\n");
        System.out.println("remova a nota zera");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("nao e possivel remover posicao");
        System.out.println("\n#######################################################################################\n");
        System.out.println("remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();


        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 8) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("\n#######################################################################################\n");
        System.out.println("Exiba todas notas na ordem em que foram lancadas");

        java.util.Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8d);
        notas2.add(8d);
        notas2.add(0d);
        notas2.add(4d);
        notas2.add(5d);
        notas2.add(9.5d);
        System.out.println(notas2);
        System.out.println("\n#######################################################################################\n");


        System.out.println("Mostre as notas em ordem crescente");
        //TReeSet organiza pela ordem natural
        java.util.Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\n#######################################################################################\n");
        System.out.println("Apague todo conjunto");
        notas.clear();
        System.out.println(notas.isEmpty());



    }
}
