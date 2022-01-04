package test.cases;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class ManualFieldsListMenuCollapsedTest {
    @Feature("Fillable fields")
    @Component("Fields list")
    @Story("")
    @Owner("Andrey Fiyas")
    @Manual()
    @Tag("CONSTRUCTOR")
    @Test(description = "Fields list menu collapsed after click on the title")
    @AllureId("47513")
    public static void field_list_menu_collapsed_after_on_the_title() {
        Allure.step("Open constructor");
        Allure.step("Click on title in fields list");
        Allure.step("Check that list is collapsed");
    }
}
