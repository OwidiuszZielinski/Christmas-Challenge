import java.util.Random;

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
//        places = places ^ reindeers;
//        reindeers = places ^ reindeers;
//        places = places ^ reindeers;

        //Third way
        //places = reindeers+(reindeers=places)-reindeers;

        //Fourth way

        places = places ^ reindeers ^ (reindeers=places);
        
        //WYRAŻENIE JEST WYKONYWANE OD LEWEJ DO PRAWEJ
        //NAJPIERW WYKONUJEMY places XOR reinderss co daje 110 ponieważ bitowo XOR zwaraca 1 wtedy i tylko wtedy gdy mamy różne bity  (Dla 1 1 - > 0 oraz 0 0 - > 0)
        //POZNIEJ przypisujemy do reinders liczbe z places i robimy na tym XOR czyli 110 XOR 10 co daje 100;
        //Zatem places bedzie rowne 100 a rainders rowne 10;
        //Ot cała filozofia


        System.out.println(ANSI_RED + "After switch: places = " + places + ANSI_RESET);
        System.out.println(ANSI_GREEN + "After switch: reindeers = " + reindeers + ANSI_RESET);
    }
}