import java.util.ArrayList;
import java.util.List;

public class Luca {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Perú");
        cities.add("Bogota");
        cities.add("Barcelona");

        // for(String city : cities) {
        //     System.out.println(city);
        // }

        // NUEVA FORMA DE RECORRER ARRAYS
        // EXPRESION LAMBDA
        // PATRON DE DISEÑO PUBLINE
        cities.stream().forEach(city -> System.out.println(city));

    }
}