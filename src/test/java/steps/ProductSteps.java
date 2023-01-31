package steps;

import base.StepBase;
import base.TestContext;
import io.cucumber.java.en.When;

public class ProductSteps extends StepBase {
    public ProductSteps(TestContext testContext) {
        super(testContext);
    }

    @When("Set quantity to {int}")
    public void set_quantity_to(int quantity) {
        productDetailsPage.setQuantity(quantity);
    }

    @When("Add Product to card")
    public void add_product_to_card() {
        productDetailsPage.addToCart();
    }

    @When("Proceed to checkout")
    public void proceed_to_checkout() {
        cartPopupPage.proceedToCheckout();
    }

}
