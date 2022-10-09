package Homework3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) throws MyException {
        String result = setString2();
        String[] data = result.trim().split("\\s+");
        int len = 6;
        int excCode = checkLength2(data, len);

        switch (excCode) {
            case -1:
                throw new MyException("Too many information");
            case -2:
                throw new MyException("Information not enough");
        }
        String[] sd = sortArray(data);

        FormatPerson personData = new FormatPerson(sd[0], sd[1], sd[2], sd[3], sd[4], sd[5]);

        personData.checkName2();
        personData.correctDate2();
        personData.correctPhone();
        personData.correctGender2();

        writeToFile(sd);

    }


    public static String setString2() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Set string: ");
        String text = iScanner.nextLine();
        iScanner.close();
        return text;
    }

    public static int checkLength2(String[] text, int length) {
        if (text.length > length) {
            return -1;
        }
        if (text.length < length) {
            return -2;
        }
        return text.length;
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

    public static void writeToFile(String[] name) {
        String fileName = name[0];
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write("<" + name[0] + "><" + name[1] + "><" + name[2] + "><" +
                    name[3] + "><" + name[4] + "><" + name[5] + ">");
        } catch (IOException ex) {
            System.out.println("Something wrong");
        }
    }
}

