package JetBrainsAcademy;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    private void sayMeow() {
        System.out.println(this.name + " says: \"Meow\".");
    }

    public class Bow {
        String color;

        public Bow(String color) {
            this.color = color;
        }

        public void putOnABow() {
            Cat.this.sayMeow();
            System.out.println("Bow is on!");
        }

        public void printColor() {
            System.out.println("Cat " + Cat.this.name + " has a " + this.color + " bow.\n");
        }
    }

    class Box<T> {
        private T someCake;

        public void put(T some) {
            this.someCake = some;
        }

        public T get() {
            return this.someCake;
        }
    }
}