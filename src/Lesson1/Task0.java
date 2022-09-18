package Lesson1;

public class Task0 {
    private static final int MIN_ARRAY_LENGTH = 5;
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        System.out.println(getArrayLenght(array1));
    }
    public static int getArrayLenght(int[] array){
        if (array.length >= MIN_ARRAY_LENGTH) return array.length;
        return -1;
    }
}
