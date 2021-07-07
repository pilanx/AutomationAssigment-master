import com.codeborne.selenide.Configuration;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class baseTest {
    static {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://www.ebay.com/";
    }

}
