public class Day23 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        int height = 15;
        printBow(height);


    }

    private static void printBow(int height) {
        for (int i = 0; i <= height / 2; i++) {
            for (int j = 0; j < i; j++) {
                if (i - 1 == j) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }
                if (j == 0) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }

                System.out.print(ANSI_RED + " # " + ANSI_RESET);
            }
            for (int j = 0; j < height / 2 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < height / 2 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                if (i - 1 == j) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }
                if (j == 0) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }
                System.out.print(ANSI_RED + " # " + ANSI_RESET);
            }

            System.out.println();
        }

        for (int i = 0; i <= height / 2; i++) {
            for (int j = 0; j < height / 2 - i; j++) {
                if (j == (height / 2 - i) - 1) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }
                if (j == 0) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }
                System.out.print(ANSI_RED + " # " + ANSI_RESET);
            }
            for (int j = 0; j < i; j++) {
                if (i == j + 1) {
                    System.out.print(ANSI_PURPLE + " ^ " + ANSI_RESET);
                    continue;
                }
                System.out.print("   ");

            }
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print(ANSI_PURPLE + " ^ " + ANSI_RESET);
                    continue;
                }


                System.out.print("   ");

            }
            for (int j = 0; j < height / 2 - i; j++) {
                if (j == 0) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }
                if (j == (height / 2 - i) - 1) {
                    System.out.print(ANSI_PURPLE + " # " + ANSI_RESET);
                    continue;
                }

                System.out.print(ANSI_RED + " # " + ANSI_RESET);
            }

            System.out.println();

        }
    }
}

      

