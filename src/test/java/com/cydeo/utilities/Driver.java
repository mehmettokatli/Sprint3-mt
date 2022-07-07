package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}
    private static WebDriver drv;



    public static WebDriver getDrv(){

        if(drv == null){


            String browser = propertiesReader.getProperty("Browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    drv = new ChromeDriver();
                    drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    drv.manage().window().maximize();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    drv = new FirefoxDriver();
                    drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    drv.manage().window().maximize();
                    break;

            }

        }

        return drv;

    }

    public static void closeDriver(){
        System.out.println("CloseDriver Çalışıyor");
        if(drv != null){
            drv.close();
            //drv.quit();
            drv = null;
        }
    }


}
