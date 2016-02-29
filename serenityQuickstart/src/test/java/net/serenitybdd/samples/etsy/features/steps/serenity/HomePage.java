package net.serenitybdd.samples.etsy.features.steps.serenity;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://www.etsy.com")
public class HomePage extends PageObject {

    @FindBy(css = "button[value='Search']")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#search-query").sendKeys(keywords);
        searchButton.click();
    }
}
