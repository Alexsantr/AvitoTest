package pages;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Slf4j
public class SearchPages {

    @Step("Открытие Авито")
    public SearchPages openPage() {
        open("");
        return this;
    }
    @Step("Поиск товара")
    public void searchGoods(){
        $("#bx_search").setValue("Унитаз");
        $("button[data-marker='search-form/submit-button']").click();
        $("div[data-marker='catalog-serp']").shouldBe(visible);

    }
}


