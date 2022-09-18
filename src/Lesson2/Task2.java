package Lesson2;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3"},{"4", "5", "6"}};
        System.out.println(sum2d(array));
    }
    public static int sum2d(String[][] arr){
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Index Out Of Bounds");
        }catch (NumberFormatException n) {
            System.out.println("Can't format to the number ");
        }
        return sum;
    }
}
