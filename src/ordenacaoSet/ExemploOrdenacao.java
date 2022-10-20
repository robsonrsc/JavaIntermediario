package ordenacaoSet;

import java.util.*;

public class ExemploOrdenacao {
    public static void main(String[] args) {

        System.out.println("\n##################################################################\n");
        System.out.println("Mostrar itens em ordem aleatoria");

        Set <Series> minhasSeries = new HashSet<>(){{

            add(new Series("O perigo moora ao lado","Drama",25));
            add(new Series("O perigo moora ao lado","ANime",120));
            add(new Series("Dark","Sci-Fi",90));

        }};
        System.out.println(minhasSeries);

        for (Series serie:minhasSeries) System.out.println(serie.getNome() +" - " + serie.getGenero()+
                " - " +serie.getTempo() + "minuto");


        System.out.println("\n##################################################################\n");

        System.out.println("\nInserir series na ordem que foram lancadas: ");

        Set <Series> minhasSeries1 = new LinkedHashSet<>(){{

            add(new Series("O perigo moora ao lado","Drama",25));
            add(new Series("Cavaleiros do Zodiaco","ANime",120));
            add(new Series("Dark","Sci-Fi",90));

        }};
        for (Series serie:minhasSeries) System.out.println("\n" + serie.getNome() +" - " + serie.getGenero()+
                " - " +serie.getTempo() + "minuto\n");

        System.out.println(minhasSeries);
        System.out.println("\n##################################################################\n");


        System.out.println("Exiba as series na ordem natural tempo de episodio");
        Set<Series> minhasseries2 = new TreeSet<>(minhasSeries1);
        for (Series serie:minhasseries2) System.out.println("\n" + serie.getNome() +" - " + serie.getGenero()+
                " - " +serie.getTempo() + "minuto\n");

        System.out.println("\n##################################################################\n");


        System.out.println("Vamos compara por nome/genero/tempo de episodio\n");

        Set<Series> minhasseries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasseries3.addAll(minhasSeries);
        for (Series serie:minhasseries3) System.out.println("\n" + serie.getNome() +" - " + serie.getGenero()+
                " - " +serie.getTempo() + "minuto\n");
        System.out.println(minhasseries3);

















    }
}










class Series implements Comparable<Series>{
    private String nome;
    private String genero;
    private  int tempo;

    Series(String nome, String genero, int tempo) {
        this.nome = nome;
        this.genero = genero;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return tempo == series.tempo && nome.equals(series.nome) && genero.equals(series.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempo);
    }

    @Override
    public int compareTo(Series serie) {

        int tempoEpisodio = Integer.compare(this.getTempo(), serie.getTempo());
        if (tempoEpisodio!=0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
     }
}

class ComparatorNomeGeneroTempo implements  Comparator<Series>{


    @Override
    public int compare(Series o1, Series o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome !=0) return nome;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if (genero!=0) return genero;

        return Integer.compare(o1.getTempo(), o2.getTempo());

    }
}