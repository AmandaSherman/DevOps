package com.sourceallies.interview;


public class Solution {
    
    public static final String invalidSyntaxError = "Error - Invalid syntax";
    public static final String errorMessage = "Error - Input includes unrecognized character(s)";

    public String guard(String str) {
        if (str.contains("++")){
            return invalidSyntaxError;
        }
        return "";
    }

    public boolean guard2(String str) {
        boolean valid = true;
        if(str.contains("++")) {
            valid = false;
        }
        return valid;
    }

    private double parseNumber(String str) {
        if (str.equals("")){
            return 0.0;
        }
        double str2 = Double.parseDouble(str);
        return str2;
    }

    public String doMath(String str) {
        if(guard(str).equals(invalidSyntaxError)) {
            return invalidSyntaxError;
        }

        if(!guard2(str)) {
            return invalidSyntaxError;
        }

        try {
            if (str.contains("+")) {
                String[] splitString = str.split("\\+");

                double num1 = parseNumber(splitString[0]);
                double num2 = parseNumber(splitString[1]);

                double ans = num1 + num2;
                
                return String.valueOf(ans);
            }
            parseNumber(str);
        } catch (NumberFormatException e) {
            return errorMessage;
        }

        return str;
    }
}
