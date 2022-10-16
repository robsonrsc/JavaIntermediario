package Collections;


/*dada as seguintes informacoes sobre gatos, crie uma lista ordenada com (nome - idade e cor)*/

    /*
    gato 1 = nome: Jon, idade: 18, cor: azul
    gato 2 = nome: simba. idade: 6, cor: tigrado
    gato 3 = nome: Jon, idade: 12, cor: amarelo Calvalcante, Today * new Class
     */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula2 {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("\t--- Ordem de insercao---\t");
        System.out.println(meusGatos);

        System.out.println("\t ----Ordem aleatoria -----\t");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\t ---- Ordem natural ---- \t");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
    }


}

class Gato implements Comparable<Gato>{


    private String nome;
    private Integer idade;
    private String cor;



    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
