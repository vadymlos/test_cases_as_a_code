package test.cases.fields.list;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import test.cases.Component;
import test.cases.Manual;
import test.cases.Tag;

public class ManualChangeColorOfFieldAfterClickTest {
    @Feature("Fillable fields")
    @Component("Fields list")
    @Story("")
    @Owner("Andrey Fiyas")
    @Manual()
    @Tag("CONSTRUCTOR")
    @Test(description = "Field changes color to active after click")
    @AllureId("47512")
    public static void field_changes_color_to_active_after_click() {
        Allure.step("Open constructor");
        Allure.step("Click on text field and check color of item in fields list");
        Allure.step("Add this field to document");
    }
}
