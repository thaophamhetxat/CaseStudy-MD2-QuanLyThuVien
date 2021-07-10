package com.codegym.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDay {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String DAY_REGEX =  "^[0-9]{2,}[/][0-9]{2,}[/][0-9]{4,}$";
    public ValidateDay(){
        pattern =Pattern.compile(DAY_REGEX);
    }
    public boolean validate(String regex){
        matcher     =  pattern.matcher(regex);
        return matcher.matches();
    }


}
