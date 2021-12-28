package Tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class FirstTest {
    @Epic("")
    @Feature("")
    @Component("")
    @Story("")
    @Owner("")
    @Manual()
    @Tag("")
    @Test
    @AllureId("")
    public static void first_test() {
        Allure.step("step one");
        Allure.step("step two");
        Allure.step("step three");
    }
}
