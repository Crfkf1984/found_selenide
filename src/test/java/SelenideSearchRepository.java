import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchRepository {


    @BeforeAll
    public static void before() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void checkVisibleSelenideTest() {
        open("https://github.com");
        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid='results-list'] div").get(0).$("div:last-child a").click();
        $$("#repository-container-header ul li").get(8).$("a").click();
        $$("#wiki-body ul li").get(8).$("a").shouldHave(text("Soft assertions"));
        $$("#wiki-body ul li").get(8).$("a").click();
        $$(".markdown-body div.markdown-heading").get(5).shouldHave(text("3. Using JUnit5 extend test class:"));

    }
}