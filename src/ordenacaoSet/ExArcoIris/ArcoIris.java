package ordenacaoSet.ExArcoIris;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {

        //Crie um conjunto contendo as cores do arco-íris

        System.out.println("\n#################################################################################\n");

        System.out.println("Exiba todas as cores uma embaixo da outra\n\n");
        Set<String> cores = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        System.out.println(cores.toString());

        Iterator<String> iterator = cores.iterator();

        while (iterator.hasNext()) {

            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("\n#################################################################################\n");

        System.out.println("O tamanho da lista tem o total de  " + cores.size() + " cores");

        System.out.println("\n#################################################################################\n");

        System.out.println("\nExiba as cores por ordem alfabetica\n\n");

        Set<String> cores1 = new TreeSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        System.out.println(cores1 + " inicio");

        Iterator<String> iterator1 = cores1.iterator();

        while (iterator1.hasNext()) {

            String next = iterator1.next();
            System.out.println(next);
        }
        ;

        System.out.println("\n#################################################################################\n");

        System.out.println("\nExiba a lista na ordem inversa\n");


        Set<String> cores2 = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        List inverse = new ArrayList(cores);
        Collections.sort(inverse, Collections.reverseOrder());
        Set core = new LinkedHashSet(inverse);
        System.out.println(core);
        System.out.println("Preciso terminar o exercicio");

        System.out.println("\n#################################################################################\n");
        System.out.println("Exiba todas as cores que começam com a letra ”v”");


        Set<String> cores3 = new TreeSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        Iterator<String> iterator3 = cores3.iterator();

        while (iterator3.hasNext()) {
            String proximo = iterator3.next();
            if (proximo.contains("V")){
                System.out.println(proximo);
            }else {
                iterator3.remove();
            }

        }

        System.out.println(cores3);

        cores1.clear();
        System.out.println("O conjunto cores1 esta vazio: "+ cores1.isEmpty());


    }
}
/*
class  CorArco implements Comparable<CorArco>{

    private String cor;

    public CorArco(String cor) {
        this.cor = cor;
    }

    @Override
    public int compareTo(CorArco o) {
        return getCor();
    }


    public String getCor() {
        return cor;
    }

    //toString e para nao lancar a localizacao da memoria e sim o nome que esta dentro da memoria
    @Override
    public String toString() {
        return "CorArco{" +
                "cor='" + cor + '\'' +
                '}';
    }


}


*/