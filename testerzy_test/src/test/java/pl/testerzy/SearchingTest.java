package pl.testerzy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class SearchingTest extends SeleniumTestCase {

    @Test(dataProvider = "positivePhrase")
    public void shouldSearchPositive(String phrase) throws Exception {
        //when
        SearchResultPage searchResultPage = navigationMenuModule.searchPhrase(phrase);

        //then
        assertThat(searchResultPage.hasResults()).isGreaterThanOrEqualTo(0);
    }

    @DataProvider(name = "positivePhrase")
    public static Object[][] getPositivePhrase() {
        return new Object[][]{
                {"tester"}
        };
    }
}
