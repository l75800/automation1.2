import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



class CardOrderTest {
        @Test
        void shouldTest() {
            open("http://localhost:9999");
            SelenideElement form = $("[id=root]");
            form.$("[name]").setValue("Иванов Василий");
            form.$("[name=phone]").setValue("+79876987564");
            form.$("[checkbox__box]").click();
            form.$("button[type=button] ").click();
            $(".order-success").shouldHave(exactText("Ваша заявка успешно отправлена!"));
        }
}
