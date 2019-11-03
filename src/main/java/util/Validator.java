package util;

public class Validator {

    public boolean isValid(String str) {
        if (isNumber(str)) {
            if (getInt(str) <= 0) {
                return false;
            } else
                return true;
        } else {
            return false;
        }
    }

    public boolean isNumber(String str) {
        return str.matches("\\d+");
    }

    public int getInt(String str) {
        return Integer.parseInt(noTub(str));
    }

    public String noTub(String str) {
        return str.replaceAll("\\s+", "");
    }

    public boolean continueRequest(String answer) {
        answer = answer.replaceAll("\\s+", "").toUpperCase();
        if(answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }
}
