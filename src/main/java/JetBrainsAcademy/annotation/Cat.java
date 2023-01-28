package JetBrainsAcademy.annotation;

@MyAnnotation
public class Cat {
    @ImportantString
    String name;
    int age;

    public Cat(String name ,int age) {
        this.name = name;
        this.age = age;
    }

    @RunImmediately
    public void meow(){
        System.out.println(this.name + " goes meow");
    }
    public void meow(String x){
        System.out.println(this.name + " goes meow" + x);
    }
    public String meow(int x){
        return this.name + " goes meow";
    }

}
