package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class US1_Test_Main_Modules extends TestBase {

    @Test
    public void verifying_modules_as_sales_manager(){
        VytrackUtils.loginAsSalesManager();
      List<WebElement> modeuleElement =
              Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

      List<String> actualmoduleTexts = new ArrayList<>();

       /* for (WebElement each : modeuleElement) {
            modeuleElement.add(each.getText());
            actualmoduleTexts.add(modeuleElement);
        }

        */

        modeuleElement.forEach(k->actualmoduleTexts.add(k.getText()));

        System.out.println("actualmoduleTexts = " + actualmoduleTexts);

        List<String> expectedmoduleTexts = new ArrayList<>();
    }
}
