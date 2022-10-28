import java.io.IOException;
import java.util.*;

public class testebasico {

    /*    public static void main(String[] args){

// TODO: Crie um Array de números inteiros:
            Integer[] valores= {2,3,7,11,13,18,34};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:

            for (int i=0;i<valores.length;i++ ){
                if (valores[i] %2==0 ){
                    System.out.println(valores[i]);
                }
            }

        }*/

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        Map<Integer, Double> mercadoCod = new HashMap<>() {{
            put(12, 5.30d);
            put(16, 5.10);
            put(13, 15.30d);
            put(161, 5.20d);
            put(1, 15.10d);
            put(2, 15.10d);

        }};

        //  double valor_produtos = mercadoCod.get(leitor.nextInt());
        //  System.out.println(valor_produtos);
        double valor_produtos = 0;

        int qtd = 1;
        boolean status = false;

        double soma = 0;
        double total = 0;
        double subtotal = 0;


        while (!status) {

            System.out.println("Insira a quantidade: ");
            int n1 = leitor.nextInt();

            try {


                if (n1 != 0) {
                    System.out.println("Insira o codigo do produto: ");

                    double verifica = mercadoCod.get(leitor.nextInt());
                    total = n1 * verifica;
                    soma += total;
                } else {
                    System.out.println(String.format("VALOR A PAGAR: R$ %.2f  ",
                            soma));
                    status = true;
                }
            } catch (NullPointerException er) {
                System.out.println("Codigo informado nao existente");
            }

        }


    }
}
