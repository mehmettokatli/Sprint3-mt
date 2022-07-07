package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesReader {

    private static Properties properties = new Properties();


    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("There is a problem about configuration properties");
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }
}
