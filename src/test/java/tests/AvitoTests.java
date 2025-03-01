package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchPages;

public class AvitoTests extends tests.BaseTest {

    SearchPages searchPages = new SearchPages();

    @Test
    @Tag("demode")
    public void AvitoTest() {
        searchPages.openPage()
                .searchGoods();


    }


}

