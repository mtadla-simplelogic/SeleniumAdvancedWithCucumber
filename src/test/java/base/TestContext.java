package base;

import helpers.BrowserProvider;
import helpers.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class TestContext {
    public WebDriver driver;
    public Map<String, Object> sharedData;

    @Before
    public void setUp() {
        driver = BrowserProvider.getDriver(Configuration.getBrowser());
        sharedData = new HashMap<>();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
