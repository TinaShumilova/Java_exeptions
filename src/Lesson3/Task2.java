package Lesson3;
/*Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources и
 после выхода из блока, он не давал больше возможности выполнять метод add(),
 а при попытке это сделать бросал бы исключение. Подумайте над типом исключения.
*/
public class Task2 {
    public static void main(String[] args) throws Exception {

        try(Counter b = new Counter();) {
            System.out.println(b.add());
        }

           // b.add();

    }

}
