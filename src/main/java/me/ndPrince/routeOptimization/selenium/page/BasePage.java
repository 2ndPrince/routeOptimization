package me.ndPrince.routeOptimization.selenium.page;

import me.ndPrince.routeOptimization.selenium.config.SeleniumConfig;

public class BasePage {

    SeleniumConfig config = SeleniumConfig.getInstance();
    protected static final String URL = "http://demo.guru99.com/test/login.html";

    // Example of shared code
    public void closeWindow() {
        config.close();
    }

    public String currentPageUrl(){
        return config.getDriver().getCurrentUrl();
    }
}
