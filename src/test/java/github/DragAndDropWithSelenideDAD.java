package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDropWithSelenideDAD {
    @Test
    void createDragAndDrop() {

        // открыть страницу https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // перенести прямоугольник А на место В
        SelenideElement A = $("#column-a");
        SelenideElement B = $("#column-b");
        $(A).dragAndDropTo(B);

        // проверить, что прямоугольники действительно поменялись
        $(B).$("header").shouldHave(text("A"));
    }
}
