package steps;

import base.StepBase;
import base.TestContext;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class CartSteps extends StepBase {
    public CartSteps(TestContext testContext) {
        super(testContext);
    }

    @Then("Empty message label is not displayed")
    public void empty_message_label_is_not_displayed() {
        Assertions.assertThat(cartPage.isEmptyMsgLblDisplayed()).isFalse();
    }

    @Then("Product name in basket is {string}")
    public void product_name_in_basket_is(String productName) {
        Assertions.assertThat(cartPage.getProductName()).isEqualTo(productName);
    }

    @Then("Product quantity is {string}")
    public void product_quantity_is(String quantity) {
        Assertions.assertThat(cartPage.getProductQuantity()).isEqualTo(quantity);
    }

    @Then("Product price is {string}")
    public void product_price_is(String price) {
        Assertions.assertThat(cartPage.getProductPrice()).isEqualTo(price);
    }

    @Then("Product total price is {string}")
    public void product_total_price_is(String totalPrice) {
        Assertions.assertThat(cartPage.getTotalProductPrice()).isEqualTo(totalPrice);
    }
}
