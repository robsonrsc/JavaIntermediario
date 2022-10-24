package MAP;

import java.util.*;

public class trabalhandoComMAP {

    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
        put("gol", 15.5);
        put("Fusca", 8.5);
        put("corsa", 10.5);
        put("RangeRover", 13.5);
        put("Corola", 16.7);

        }};
        System.out.println(carrosPopulares);

        System.out.println("\n#########################################################################\n");
        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);


        System.out.println("\n#########################################################################\n");
        System.out.println("Confira se o modelo Tucson esta dentro do dicionario");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("\n#########################################################################");

        System.out.println("exiba o consumo do uno");
        System.out.println(carrosPopulares.get("corsa"));

        System.out.println("\n#########################################################################");
        System.out.println("Exiba o terceiro item adicionado");

        //nao e possivel com hashmap

        System.out.println("\n#########################################################################");
        System.out.println("exiba todos os modelos");
        Set<String> strings = carrosPopulares.keySet();
        System.out.println(strings);

        System.out.println("\n#########################################################################");
        System.out.println("exiba o consumo de cada carro");

        Collection<Double> values = carrosPopulares.values();
        System.out.println(values);

        System.out.println("\n#########################################################################");

        System.out.println("exiba o carro mais economico");
        Double max = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modelomelhor = "";

        for (Map.Entry<String,Double> entry:entries){
            if(entry.getValue().equals(max)){
                modelomelhor = entry.getKey();
            }
        }
        System.out.println("O modelo mais eficiente e: " + modelomelhor +" com consumo de "+max);

        System.out.println("\n#########################################################################");

        System.out.println("exiba o carro pior");
        Double mix = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entry = carrosPopulares.entrySet();
        String piormelhor = "";

        for (Map.Entry<String,Double> entr:entries){
            if(entr.getValue().equals(mix)){
                piormelhor = entr.getKey();
            }
        }
        System.out.println("O pior  e: " + piormelhor +" com consumo de "+mix);
        System.out.println("\n#########################################################################");

        System.out.println("exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(carrosPopulares);

        System.out.println("A soma e: "+soma);
        System.out.println("\n#########################################################################");
        System.out.println("A media e "+soma/carrosPopulares.size());
        System.out.println("\n#########################################################################");
        System.out.println("remova os modelos com consumo igual 15.5");


        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
                if (iterator1.next().equals(15.2))iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("\n#########################################################################");
        System.out.println("Insita os itens na ordem em que foram lancados.");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 15.5);
            put("Fusca", 8.5);
            put("corsa", 10.5);
            put("RangeRover", 13.5);
            put("Corola", 16.7);

        }};
        System.out.println(carrosPopulares1);

        System.out.println("\n#########################################################################");
        System.out.println("Exiba o modelo ordenado pelo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("\n#########################################################################");
        System.out.println("Apague o dicionario de carros");
        carrosPopulares.clear();
        System.out.println("o dicionadio esta vazio " + carrosPopulares.isEmpty());




        }
}
