package Homework1;
/*
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
* каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
* Если длины массивов не равны, необходимо как-то оповестить пользователя.
* Важно: При выполнении метода единственное исключение,
* которое пользователь может увидеть - RuntimeException, т.е. ваше
 * */
import java.util.Arrays;

public class CreateNewArrayDiv {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 2, 1, 3};
        int[] array3 = {1, 3, 1};
        int[] array4 = {1, 0, 2};
        createArrayDiv(array1, array2);
        createArrayDiv(array1, array3);
        createArrayDiv(array3, array4);
    }

    public static void createArrayDiv(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            double[] arr3 = new double[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if(arr2[i] == 0){
                    throw new RuntimeException("Division by zero is not allowed");
                }
                arr3[i] = Double.valueOf(arr1[i]) / Double.valueOf(arr2[i]);
            }
            System.out.println(Arrays.toString(arr3));
        }else{
            System.out.println("Array lengths are not equal");
        }
    }
}
