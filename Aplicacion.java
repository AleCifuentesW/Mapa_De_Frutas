import java.util.HashMap;
import java.util.Map;

public class Aplicacion{
    public static void main(String[] args){
        //Aquí creo el HashMap
        Map<String, Integer> frutas = new HashMap<>();
        //Agrego las frutas con sus cantidades
        frutas.put("Manzanitas", 6);
        frutas.put("Bananas", 8);
        frutas.put("Peras", 7);
        frutas.put("Granadas", 4);

        //extraigo la información de una fruta usando .get()
        int cantidadBananas=frutas.get("Bananas");
        System.out.println("Cantidad de Bananas a comprar: " + cantidadBananas);

        System.out.println("\nListado completo de frutas:");
        System.out.println("---------------------------");

        //Recorro el mapa y muestro cada fruta con su cantidad
        for (String fruta : frutas.keySet()){
            Integer cantidad= frutas.get(fruta);
            System.out.println(fruta + ": " + cantidad);
        }
    }
}