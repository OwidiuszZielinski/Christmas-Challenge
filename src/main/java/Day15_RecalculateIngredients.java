import java.util.HashMap;
import java.util.Map;

public class Day15_RecalculateIngredients {
    /**
     * Mama przesłała Mikołajowi przepisy na ciasta. Blacha mamy Mikołaja jest prostokątna i ma wymiary 20cm x 30cm.
     * Mikołaj ma blachę okrągłą o średnicy 9.8 cm.
     * Pomóż Mikołajowi przeliczuć składniki przepisu na jego blaszkę.
     * Przygotuj funkcję, która będzie przyjmować 2 wymiary blaszki prostokątnej oraz średnicę okrąglej
     * i dla podanej listy składników dla prostokątnej przeliczy ich ilość dla okrągłej.
     * Dla uproszczenia nie przejmuj się jednostkami i załóż, że formy mają taką samą wysokość.
     */

    public static void main(String[] args) {

        Map<String, Integer> ingredientsForRectangleForm = Map.of(
                "Maka" ,300 ,
                "Cukier" ,100 ,
                "Jajka" ,4 ,
                "Czekolada" ,200 ,
                "Maslo" ,200
        );
        System.out.println(calculateIngredients(calculateRectangleField(20,30) ,calculateCircleField(9.8) ,ingredientsForRectangleForm));


        // TODO: prepare function which calculate amount of ingredients for circle form

    }

    private static double calculateRectangleField(double a ,double b){
        return a*b;
    }
    private static double calculateCircleField(double r){
        r = r/2;
        return Math.PI * Math.pow(r,2);
    }

    private static Map<String, Integer> calculateIngredients(double rectangleFormField ,double circleFormField ,Map<String, Integer> ingredientsForRectangleForm) {
        double proportion = (circleFormField / rectangleFormField) * 100;
        Map<String, Integer> ingredients = new HashMap<>();
        for (Map.Entry<String, Integer> x : ingredientsForRectangleForm.entrySet()) {
            ingredients.put(x.getKey() ,(int) Math.ceil((x.getValue() * proportion / 100)));
        }
        return ingredients;
    }
}