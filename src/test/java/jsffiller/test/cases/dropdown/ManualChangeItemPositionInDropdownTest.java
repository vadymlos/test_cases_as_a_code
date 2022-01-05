package jsffiller.test.cases.dropdown;

import annotation.Component;
import annotation.Manual;
import annotation.Tag;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class ManualChangeItemPositionInDropdownTest {
//    @Epic("")
    @Feature("Dropdown field")
    @Component("Fillable Fields")
    @Story("")
    @Owner("Vadym Los")
    @Manual()
    @Tag("DROPDOWN FIELD")
    @Test(description = "Item of dropdown fillable field change position after dra&drop")
    @AllureId("2005")
    public static void user_can_change_position_of_item() {
        Allure.step("Open constructor");
        Allure.step("Add dropdown fillable field");
        Allure.step("Add three item 'test1', 'test2', 'test3' to dropdown");
        Allure.step("Click button 'Save'");
        Allure.step("In editor click on dropdown field and check that three items is shown in wizard");
        Allure.step("Open constructor again");
        Allure.step("Click on dropdown fillable field");
        Allure.step("Change position of item 'test1' by drag&drop to second position");
        Allure.step("Click button 'Save'");
        Allure.step("In editor click on dropdown field and check that item 'test1' on first position and item 'item2' on first position");
    }
}
