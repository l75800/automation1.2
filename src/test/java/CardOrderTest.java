import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;


class CardOrderTest {
        @Test
        void shouldTest() {
            open("http://localhost:9999");
            SelenideElement form = $("[id=root]");
            form.$("[name]").setValue("Иванов Василий");
            form.$("[name=phone]").setValue("+79876987564");
            form.$("span.checkbox__box").click();
            form.$("button[type=button] ").click();
            $("p.paragraph.paragraph_theme_alfa-on-white").shouldHave(text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
        }
}

