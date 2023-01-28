package JetBrainsAcademy.poli;

public class Alarm extends Notification{

    public Alarm(String msg) {
        super(msg);
    }
    @Override
    public void show() {
        System.out.println("ALARM: " + msg);
    }

}
