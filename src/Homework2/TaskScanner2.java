package Homework2;

import java.util.Scanner;

public class TaskScanner2 {
    public static void main(String[] args) {
        String result = setString();
        if (result == "") {
            System.out.printf("String can't be empty ");
        } else {
            System.out.printf("Your string is %s !", result);
        }
    }

    public static String setString() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Set string: ");
        String text = iScanner.nextLine();
        iScanner.close();
        return text;
    }
}
