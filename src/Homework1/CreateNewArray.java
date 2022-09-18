package Homework1;

import java.util.Arrays;

/*
* 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
* каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
* Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * */
public class CreateNewArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 2, 1, 3};
        int[] array3 = {1, 3, 1};
        createArray(array1, array2);
        createArray(array1, array3);
    }

    public static void createArray(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
                }
            System.out.println(Arrays.toString(arr3));
        }else{
            System.out.println("Array lengths are not equal");
        }
    }
}
