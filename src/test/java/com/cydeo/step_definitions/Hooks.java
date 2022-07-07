package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;//burda io.cucumber.java seçmek önemli
//junit seçilirse error verir, önemli, yani alttaki @after @before metodları seçilirken bu talimata uymak önemli

public class Hooks {
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
