package ordenacaoSet;

import java.util.Objects;

public class ExemploOrdenacao {
    public static void main(String[] args) {


    }
}

class Series {
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
}