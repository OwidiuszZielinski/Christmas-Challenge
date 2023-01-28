package JetBrainsAcademy.poli;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WriteTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        Map<String,Integer> map = new HashMap<>();
    }
}
