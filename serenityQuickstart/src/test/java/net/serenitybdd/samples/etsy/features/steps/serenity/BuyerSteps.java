package net.serenitybdd.samples.etsy.features.steps.serenity;

import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class BuyerSteps {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @Step
    public void opens_etsy_home_page() {
        homePage.open();
    }

    @Step
    public void searches_for_items_containing(String keywords) {
        homePage.searchFor(keywords);
    }

    @Step
    public void should_see_items_related_to(String keywords) {
        List<String> resultTitles = searchResultsPage.getResultTitles();
        resultTitles.stream().forEach(title -> assertThat(title.contains(keywords)));
    }
}