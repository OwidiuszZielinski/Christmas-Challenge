package HashMapTraining;

import model.Box;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(15,20,30);
        Box boxA = new Box(15,20,30);
        Box boxB = new Box(15,20,30);
        Box boxC = new Box(15,22,30);
        Box boxD = new Box(15,24,30);
        Box boxF = new Box(15,24,30);
        List<Box> listBoxes = Arrays.asList(box,boxA,boxB,boxC,boxD,boxD,boxF);
        HashMap<Box,Integer> hashMap = new HashMap<>();
        for(Box x : listBoxes){
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);

        }
        System.out.println(hashMap);


    }
}
