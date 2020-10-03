package com.github.shaikajar.ideablue;

import com.intellij.AbstractBundle;

import java.util.ResourceBundle;

public class MyBundle {
    private final static ResourceBundle BUNDLE = ResourceBundle.getBundle("messages.MyBundle");


    public static String message(String key, Object... params){
        return AbstractBundle.message(BUNDLE, key, params);
    }
}
