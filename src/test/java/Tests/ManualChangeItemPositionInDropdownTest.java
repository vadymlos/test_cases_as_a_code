package Tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class ManualChangeItemPositionInDropdownTest {
//    @Epic("")
    @Feature("Dropdown field")
    @Component("Fillable Fields")
    @Story("")
    @Owner("Vadym Los")
    @Manual()
    @Tag("DROPDOWN FILED")
    @Test()
    @AllureId("2005")
    public static void user_can_change_position_of_item() {
        Allure.step("");
        Allure.step("step two");
        Allure.step("step three");
    }
}
