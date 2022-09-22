package Lesson3;

public class MyException1 extends ArithmeticException{
    public MyException1(Exception e, String message){
        super(message);
    }


    public void message(){
        System.out.println("Division by zero is not allowed");
    }
}
