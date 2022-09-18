package Lesson1;

import java.util.List;

import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, null, 3, 4, null, 6};
        checkArray(a);
    }

    public static void checkArray(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.add(i);
            }
        }
        System.out.println("Null in possition/s " + result);
    }

}
