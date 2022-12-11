public class Day10_ChristmasCandy {


    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie laskę cukrową.
     * Jeżeli potrafisz, nie wpisuj laski bezpośrednio w printy - pokombinuj z pętlami.
     * Tak, żeby laska wygenerowała się sama!
     */

    public static void main(String[] args) {

        int height = 20;
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }

        candyDrawer(height);
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }

        // TODO: prepare function which draw in console christmas candy


    }

    public static void candyDrawer(int height) {
        final int propOne = (height * 25) / 100;
        final int propTwo = (height * 40) / 100;
        final int half = (height * 50) / 100;

        for (int i = 0; i < height; i++) {

            if (i < propOne - 2) {
                for (int j = 0; j < height; j++) {
                    if (j <= 0 && i <= 0) {
                        System.out.print(" ");
                        continue;
                    }
                    if (j > propOne && j < half) {
                        continue;
                    }
                    System.out.print(" #");
                }

            } else

                for (int j = 0; j < height; j++) {

                    if (j > propOne && j < half) {
                        continue;
                    }
                    if (j > height - propOne) {
                        System.out.print(" #");
                        continue;
                    }
                    if (i < propTwo - 1 && j < propOne - 1) {
                        System.out.print(" #");
                        continue;
                    }

                    System.out.print("  ");
                }

            System.out.println();
        }
    }
}





