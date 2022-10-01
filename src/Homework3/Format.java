package Homework3;

public class Format {
    public boolean checkText(String text) {
        boolean result = false;
        char letter = text.charAt(0);
        if (Character.isUpperCase(letter)) {
            result = true;
        }
        return result;
    }

    public boolean checkDate(String data) {
        boolean result = false;
        if (data.length() == 10) {
            char temp = '0';
            for (int i = 0; i < data.length() - 4; i++) {
                result = false;
                char date = data.charAt(i);

                switch (i) {
                    case 0:
                        if (date == '0' || date == '1' || date == '2') {
                            result = true;
                        } else if (date == '3') {
                            temp = date;
                            result = true;
                        } else {
                            return result;
                        }
                        break;
                    case 1:
                        if (temp == '3') {
                            if (date == '0' || date == '1') {
                                result = true;
                            }
                        } else if (Character.isDigit(date)) {
                            result = true;
                        } else {
                            return result;
                        }
                        break;
                    case 2:
                        if (date == '.') {
                            result = true;
                        } else {
                            return result;
                        }
                        break;
                    case 3:
                        if (date == '0') {
                            temp = date;
                            result = true;
                        } else if (date == '1') {
                            temp = date;
                            result = true;
                        } else {
                            return result;
                        }
                        break;
                    case 4:
                        if (temp == '0') {
                            if (Character.isDigit(date) && date != '0') {
                                result = true;
                            }
                        } else if (temp == '1') {
                            if (date == '0' || date == '1' || date == '2') {
                                result = true;
                            } else {
                                return result;
                            }
                        } else {
                            return result;
                        }
                        break;
                    case 5:
                        if (date == '.') {
                            result = true;
                        } else {
                            return result;
                        }
                }
            }
            for (int i = 6; i < data.length(); i++) {
                result = false;
                char date = data.charAt(i);
                if (Character.isDigit(date)) {
                    result = true;
                } else {
                    return result;
                }
            }

        }
        return result;
    }

    public boolean checkPhone(String data) {
        boolean result = false;
        for (int i = 0; i < data.length(); i++) {
            result = false;
            char number = data.charAt(i);
            if (Character.isDigit(number)) {
                result = true;
            }
        }
        return result;
    }

    public boolean checkGender(String data) {
        boolean result = false;
        char gender = data.charAt(0);
        if (gender == 'm') {
            return true;
        } else if (gender == 'f') {
            result = true;
        }
        return result;
    }

}


