package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    /*Objetivo criar uma lista de estoque e exercitar o que foi visto na aula sobre list, collections e etc.
    O primeiro passo a se criar uma lista e ter o tipo de item que sera inserido dentro da lista:

    cria uma classe,




     */

    public static void main(String[] args) {

        List<meuEstoque>  supermercado = new ArrayList<>(){{
        add(new meuEstoque("Arroz", "parborizado", "Branco"));
        add(new meuEstoque("Feijao", "Carioca", "marrom"));
        add(new meuEstoque("Linguica", "toscana", "rosa"));

        }};

        System.out.println(supermercado);

        //lista criada agora vamos fazer uma outra lista dentro dessa mesma classe

        List<Fala> comandos = new ArrayList<>(){{




        }};
    }

}

    class meuEstoque {


        private String nome;
        private String tipo;
        private String cor;


        public meuEstoque(String nome, String tipo, String cor) {
            this.nome = nome;
            this.tipo = tipo;
            this.cor = cor;
        }


        public String getNome() {
        return nome;
    }

        public String getTipo() {
            return tipo;
        }

        public String getCor() {
            return cor;
        }


        @Override
        public String toString() {
            return "meuEstoque{" +
                    "nome='" + nome + '\'' +
                    ", tipo='" + tipo + '\'' +
                    ", cor='" + cor + '\'' +
                    '}';
        }


    }

    class Fala {

    private String local;
    private String objeto;
    private String coordenada;

        public Fala(String local, String objeto, String coordenada) {
            this.local = local;
            this.objeto = objeto;
            this.coordenada = coordenada;
        }

        public String getLocal() {
            return local;
        }

        public String getObjeto() {
            return objeto;
        }

        public String getCoordenada() {
            return coordenada;
        }




    }
