package JetBrainsAcademy.Theards;

import java.util.ArrayList;
import java.util.List;

public class SafetyTest {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        Thread thread = new Thread(()-> {

            addNumbers(list);

        });
            thread.start();
            addNumbers(list);
        System.out.println(list.size());
        }


    private static void addNumbers(ArrayList<Integer> target) {
        for (int i = 0; i < 100_000; i++) {
            target.add(i);

        }
    }
    private static void addNumbersWithOwnThread(ArrayList<Integer> target){

    }

}
