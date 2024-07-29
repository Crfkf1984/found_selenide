import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideSearchRepository {


    @BeforeAll
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\.cache\\selenium\\chromedriver\\win64\\126.0.6478.126\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void checkVisibleSelenideTest() {
        open("https://github-landing.parthmadhvani2.vercel.app/");
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();

    }
}