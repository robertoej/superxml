package br.com.superxml.utils;

import java.io.InputStream;

public class Utils {
    private static final Utils INSTANCE = new Utils();

    private Utils() {

    }

    public static Utils getInstance() {
        return INSTANCE;
    }

    public InputStream getResourceAsStream(String resourceName) {
        return this.getClass().getClassLoader().getResourceAsStream(resourceName);
    }
}
