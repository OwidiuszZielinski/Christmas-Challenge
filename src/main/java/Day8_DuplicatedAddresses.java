import model.Address;

import java.util.*;
import java.util.stream.Collectors;

public class Day8_DuplicatedAddresses {

    /**
     * Złośliwe chochliki poduplikowaly wpisy na liście adresów dzieci.
     * Pomóż Mikołajowi i zdeduplikuj listę. Wypisz wyczyszczoną z duplikatów listę na ekran.
     * Możesz usunąć niepotrzebne adresy z listy, albo utworzyć nową bez duplikatów.
     */

    public static void main(String[] args) {
        List<Address> addresses = prepareAddresses();

        for (int i = 0; i < addresses.size(); i++) {
            for (int j = i + 1; j < addresses.size(); j++) {
                if (addresses.get(i).equals(addresses.get(j))) {
                    addresses.remove(addresses.get(j));
                    j--;
                }
            }
        }

    }
    private static List<Address> removeDuplicatesStream(List<Address> givenAddresses){
        return givenAddresses.stream().distinct().toList();

    }
    private static List<Address> removeDuplicatesForLoop(List<Address> givenAddresses){
        List<Address> returnList = new ArrayList<>();
        for(Address x : givenAddresses){
            if(!returnList.contains(x)){
                returnList.add(x);
            }

        }
        return returnList;

    }

    private static List<Address> removeDuplicatesSet(List<Address> givenAddresses){
        return new HashSet<Address>(givenAddresses).stream().toList();

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
                "289",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289",
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
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Cukierkowa",
                "23",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }
}