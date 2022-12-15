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
        Map<String, Double> stringDoubleMap = calculateIngredients(calculateRectangleField(20 ,30) ,calculateCircleField(4) ,ingredientsForRectangleForm);
        printIngredients(stringDoubleMap);


        // TODO: prepare function which calculate amount of ingredients for circle form

    }

    private static void printIngredients(Map<String, Double> toPrint) {
        System.out.println("Ingredients after calculate is : ");
        for (Map.Entry<String, Double> x : toPrint.entrySet()) {

            if (x.getKey().equals("Jajka")) {
                System.out.print("You need : ");
                double value = x.getValue();
                if (String.valueOf(x.getValue()).endsWith("5")) {

                    System.out.println(x.getKey() + " amount : " + (int) value + " 1/2 [pcs]");
                    continue;
                } else
                    System.out.println(x.getKey() + " amount : " + (int) value + " [pcs]");
                continue;
            }
            System.out.print("You need : ");
            System.out.println(x.getKey() + " amount : " + x.getValue() + " [g]");
        }

    }

    private static double calculateRectangleField(double a ,double b) {
        return a * b;
    }

    private static double calculateCircleField(double r) {
        return Math.PI * Math.pow(r ,2);
    }

    private static Map<String, Double> calculateIngredients(double rectangleFormField ,double circleFormField ,Map<String, Integer> ingredientsForRectangleForm) {
        double proportion = (circleFormField / rectangleFormField) * 100;
        Map<String, Double> ingredients = new HashMap<>();
        for (Map.Entry<String, Integer> x : ingredientsForRectangleForm.entrySet()) {
            if (x.getKey().equals("Jajka")) {
                double value = x.getValue() * proportion / 100;
                int valueFirstNumber = (int) value;
                if (value > valueFirstNumber + 0.25 && value < valueFirstNumber + 0.75) {
                    ingredients.put(x.getKey() ,valueFirstNumber + 0.5);
                    continue;
                }

            }
            ingredients.put(x.getKey() ,(double) Math.round(x.getValue() * proportion / 100));

        }
        return ingredients;
    }
}
