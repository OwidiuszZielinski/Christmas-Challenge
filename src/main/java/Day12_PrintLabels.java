import model.Address;
import model.ChildWithAddress;

import java.util.List;

public class Day12_PrintLabels {


    /**
     * Pomóż Mikołajowi przygotować etykiety do druku na prezenty!
     * Dla każdego dziecka z listy wypisz w konsoli imię, nazwisko i adres w formacie jak na list.
     * Rozdziel przygotowane etykiety liniami.
     */


    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_PURPLE = "\u001B[35m";

        List<ChildWithAddress> children = prepareChildren();

        for (ChildWithAddress x : children){
            String nameSurname = x.getName() + x.getSurname();
            String streetAndNumber = x.getAddress().getStreet() + x.getAddress().getNumber();
            String zipcodeAndCity = x.getAddress().getZipCode() + x.getAddress().getCity();
            for (int i = 0; i < 20; i++) {
                if(i==19){
                    System.out.println();
                    break;
                }
                System.out.print(ANSI_PURPLE + "_" + ANSI_RESET);
            }

            System.out.print(ANSI_PURPLE+"|" +ANSI_GREEN + x.getName() + ANSI_RED+" "+ x.getSurname());
            for (int i = 0; i < 20-nameSurname.length()-2; i++) {
                if(i == 20-nameSurname.length()-3){
                    System.out.print(ANSI_PURPLE + "|" + ANSI_RESET);
                }
                else {
                    System.out.print(ANSI_PURPLE + " " + ANSI_RESET);
                }
            }
            System.out.println();
            System.out.print(ANSI_PURPLE+"|" +ANSI_GREEN + x.getAddress().getStreet() + ANSI_RED+" "+ x.getAddress().getNumber()+ANSI_RESET);
            for (int i = 0; i < 20-streetAndNumber.length()-2; i++) {
                if(i == 20-streetAndNumber.length()-3){
                    System.out.print(ANSI_PURPLE + "|" + ANSI_RESET);
                }
                else {
                    System.out.print(ANSI_PURPLE + " " + ANSI_RESET);
                }
            }

            System.out.println();
            System.out.print(ANSI_PURPLE+"|" +ANSI_GREEN + x.getAddress().getZipCode() + ANSI_RED+" "+ x.getAddress().getCity() + ANSI_RESET);

            for (int i = 0; i < 20-zipcodeAndCity.length()-2; i++) {
                if(i == 20-zipcodeAndCity.length()-3){
                    System.out.print(ANSI_PURPLE + "|" + ANSI_RESET);
                }
                else {
                    System.out.print(ANSI_PURPLE + " " + ANSI_RESET);
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(ANSI_PURPLE + "_" + ANSI_RESET);
        }


    }



    private static List<ChildWithAddress> prepareChildren() {
        return List.of(
                new ChildWithAddress(
                        "Jasiu",
                        "Kowalski",
                        new Address("Serniczkowa",
                                "4B",
                                2,
                                "Krakow",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Kasia",
                        "Nowak",
                        new Address("Pierniczkowa",
                                "289",
                                55,
                                "Gdansk",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Asia",
                        "Wisniewska",
                        new Address("Barszczykowa",
                                "234",
                                5,
                                "Rzeszow",
                                "37-326"
                        )),
                new ChildWithAddress(
                        "Tomek",
                        "Wojcik",
                        new Address("Uszkowa",
                                "43H",
                                5,
                                "Wroclaw",
                                "02-326"
                        ))
        );
    }
}

