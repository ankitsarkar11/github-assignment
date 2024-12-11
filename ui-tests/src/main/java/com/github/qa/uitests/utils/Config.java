package com.github.qa.uitests.utils;

import java.util.ResourceBundle;

public class Config {
    static ResourceBundle bundle = ResourceBundle.getBundle("ui-config");
    public static String get(String parameter) {
        return bundle.getString(parameter);
    }
}
