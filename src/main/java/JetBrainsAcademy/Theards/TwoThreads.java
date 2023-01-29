package JetBrainsAcademy.Theards;

import java.util.Random;

public class TwoThreads {

    public static void main(String[] args) {


        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";

        Thread threadTwo = new Thread(() -> {

            Thread.currentThread().setName("MyThread");
            String result = "";
            for (int i = 0; i <= 10000; i++) {
                int random = new Random().nextInt(0 ,15);
                if (result.length() < 150) {
                    result += (Integer.toBinaryString(random));
                    continue;
                }
                System.out.print(ANSI_GREEN + result);
                result = "";
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });
        Thread threadThree = new Thread(() -> {
            Thread.currentThread().setName("MyThreadTwo");
            while (threadTwo.isAlive()){
                try {
                    Thread.sleep(300);
                    System.out.println();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }


        });
        threadThree.start();
        threadTwo.start();

        String resultTwo = "";
        for (int i = 0; i <= 10000; i++) {
            int random = new Random().nextInt(0 ,15);
            if (resultTwo.length() < 150) {
                resultTwo += Integer.toBinaryString(random);
                continue;
            }
            System.out.print(ANSI_RESET + resultTwo);
            resultTwo = "";
            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
