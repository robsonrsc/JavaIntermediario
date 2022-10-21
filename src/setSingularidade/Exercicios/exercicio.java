package setSingularidade.Exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class exercicio {

    public static void main(String[] args) {


        System.out.println("#########################################################\n");
        System.out.println("Temperatura media dos ultimos 6 meses:");
        List<Double> temp = new ArrayList<>();

        temp.add(10.4d);
        temp.add(15.6d);
        temp.add(25d);
        temp.add(13.5);
        temp.add(12.7);
        temp.add(18.6);
        temp.add(19.2);


        System.out.println(temp);

        System.out.println("\n#########################################################\n");

        Iterator<Double> iterator = temp.iterator();

        Double sumTemp = 0d;

        while (iterator.hasNext()) {

            Double next = iterator.next();
            sumTemp += next;

        }
        Double media = sumTemp / (temp.size());
        System.out.println("A media de temperatura dos ultimos seis meses e: " + sumTemp / (temp.size()));

        System.out.println("\n#########################################################\n");
        System.out.println("Resolucao parte 01 exercicio");

        Iterator<Double> iterator1 = temp.iterator();

        while (iterator1.hasNext()){

            Double next = iterator1.next();
            if (next< media ){
                System.out.println(temp.indexOf(25d));
                iterator1.remove();

            }
        }
        System.out.println(temp);


    }
}

