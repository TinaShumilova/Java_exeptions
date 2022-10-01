package Homework3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) throws MyException {
        String result = setString();
        System.out.printf(result);
        String[] data = result.trim().split("\\s+");
        int len = 6;
        System.out.println("\n");

        int excCode = checkLength(data, len);

        switch (excCode) {
            case -1:
                throw new MyException("Too many information");
            case -2:
                throw new MyException("Information not enough");
        }
        String[] sortData = sortArray(data);
        System.out.println(Arrays.toString(sortData));

        checkName(sortData);
        correctDate(sortData);
        correctPhone(sortData);
 //       correctGender(sortData);

        writeToFile(sortData);

    }

    public static String setString() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Set string: ");
        String text = iScanner.nextLine();
        iScanner.close();
        return text;
    }

    public static int checkLength(String[] text, int length) {
        if (text.length > length) {
            return -1;
        }
        if (text.length < length) {
            return -2;
        }
        return text.length;
    }

    public static void writeToFile(String[] name) {
        String fileName = name[0];
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write("<" + name[0] + "><" + name[1] + "><" + name[2] + "><" +
                    name[3] + "><" + name[4] + "><" + name[5] + ">");
        } catch (IOException ex) {
            System.out.println("Something wrong");
        }
    }

    public static String[] sortArray(String[] array) {
        String[] name = new String[6];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            if (!Character.isDigit(temp.charAt(0))) {
                if (temp.length() > 1) {
                    name[index] = array[i];
                    index += 1;
                } else {
                    name[5] = array[i];
                }
            } else {
                if (temp.charAt(2) == '.') {
                    name[3] = array[i];
                } else {
                    name[4] = array[i];
                }
            }
        }
        return name;
    }

    public static void checkName(String[] a) throws MyException {
        Format correctName = new Format();
        boolean result;
        for (int i = 0; i < 3; i++) {
            result = correctName.checkText(a[i]);
            if (result == false) {
                throw new MyException("Name " + a[i] + " should starts with capital Letter");
                //System.out.printf("Name %s should starts with capital Letter", a[i]);
            }
        }
    }

    public static void correctDate(String[] a) throws MyException {
        Format corrDate = new Format();
        String date = a[3];
        boolean result = corrDate.checkDate(date);
        if (result == false) {
            throw new MyException("Date " + date + " is incorrect");
        }
    }
    public static void correctPhone(String[] a) throws MyException {
        Format corrPhone = new Format();
        String phone = a[4];
        boolean result = corrPhone.checkPhone(phone);
        if (result == false) {
            throw new MyException("Phone " + phone + " is incorrect");
        }
    }

    public static void correctGender(String[] a) throws MyException {
/*        Format corrGender = new Format();
        String gender = a[5];
        boolean result = corrGender.checkGender(gender);
        if (result == false) {
            throw new MyException("Gender " + gender + " is incorrect");
        }*/

        String gender = a[5];
        if (gender != "m"){
            throw new MyException("Gender " + gender + " is incorrect");
        }

    }
}

