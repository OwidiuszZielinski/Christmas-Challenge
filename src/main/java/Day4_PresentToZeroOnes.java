import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day4_PresentToZeroOnes {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii
     * i zamiast rozwozić wszystkie prezenty, niektóre przesłać przez Internet.
     * Do tego celu musi zamienić nazwy prezentów w strumienie bitów!
     * Pomoż Mikołajowi! Przygotuj kod, który zamieni nazwy prezentów na ciąg zer i jedynek.
     * Dla każdej litery nazwy prezentu znajdz kod UTF-8, a później zamień go na system binarny.
     * Dla każdego prezentu wypisz na ekran ciąg zer i jedynek. Każdy prezent w oddzielnej linijce.
     * Możesz napisać funkcję zamieniającą numer znaku na system binarny samodzielnie,
     * albo znaleźć odpowiednią funkcję w bibliotece Twojego języka.
     */

    public static void main(String[] args) {

        List<String> ideas = List.of(
                "Parfum" ,"Socks" ,"Sweather" ,"Cup" ,
                "Hat" ,"Tea" ,"Coffee" ,"Clock" ,"Bag" ,
                "Book" ,"Wallet" ,"Cream" ,"Earrings");
        printBinaryValueOfString(ideas);

    }

    private static void printBinaryValueOfString(List<String> strings) {
        for (String x : strings) {
            System.out.print(x + " : ");
            for (Byte y : x.getBytes(StandardCharsets.UTF_8)) {
                System.out.print(Integer.valueOf(Integer.toBinaryString(y)) + "   ");
            }
            System.out.println();
        }

    }

}
