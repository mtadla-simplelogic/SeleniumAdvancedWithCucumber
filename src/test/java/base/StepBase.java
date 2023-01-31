package base;

import org.openqa.selenium.WebDriver;
import pages.checkout.*;
import pages.commons.ProductsGridPage;
import pages.commons.TopMenuPage;
import pages.products.CartPage;
import pages.products.CartPopupPage;
import pages.products.CategoryPage;
import pages.products.ProductDetailsPage;
import pages.user.*;

import java.util.Map;

public class StepBase {
    public StepBase(TestContext testContext) {
        this.driver = testContext.driver;
        this.sharedData = testContext.sharedData;
        categoryPage = new CategoryPage(driver);
        addressCheckoutPage = new AddressCheckoutPage(driver);
        paymentsCheckoutPage = new PaymentsCheckoutPage(driver);
        checkoutConfirmationPage = new CheckoutConfirmationPage(driver);
        personalInfoCheckoutPage = new PersonalInfoCheckoutPage(driver);
        shippingCheckoutPage = new ShippingCheckoutPage(driver);
        historyOfOrdersPage = new HistoryOfOrdersPage(driver);
        orderDetailsPage = new OrderDetailsPage(driver);
        myAccountPage = new MyAccountPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        cartPopupPage = new CartPopupPage(driver);
        cartPage = new CartPage(driver);
        productsGridPage = new ProductsGridPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
    }

    public WebDriver driver;
    public Map<String, Object> sharedData;
    //    public TestContext testContext;
    public LoginPage loginPage;
    public CategoryPage categoryPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public ProductsGridPage productsGridPage;
    public ProductDetailsPage productDetailsPage;
    public CartPopupPage cartPopupPage;
    public CartPage cartPage;
    public AddressCheckoutPage addressCheckoutPage;
    public CheckoutConfirmationPage checkoutConfirmationPage;
    public PaymentsCheckoutPage paymentsCheckoutPage;
    public PersonalInfoCheckoutPage personalInfoCheckoutPage;
    public ShippingCheckoutPage shippingCheckoutPage;
    public HistoryOfOrdersPage historyOfOrdersPage;
    public OrderDetailsPage orderDetailsPage;
    public MyAccountPage myAccountPage;


}
