package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoardPage {


    public dashBoardPage() {
    PageFactory.initElements(Driver.getDrv(),this);
}

    @FindBy(className = "avatardiv")
    public WebElement avatarDiv;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logOutBtn;
}
