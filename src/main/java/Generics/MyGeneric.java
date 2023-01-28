package Generics;

public class MyGeneric<T> {
    private T t;

    public MyGeneric(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
