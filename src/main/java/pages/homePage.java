package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Accessors(fluent = true)
public class homePage {
    private final SelenideElement searchBar = $("#gh-ac");
    private final SelenideElement searchButton = $("#gh-btn");
}
