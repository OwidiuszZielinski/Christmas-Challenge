public class Day21_SwapValues {
    /**
     * Mikołaj znów przyoszczedził na pakiecie. Tym razem dla ilości zmiennych.
     * Kupił sobie tylko dwie: jedną, żeby zapisać ilość miejsc do odwiedzenia,
     * a drugą, żeby zapisać ilość reniferów.
     * Niestety! W ferworze świątecznych przygotowań pomylił się i przypisał wartości na odwrót!
     * Pomoż Mikołajowi i zamień wartości. Pamiętaj, żeby nie używać żadnych dodatkowych zmiennych!
     * Grozi Mikołajowi za to duża kara pieniężna i gdyby ją otrzymał, nie miał by pieniędzy na prezenty!
     */
    public static void main(String[] args) {
        int places = 10;
        int reindeers = 100;
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println(ANSI_RED + "Before switch: places = " + places + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Before switch: reindeers = " + reindeers + ANSI_RESET);
        //First way
//        reindeers += places;
//        places = reindeers -places;
//        reindeers =reindeers-places;

        //Second way
        places = places ^ reindeers ^ (reindeers = places);


        System.out.println(ANSI_RED + "After switch: places = " + places + ANSI_RESET);
        System.out.println(ANSI_GREEN + "After switch: reindeers = " + reindeers + ANSI_RESET);
    }
}