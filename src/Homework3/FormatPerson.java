package Homework3;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;

public class FormatPerson {

    private String name;
    private String surname;
    private String fatherName;

    private String birthDate;

    private String phone;
    private String gender;

    public FormatPerson(String a, String b, String c, String d, String e, String f) {
        this.surname = a;
        this.name = b;
        this.fatherName = c;
        this.birthDate = d;
        this.phone = e;
        this.gender = f;
    }

    public FormatPerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] fullName() {
        String[] fName = new String[3];
        fName[0] = this.surname;
        fName[1] = this.name;
        fName[2] = this.fatherName;

        return fName;
    }

    public boolean checkText2(String text) {
        boolean result = false;
        char letter = text.charAt(0);
        if (Character.isUpperCase(letter)) {
            result = true;
        }
        return result;
    }

    public void checkName2() throws MyException {
        boolean result;
        String[] a = fullName();
        for (int i = 0; i < 3; i++) {
            result = this.checkText2(a[i]);
            if (result == false) {
                throw new MyException("Name " + a[i] + " should starts with capital Letter");
            }
        }
    }
    public boolean validateDate2(String date) {
        boolean result = false;
        if (date.length() == 10) {
            if (isDate(date) == true) {
                result = isDateValid(date);
            } else {
                return result;
            }
        }
        return result;
    }

    public boolean isDateValid(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);
        return sdf.parse(date, new ParsePosition(0)) != null;
    }

    public boolean isDate(String a) {
        boolean res = false;
        for (int i = 0; i < a.length(); i++) {
            res = false;
            char c = a.charAt(i);
            if (i == 2 || i == 5) {
                if (c == '.') {
                    res = true;
                } else {
                    return res;
                }
            } else if (Character.isDigit(c)) {
                res = true;
            } else {
                return res;
            }
        }
        return res;
    }

    public void correctDate2() throws MyException {
        String date = this.birthDate;
        boolean result = this.validateDate2(date);
        if (result == false) {
            throw new MyException("Date " + date + " is incorrect");
        }
    }

    public boolean checkPhone2(String data) {
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void correctPhone() throws MyException {
        String phone = this.phone;
        boolean result = this.checkPhone2(phone);
        if (result == false) {
            throw new MyException("Phone " + phone + " is incorrect");
        }
    }

    public boolean checkGender2(String data) {
        boolean result = false;
        char gender = data.charAt(0);
        if (gender == 'm') {
            return true;
        } else if (gender == 'f') {
            result = true;
        }
        return result;
    }

    public void correctGender2() throws MyException {
        String gender = this.gender;
        boolean result = this.checkGender2(gender);
        if (result == false) {
            throw new MyException("Gender " + gender + " is incorrect");
        }
    }

}

