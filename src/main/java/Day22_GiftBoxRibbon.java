import model.Box;

public class Day22_GiftBoxRibbon {
    /**
     * Mikołaj zapakował prezenty w pudełka i papier i chce jeszcze obwiązać je wstążką.
     * Ma 5 pudełek o wielkości 10cmx13cmx15cm.
     * Oblicz i wypisz na ekranie, ile metrów wstążki musi kupić Mikołaj.
     * Załóż, że dla każdego prezentu musi kupić tyle wstążki,
     * żeby obwiązać prezent oddzielnie z dwóch stron + dla każdej strony mieć zapas 50%.
     * Niech wstązka krzyzuje sie na sciance o największej powierzchni.
     */
    public static void main(String[] args) {
        Box box = new Box(10 ,13 ,15);
        int boxesAmount = 5;

        System.out.println("Santa need : "+calculateRibbon(box,boxesAmount) + " [cm] ribbon");
        System.out.println("Santa need : "+ Math.round(calculateRibbon(box,boxesAmount)/100) + " [m] ribbon");

    }

    private static double calculateRibbon(Box box ,int boxesAmount) {
        double sizeA = 2 * box.getX() + (2 * box.getZ());
        double sizeB = 2 * box.getY() + (2 * box.getZ());
        double supply = 1.5;
        return boxesAmount * (sizeA + sizeB) * supply;

    }
}