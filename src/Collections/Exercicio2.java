package Collections;

import java.util.*;

public class Exercicio2 {

    /*
    Utilizando listas, faça um programa que faça 5 perguntas para uma
    pessoa sobre um crime. As perguntas são:

    "Telefonou para a vítima?"

    "Esteve no local do crime?"

    "Mora perto da vítima?"

    "Devia para a vítima?"

    "Já trabalhou com a vítima?"

    Se a pessoa responder positivamente a 2 questões ela deve ser
    classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
    "Assassina". Caso contrário, ela será classificado como "Inocente".

     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("\n###############################################################" +
                "#####################################################################\n");

        List<String> inves = new ArrayList<>();
        inves.add("Telefonou para a vítima?");
        inves.add("Esteve no local do crime?");
        inves.add("Mora perto da vítima?");
        inves.add("Devia para a vítima?");
        inves.add("Já trabalhou com a vítima?");


        //System.out.println(inves);

        Iterator<String> pergunta = inves.iterator();
        String a = "Sim";
        String b = "Nao";
        int conta = 0;
        List<String> resposta = new ArrayList<>();

        while (conta<5){

            System.out.println(inves.get(conta));
            System.out.println("Sim ou Nao?");
            String user = tec.next();

            resposta.add(user);


            conta+=1;
        }
        System.out.println(resposta);

        int contador = 0;

        Iterator<String> supeito = resposta.iterator();
        while (supeito.hasNext()){

            String resp = supeito.next();
            if (resp.contains("s")){
                    contador++;
        }
        }
        switch (contador){

            case 2:
                System.out.println("Fica de olho, ele parece meio suspeito");break;

            case 3:
            case 4:
                System.out.println("Isso nao me cheira bem, talvez ele tenha ajudado, tenha atuado como cumplice");break;

            case 5:
                System.out.println("PRENDAM! Voce tem o direito de ficar calado e tudo quanto disse pode e sera usado contra voce no tribunal");break;
            default:
                System.out.println("Solte o menino que ele e inocente");

        }
    }

}
