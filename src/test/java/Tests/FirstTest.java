package Tests;

import Tests.Component;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class FirstTest {
    @Epic("")
    @Feature("")
    @Component("")
    @Story("")
    @Owner("")
    @Manual()
    @Test
    @Tag("")
    @AllureId("")
    public static void first_test() {
        Allure.step("step one");
        Allure.step("step two");
        Allure.step("step three");
    }
}
