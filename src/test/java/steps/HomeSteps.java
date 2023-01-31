package steps;

import base.StepBase;
import base.TestContext;
import helpers.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps extends StepBase {
    public HomeSteps(TestContext testContext) {
        super(testContext);
    }

    @Given("Shop page is open")
    public void shop_page_is_open() {
        driver.get(Configuration.getAppUrl());
    }

    @When("I open product {string}")
    public void i_open_product(String productName) {
        productsGridPage.openProductWithName(productName);
    }

    @Given("Random product name is chosen")
    public void random_product_name_is_chosen() {
        sharedData.put("productName",  productsGridPage.getRandomProductNameFromHomePage());
    }

}
