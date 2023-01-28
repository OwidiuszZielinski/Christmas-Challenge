import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Train {
    static String a = "abc";
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        set.add(1);
        set.add(2);
        queue.add(1);
        queue.add(2);
        set.add(1);
        queue.add(1);

        System.out.println(queue);
    }
    private static void printer(){
        System.out.println(a);

    }
}
