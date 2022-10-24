package MAP;

import java.util.*;

public class ExercicioLivro {

    public static void main(String[] args) {
        System.out.println("Criar um dicionario e mostrar na ordem aleatoria");

        Map<String, livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new livro("21 licoes para o seculo 21", 432));

        }};

        for (Map.Entry<String, livro> livro1 : meusLivros.entrySet())
            System.out.println(livro1.getKey() + "------" + livro1.getValue().getNome());
        System.out.println("\n##################################################################################\n");
        System.out.println("mostre os livros por ordem de insercao");

        Map<String, livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new livro("21 licoes para o seculo 21", 432));

        }};
        System.out.println("\n##################################################################################\n");
        System.out.println("ordenar alfabeticamente de acordo com o autor");
        Map<String, livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, livro> livro2 : meusLivros2.entrySet())
            System.out.println(livro2.getKey() + "------" + livro2.getValue().getNome());

        System.out.println("\n##################################################################################\n");
        System.out.println("ordenar alfabeticamente os livros");

        Set<Map.Entry<String,livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());


        for (Map.Entry<String, livro> livro2 : meusLivros3)
            System.out.println(livro2.getKey() + "------" + livro2.getValue().getNome());

        System.out.println(meusLivros3);





    }
}


class livro{

    private String nome;
    private Integer paginas;


    public livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        livro livro = (livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);


    }
}

class ComparatorNome implements Comparator <Map.Entry<String,livro >>{

    @Override
    public int compare(Map.Entry<String, livro> l1, Map.Entry<String, livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}