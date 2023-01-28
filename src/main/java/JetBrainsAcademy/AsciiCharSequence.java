package JetBrainsAcademy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private final byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    @Override
    public String toString() {
        return new String(byteArray);
    }



    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArray[index];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(byteArray, i, i1));
    }

}
