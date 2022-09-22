package Homework2;

import java.util.Scanner;

public class TaskScanner {
    public static void main(String[] args) {
        try{
            setNumber();
        }catch (NumberFormatException e){
            System.out.println("Wrong number!");
            setNumber();
        }
    }
    public static void setNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Set float number: ");
        float number = Float.parseFloat(iScanner.nextLine());
        System.out.printf("Your number is, %s!", number);
        iScanner.close();
    }
}
