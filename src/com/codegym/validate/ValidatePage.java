package com.codegym.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePage {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Page_REGEX =  "^[0-9]{1,2}$";
    public ValidatePage(){
        pattern =Pattern.compile(Page_REGEX);
    }
    public boolean page(String regex){
        matcher     =  pattern.matcher(regex);
        return matcher.matches();
    }


}
