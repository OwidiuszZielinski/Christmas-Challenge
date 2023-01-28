package javaforbeginersFB;

import java.lang.reflect.Array;
import java.util.*;

public class BrickSolution {
    final static int TRUCK_CAPACITY = 26000;
    final static int FIRST_EMPLOYEE_BRICK_WEIGHT = 1;
    final static int SECOND_EMPLOYEE_BRICK_WEIGHT = 2;
    final static int THIRD_EMPLOYEE_BRICK_WEIGHT = 3;
    final static int PRODUCTION_LINE_EFFICIENCY = 100;
    final static int PRODUCTION_LINE_MAX_WEIGHT = 150;

    public static void main(String[] args) {
        System.out.println("\u001B[35m" + calculate());
    }

    public static Map<Integer, Integer> calculate() {
        Map<Integer, Integer> brickMap = new HashMap<>();
        List<Integer> inTruckList = new ArrayList<>();
        Queue<Integer> inLine = new LinkedList<>();
        List<Integer> employees = Arrays.asList(FIRST_EMPLOYEE_BRICK_WEIGHT ,SECOND_EMPLOYEE_BRICK_WEIGHT ,THIRD_EMPLOYEE_BRICK_WEIGHT);
        int sumInLine = 0;
        int elementsInLine = 0;
        int inTruck = 0;
        while (inTruck <= TRUCK_CAPACITY) {

            while (sumInLine < PRODUCTION_LINE_MAX_WEIGHT && elementsInLine < PRODUCTION_LINE_EFFICIENCY) {
                inLine.offer(employees.get(new Random().nextInt(0,3)));
                sumInLine = inLine.stream().reduce(Integer::sum).orElse(0);
                elementsInLine = inLine.size();

            }

            for (int i = 0; i < 3; i++) {
                if (inTruck + inLine.peek() >= TRUCK_CAPACITY) {
                    break;
                }
                int key = inLine.peek();
                brickMap.put(key ,brickMap.getOrDefault(key ,0) + 1);
                inTruckList.add(inLine.poll());
                inTruck = inTruckList.stream().reduce(Integer::sum).orElse(0);
            }


            sumInLine = inLine.stream().reduce(Integer::sum).orElse(0);
            elementsInLine = inLine.size();
            inTruck = inTruckList.stream().reduce(Integer::sum).orElse(0);
            if (inTruck + inLine.peek() >= TRUCK_CAPACITY) {
                break;
            }

        }

        System.out.println(inTruckList.stream().reduce(Integer::sum).orElse(0));
        System.out.println(inTruckList.size());
        return brickMap;
    }
}
