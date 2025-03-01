package tests;

import com.codeborne.selenide.Selenide;
import config.DataConfig;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    private static final DataConfig configData =
            ConfigFactory.create(
                    DataConfig.class,
                    System.getProperties()
            );
    @BeforeAll
    public static void beforeAll(){
        WebDriverConfig webDriverConfig = new WebDriverConfig(configData);
        webDriverConfig.dataConfig();

    }
    @AfterEach
    public void afterEach(){
        Selenide.closeWebDriver();
    }
}