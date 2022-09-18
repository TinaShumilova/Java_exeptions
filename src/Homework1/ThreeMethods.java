package Homework1;
/*
* 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 * */

import java.util.Arrays;

public class ThreeMethods {
    public static void main(String[] args) {
        System.out.println(firstMethod(5, 0));
        System.out.println(Arrays.toString(secondMethod(10, 100 , 1)));
        System.out.println(thirdMethod());

    }

    public static int firstMethod(int a, int b){
        return a/b;
    }

    public static int[] secondMethod(int a, int b, int c){
        int[] array = new int[a];
        array[b] = c;
        return array;
    }

    public static int thirdMethod(){
        String temp = null;
        return temp.length();
    }
}
