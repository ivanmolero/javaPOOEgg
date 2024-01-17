package starter.wikipedia;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeyword {

//    @Managed(driver = "chrome")
//    WebDriver driver;

    NavigateActions navigateActions;
    SearchActions searchActions;
    SearchResult searchResult;
    SoftAssertions softAssertions = new SoftAssertions();


    @Test
    public void theKeywordShouldAppearInTheResults() {
        navigateActions.toTheWikipediaPage();
        searchActions.byKeyword("Microsoft");
//        searchActions.clickSearchButton();
        softAssertions.assertThat(searchResult.getResultTitle()).isEqualTo("Microsoft");
    }

    @Test
    public void theATagTest() {
        navigateActions.toTheWikipediaPage();
        searchActions.byKeyword("Microsoft");
        for (WebElement element: searchResult.getTagA()) {
            System.out.println(element.getText());
        }
    }
}
