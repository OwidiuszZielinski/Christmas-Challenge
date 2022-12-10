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

        // TODO: prepare function which draw in console christmas candy
        int prop = (height * 25 )/100;
        int half = (height * 40 )/100;

        for (int i = 0; i < height; i++) {

            if(i<prop-2){
                for (int j = 0; j < height; j++) {
                    if(j <=0 && i <=0){
                        System.out.print(" ");
                        continue;
                    }
                    if(j>3 && j<8 ){
                        continue;
                    }
                    System.out.print(" #");
                }

            }
            else

            for (int j = 0; j < height; j++) {

                if(j>3 && j<8 ){
                    continue;
                }
                if (j > height - prop) {
                    System.out.print(" #");
                    continue;
                }
                if(i<half-1 && j<prop-1){
                    System.out.print(" #");
                    continue;
                }

                System.out.print("  ");
            }


            System.out.println();
        }
    }
}





