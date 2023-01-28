package JetBrainsAcademy.poli;

public class Warning extends Notification {
    public Warning(String msg) {
        super(msg);
    }
    @Override
    public String getMsg() {
        return "WARN: " + msg;
    }
}
