package Homework2;

public class Task2 {
    public static void main(String[] args) {
        //int[] intArray = {1, 3, 5, 34, 543};
        int[] intArray = {1, 3, 5, 34, 543, 4589, 345, 45, 5342};
        //Integer[] intArray = {1, 3, 5, 34, 4, 4589, 345, 45, null};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (ArrayIndexOutOfBoundsException o){
            System.out.println("Catching exception: " + o);
        }catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (NullPointerException n) {
            System.out.println("Catching exception: " + n);
        }
    }
}
