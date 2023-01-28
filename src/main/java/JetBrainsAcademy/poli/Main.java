package JetBrainsAcademy.poli;

import JetBrainsAcademy.AsciiCharSequence;
import JetBrainsAcademy.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Notification notif = new Notification("No problems");
//
//        Notification warn = new Warning("Money ends");
//
//        Notification alarm = new Alarm("The ship sank");
//
//        System.out.println(warn.getMsg());

//        warn.show();
        byte[] bytes = {69, 121, 101, 45, 62, 118, 101, 114, 44, 33, 61, 101, 98};
        char[] chars = {'x','d','p'};

        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(bytes);
        System.out.println(asciiCharSequence.charAt(4));
        System.out.println(asciiCharSequence.subSequence(0,4));
        System.out.println(asciiCharSequence);


        System.out.println(new String(bytes));
        System.out.println(new String(chars));

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {

                System.out.print(j + " ");
            }
            System.out.println();

        }

        System.out.println();


        Cat cat = new Cat("BURK");
        Cat.Bow bowBurk = cat.new Bow("red");
        bowBurk.printColor();

        bowBurk.putOnABow();

    }
}
