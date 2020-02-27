import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.exactText;



class CardOrder {
        @Test
        void shouldTest() {
            open("http://localhost:9999");
            SelenideElement form = $("[div id=root]");
            form.$("[input__control=name] input").setValue("Василий");
            form.$("[input__control=phone] input").setValue("+79270000000");
            form.$("[checkbox__control=agreement] input").click();
            form.$("span.button__text").click();
            $(".alert-success").shouldHave(exactText("Ваша заявка успешно отправлена!"));
        }
}
