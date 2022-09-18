package Lesson1;

public class Task1 {
    private static final int MIN_ARRAY_LENGTH = 5;
    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        int[] array2 = new int[3];
        int[] array3 = test();

        System.out.println(message(findElementIndex(array1, 3)));
        System.out.println(message(findElementIndex(array2, 3)));
        System.out.println(message(findElementIndex(array1, 4)));
        System.out.println(message(findElementIndex(array3, 0)));
    }
    public static int findElementIndex(int[] array, int element){
        if(array == null) {return  -3;}
        if(array.length < MIN_ARRAY_LENGTH) {return -1;}
        for (int i = 0; i < array.length; i++) {
            if(element == array[i]){
                return i;
            }
        }
        return -2;
    }
    public static String message(int a){
        switch (a){
            case -1: return "Array lenght less minimum";
            case -2: return "element not found";
            case -3: return "array is null";
        }
        String result = "array lenght " + a;
        return result;
    }
    public static int[] test(){
        return null;
    }
}
