public class Day3_ChristmasTree {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie choinkę.
     * Jeżeli potrafisz, nie wpisuj drzewka bezposrednio w printy - pokombinuj z pętlami.
     * Przygotuj funkcję przyjmującą wysokość choinki i wypisującą choinkę na ekranie.
     * Tak, żeby choinka wygenerowała się sama! Choinka może być po prostu trójkątem, albo być żłożona z kilku warstw. :)
     */

    public static void main(String[] args) {

        int height = 10;

        drawTree(height);

    }

    private static void drawTree(int height) {
        String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < height - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(ANSI_GREEN + " *" + ANSI_RESET);
                } else {
                    System.out.print(" *");
                }
            }
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print(ANSI_GREEN + " *" + ANSI_RESET);
                } else {
                    System.out.print(" *");
                }
            }


            System.out.println();
        }


    }

}

