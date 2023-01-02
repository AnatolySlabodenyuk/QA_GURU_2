package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

class SolutionsEnterprize {

  @Test
  void shouldHaveText() {

    // открыть страницу GitHub
    open("https://github.com/");

    // подвести мышку к блоку Solutions
    $(byText("Solutions")).hover();

    // нажать на Enterprise
    $(byText("Enterprise")).click();

    // проверить, что заголовок - "Build like the best"
    $(".enterprise-hero").shouldHave(text("Build like the best"));
  }
}


