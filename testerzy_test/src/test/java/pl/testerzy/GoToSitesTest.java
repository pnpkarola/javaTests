package pl.testerzy;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class GoToSitesTest extends SeleniumTestCase {

    @Test
    public void shouldGoToYouTube() throws Exception {
        YouTubePage youTubePage = homePage.goToYouTube();

        assertThat(youTubePage.getCurrentUrl()).contains("/user/testerzy");
    }
}
