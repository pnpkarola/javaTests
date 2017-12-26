package pl.testerzy;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CookieTest extends SeleniumTestCase {

    @Test
    public void shouldCloseCookiesMessage() throws Exception {
        homePage.closeCookiesMessage();

        assertThat(homePage.hasNoCookiesMessage()).isTrue();
    }
}
