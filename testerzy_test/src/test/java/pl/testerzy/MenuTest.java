package pl.testerzy;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;
import static org.assertj.core.api.Assertions.*;

public class MenuTest extends SeleniumTestCase {

    @Test
    public void shouldOpenKnowledgeBasePage() throws Exception {

        //when
        KnowledgePage knowledgePage = navigationMenuModule.clickOnKnowledgeBase();

        //then
//        assertTrue(knowledgePage.isKnowledgeBasePageOpen());
        assertThat(knowledgePage.isKnowledgeBasePageOpen()).isTrue();
    }

    @Test
    public void shouldOpenClientsPage() throws Exception {

        //when
        ClientsPage clientsPage = navigationMenuModule.clickOnClients();

        //then
        assertThat(clientsPage.isClientsPageOpen()).isTrue();
    }
}
