import java.util.Arrays;
import java.util.List;

public class Day1_Cities {


    /**
     * Wyzwanie Świąteczne @wswieciekodu
     * Dzień 1
     * Mikołaj musi odwiedzić 3 miasta o współrzędnych (1,1), (4,5), (11,5) w podanej kolejności.
     * Mikołaj startuje z punktu(1,1) spod stacji paliw ;)
     * Na 10 jednostek odległości jego sanie zużywają 20 litrów magicznego paliwa.
     * Ile paliwa potrzebuje na całą trasę? Do policzenia przygotuj odpowiedni kod.
     * Obliczony wynik wypisz na ekranie.
     *
     * Oblicz w kodzie dystans miedzy miastami, a nastepnie policz niezbedną ilosc paliwa.
     * Do obliczenia dystansu przygotuj odpowiednią funkcję.
     * Do obliczeń matematycznych użyj funkcji z biblioteki Twojego jezyka.
     */

    public static void main(String[] args) {
        final List<Integer> xCoordinates = Arrays.asList(1,4,11);
        final List<Integer> yCoordinates = Arrays.asList(1,5,5);
        System.out.println("Santa need : " + calcFuel(xCoordinates,yCoordinates) + " of Fuel");

    }
    private static double calcFuel(List<Integer> xCord,List<Integer>yCord){
        double distance =0;
        for (int i = 0; i < xCord.size()-1; i++) {
            double powXCord = Math.pow((xCord.get(i + 1) - xCord.get(i)) ,2);
            double powYCord = Math.pow((yCord.get(i + 1) - yCord.get(i)) ,2);
            distance += Math.sqrt(powXCord + powYCord);
        }
        return distance *2;
    }
}
