package com.codegym.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassWordPerson {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PassWordPerson_REGEX =  "^[A-Za-z0-9]*@$";
    public ValidatePassWordPerson(){
        pattern =Pattern.compile(PassWordPerson_REGEX);
    }
    public boolean PassWordPerson(String regex){
        matcher     =  pattern.matcher(regex);
        return matcher.matches();
    }
}
