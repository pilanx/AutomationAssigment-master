package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
@Accessors(fluent = true)
public class resultPage {
    private final SelenideElement sortMenu = $(byText("Best Match"));
    private final SelenideElement sortLowToHigh = $(byText("Price + Shipping: lowest first"));
    private final ElementsCollection itemLinks = $$(byClassName("s-item__link"));


}
