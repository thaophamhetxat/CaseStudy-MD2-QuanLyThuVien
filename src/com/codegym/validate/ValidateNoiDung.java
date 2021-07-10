package com.codegym.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNoiDung {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NoiDung_REGEX =  "^[a-zA-Z0-9]$";
    public ValidateNoiDung(){
        pattern =Pattern.compile(NoiDung_REGEX);
    }
    public boolean noiDung(String regex){
        matcher     =  pattern.matcher(regex);
        return matcher.matches();
    }
}
