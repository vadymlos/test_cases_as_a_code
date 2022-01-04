package test.cases.fields.list;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import test.cases.Component;
import test.cases.Manual;
import test.cases.Tag;

public class ManualFieldListMenuOpenedTest {
    @Feature("Fillable fields")
    @Component("Fields list")
    @Story("")
    @Owner("Andrey Fiyas")
    @Manual()
    @Tag("CONSTRUCTOR")
    @Test(description = "Fields list menu opened after click on the title")
    @AllureId("47514")
    public static void field_list_menu_opened_after_on_the_title() {
        Allure.step("Open constructor");
        Allure.step("Click on tab 'Fields'");
        Allure.step("Click on title in fields list");
        Allure.step("Check that list of fields is collapsed");
        Allure.step("Click on title in fields list");
        Allure.step("Check that list of fields is opened");
    }
}
