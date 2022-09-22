package Lesson3;
/*
* Создайте метод doSomething(), который бросает RuntimeException.
Обработайте исключение сразу же после броска.
Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().

* */
public class Task1 {
    public static void main(String[] args) {
        //doSomething();

        try{
            doSomething();
        }catch (RuntimeException e){

            System.out.println("/ na nolj");
        }
    }

    public static void doSomething() throws RuntimeException
    {
/*        try{
            int a = 10/0;
        }catch (RuntimeException e){
            System.out.println("weeeee");
        }*/
        int a = 10/0;
    }
}

