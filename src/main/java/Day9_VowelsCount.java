import model.Address;

import java.util.ArrayList;
import java.util.List;

public class Day9_VowelsCount {
    /**
     * Mikołaj wykupił pakiet wysyłkowy do prezentów, ale przyoszczędził na wersji premium.
     * Przez to będzie musiał dopłacić 2 zł za każdą samogłoskę w adresie.
     * Pomóż Mikołajowi i policz ile będzie musiał dopłacić, a policzoną wartość wypisz na ekranie.
     * Adresy znajdziesz w przygotowanej liście, nie ma w nich polskich znaków.
     */

    public static void main(String[] args) {
        List<Address> addresses = prepareAddresses();
        System.out.println(countSurcharge(
                addressesToString(
                        addresses)));
        //TODO: Calculate how much Santa need to additionally pay

    }

    //Metoda spłaszcza kolekcje adresów na jeden String
    private static String addressesToString(List<Address> addresses){
        String flatAddress = "";
        for(Address x : addresses){
            flatAddress += x.getCity() + x.getStreet() + x.getNumber();
        }
        System.out.println(flatAddress);
        return flatAddress;

    }
    //Metoda usuwa samogłoski i sprawdza o ile skrócił się nam string
    //Zwracamy ilość samogłosek x 2 zł dopłaty
    private static int countSurcharge(String addresses){
        String x = addresses.replaceAll("(?i)[aeiouy]" ,"");
        return (addresses.length() - x.length()) * 2;

    }

    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new Address("Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289A",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Barszczykowa",
                "234",
                5,
                "Rzeszow",
                "37-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Cukierkowa",
                "23I",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }

}
