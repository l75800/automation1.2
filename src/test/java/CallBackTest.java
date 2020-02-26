import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

class CallbackTest {
        @Test
        void shouldTest() {
            open("http://localhost:9999");
            SelenideElement form = form.$("[data-test-id=callback-form]");
            form.$("[data-test-id=name] input").setValue("Василий");
            form.$("[data-test-id=phone] input").setValue("+79270000000");
            form.$("[data-test-id=agreement]").click();
            form.$("[data-test-id=submit]").click();
            $(".alert-success").shouldHave(exactText("Ваша заявка успешно отправлена!"));
        }

    private Object exactText(String s) {
    }

    private void open(String s) {
    }
}
}
