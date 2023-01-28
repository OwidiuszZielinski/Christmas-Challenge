package JetBrainsAcademy;

import JetBrainsAcademy.annotation.Cat;
import JetBrainsAcademy.annotation.ImportantString;
import JetBrainsAcademy.annotation.MyAnnotation;
import JetBrainsAcademy.annotation.RunImmediately;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CheckingAccount extends BankAccount {


    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Pipek",5);
        System.out.println(Arrays.toString(cat.getClass().getDeclaredClasses()));
        System.out.println(Arrays.toString(cat.getClass().getDeclaredConstructors()));
        System.out.println(Arrays.toString(cat.getClass().getDeclaredMethods()));
        System.out.println(Arrays.toString(cat.getClass().getAnnotations()));



        for(Method method : cat.getClass().getDeclaredMethods()){

            System.out.println(method.getModifiers());
            System.out.println(method.getName() + Arrays.toString(method.getParameterTypes()));
            System.out.println(method.isAnnotationPresent(RunImmediately.class));
            
        }

        for(Field field : cat.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(ImportantString.class)){
                Object x = field.get(cat);
                if(x instanceof String stringValue){
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }

    }










    double fee;


    public CheckingAccount(String number, Long balance, double fee) {
        super(number ,balance);
        this.fee = fee;
    }
    public void printIsNull(Object o) {
        if (o == null) {
            System.out.println("It's null");
        } else {
            System.out.println("It's an object");
        }
    }
}
