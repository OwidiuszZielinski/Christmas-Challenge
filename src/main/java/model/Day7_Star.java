package model;

public class Day7_Star {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie gwiazdkę.
     * Jeżeli potrafisz, nie wpisuj gwiazdki bezposrednio w printy - pokombinuj z pętlami.
     * Tak, żeby gwiazdka wygenerowała się sama!
     * Gwiazdka może mieć dowolny kształt, wygeneruj taki jaki potrafisz. Przykładowe gwiazdki:
     * *       *       *         *
     * *         *   *        *******
     * *********   **********      *****
     * *         *   *        *******
     * *       *       *         *
     */

    public static void main(String[] args) {
        int size = 15;
        drawStar(size);
        // TODO: draw star in console for given size

    }

    public static void drawStar(int size) {
        int counter = size/3-1;
        int partOneLength = size/2+1;
        int freeSpacePartOne = size / 3 * 2;
        int freeSpacePartTwo = size - counter + 1;

        for (int i = 0; i < partOneLength; i++) {
            if (i < counter) {

                for (int j = i; j <= counter + freeSpacePartOne; j++) {
                    System.out.print(" ");
                }
                for (int x = 0; x <= i; x++) {
                    System.out.print("* ");
                }
            }
            if (i >= counter) {
                int count = 0;
                for (int j = 1; j <= i - counter; j++) {
                    System.out.print(" ");
                    count++;
                }
                for (int x = 0; x <= size - count; x++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

        }
        for (int i = 1; i < counter; i++) {
            for (int j = i; j < counter - 1; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x <= size - counter; x++) {
                System.out.print("* ");

            }
            for (int x = 0; x <= i; x++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        for (int i = 0; i < counter; i++) {

            for (int j = 0; j < freeSpacePartTwo+i; j++) {
                    System.out.print(" ");
                }

                for (int x = i; x < counter; x++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}