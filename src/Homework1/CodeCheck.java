package Homework1;
/*
* 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 * */
public class CodeCheck {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3"},{"4", "5", null}};
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {               //ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]);  //NumberFormatException
                sum += val;
            }
        }
        return sum;
    }
}
