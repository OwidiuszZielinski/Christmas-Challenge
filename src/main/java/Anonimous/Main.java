package Anonimous;

import Generics.MyGeneric;

public class Main {
    public static void main(String[] args) {


        MyGeneric<Integer> test = new MyGeneric<>(5);
        MyGeneric<String> testTwo = new MyGeneric<>("5");
        System.out.println(test.getT());
        System.out.println(testTwo.getT());

        Anon anon = new Anon() {
            @Override
            public void outer() {
                System.out.println("Good this anonymous");
            }
        };
        anon.outer();


        Greeting greeting = new Greeting(){
            public void welcome(){
                System.out.println("YO BRO");
            }

        };
        greeting.welcome();


        MyFrame myFrame = new MyFrame();

    }

}
