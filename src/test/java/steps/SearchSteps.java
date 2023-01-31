package steps;

import base.StepBase;
import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchSteps extends StepBase {
    public SearchSteps(TestContext testContext) {
        super(testContext);
    }

    @When("I search for random product")
    public void i_search_for_random_product() {
        topMenuPage.searchForProduct(sharedData.get("productName").toString());
    }
    @Then("It's name is on the search reslut list")
    public void it_s_name_is_on_the_search_reslut_list() {
        assertThat(productsGridPage.getProductNames())
                .isNotEmpty()
                .allMatch(s -> s.contains(sharedData.get("productName").toString()));
    }


}
