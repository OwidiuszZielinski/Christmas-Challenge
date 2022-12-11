package model;

public class Envelope {

    private Size size;
    private int width;
    private int height;

    public Envelope(int width, int height,Size size) {
        this.width = width;
        this.height = height;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "size=" + size +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public Size getSize(){
        return size;
    }
}
