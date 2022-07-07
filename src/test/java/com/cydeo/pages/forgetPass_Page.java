package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgetPass_Page {

    public forgetPass_Page() {
        PageFactory.initElements(Driver.getDrv(),this);
    }

    @FindBy(id = "reset-password-submit")
    public WebElement resetPassBtn;


}
