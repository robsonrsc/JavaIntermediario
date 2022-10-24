package ordenacaoSet.ExeLinguagens;



import java.util.*;

public class exercicioslinguagens {

    public static void main(String[] args) {
        System.out.println("\n##################################################################\n");
        System.out.println("Mostrar em ordem de insercao\n");

        Set<linguagens> favoritas = new LinkedHashSet<>(){{

            add(new linguagens("Python",1991,"Pycharm"));
            add(new linguagens("Java",1995,"Intellij"));
            add(new linguagens("JavaScript",1992,"VSCode"));


        }};
        System.out.println(favoritas.toString() + "\n");
        for (linguagens lingua:favoritas) System.out.println( lingua.getNome() +" - " + lingua.getAno()+
                " - " +lingua.getIDE());


        System.out.println("\n##################################################################\n");
        System.out.println("Mostrar em ordem nome\n");


        Set<linguagens> favorita2 = new TreeSet<>(new ComparatorNomeGener());
        favorita2.addAll(favoritas);

        for (linguagens lingua:favorita2) System.out.println("\n" + lingua.getNome() +" - " + lingua.getAno()+
                " - " +lingua.getIDE());

        System.out.println("\n##################################################################\n");
        System.out.println("Mostrar em ordem IDE\n");


        Set<linguagens> favorita3 = new TreeSet<>(new comparaIDE());
        favorita3.addAll(favoritas);


        for (linguagens teste:favorita3) System.out.println("\n" + teste.getNome() +" - " + teste.getAno()+
                " - " +teste.getIDE());



    }
}


class linguagens {

    private String nome;
    private Integer ano;
    private String IDE;

    public linguagens(String nome, Integer ano, String IDE) {
        this.nome = nome;
        this.ano = ano;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        linguagens that = (linguagens) o;
        return Objects.equals(nome, that.nome) && Objects.equals(ano, that.ano) && Objects.equals(IDE, that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, IDE);
    }

    @Override
    public String toString() {
        return "linguagens{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", IDE='" + IDE + '\'' +
                '}';



    }



}

class ComparatorNomeGener implements Comparator<linguagens> {

    @Override
    public int compare(linguagens o1, linguagens o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome !=0) return nome;

        return nome;
    }
}

class comparaIDE implements  Comparator<linguagens>{


    @Override
    public int compare(linguagens o1, linguagens o2) {

        int ide = o1.getIDE().compareTo(o1.getIDE());
        if (ide!=0) return ide;
        return ide;
    }
}