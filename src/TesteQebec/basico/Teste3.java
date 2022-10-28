package TesteQebec.basico;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Teste3 {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] vetor = new int[60];
        //while (i< vetor.length){

        for ( int i = 0; i < 60; i++)   {
           // vetor [i] = i;

            //System.out.println("teste");
            for (int j = vetor[i]; j < t;j++) {

                vetor [i] = j;
                //System.out.println(vetor [i]);

                if (vetor [i] <60 && j<3)  {
                    System.out.println("N[" + i + "] = " + vetor[i]);
                }
              //  System.out.println("baixo");
                vetor [i]+= i++;

            }


            /*for(int i=0 ; i<vetor.length; i ++){
                System.out.println(i);
                for(int j=0;j<(vetor.length) ;j++){


                    if(vetor.length<1000){
                //        System.out.println("N[" +   + "] = "+   );
                //        i ++  ;
                    }
                }
            }*/
        }

    }

}


/*
import java.net.PortUnreachableException;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

        // TODO: Implemente uma condição onde possamos preencher o vetor de N.
        // Lembre-se a sequência de valores é de 0 até T-1:
        int[] N = new int[1000];
        int i=0;
        for(int n = 0 ; n < t  ; n++ ){
            N[n] = n;
        }

        while(i < 1000 ){
            for(int j = 0; j < t ; j++ ){
                if( t>=2 && t<=50 && i < 1000){

                    System.out.println("N[" +  i + "] = " + N [j] );
                }
                ++i;
           }

        }


    }
}
 */