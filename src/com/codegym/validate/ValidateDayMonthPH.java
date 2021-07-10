package com.codegym.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDayMonthPH {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String DayMonthPH_REGEX =  "^[0-9]{2,}$";
    public ValidateDayMonthPH(){
        pattern =Pattern.compile(DayMonthPH_REGEX);
    }
    public boolean dayMonthPH(String regex){
        matcher     =  pattern.matcher(regex);
        return matcher.matches();
    }
}
