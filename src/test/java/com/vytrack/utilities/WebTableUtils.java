package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebTableUtils {

    ////thead[@class='grid-header']//span[@class='grid-header-cell__label']
    // burada sayfada table var ve oradaki ustteki headerleri aldik hepsini..
    //https://qa1.vytrack.com/entity/Extend_Entity_VehiclesModel?grid%5Bcustom-entity-grid%5D=i%3D1%26p%3D25%26s%255BMake%255D%3D-1%26c%3Did0.ModelName1.Make1.Canberequested1.CatalogValue1.CO2Fee1.Cost1.TotalCost1.CO2Emissions1.FuelType1.Vendors1%26v%3D__all__%26a%3Dgrid%26g%255Bclass_name%255D%3DExtend%255CEntity%255CVehiclesModel

    /**
     * this method is using for finding vehicle model table headers
     *
     * @return List<String> titles
     */

    public static List<String> getHeadersFromVehicleModelTable() {
        List<WebElement> headerElements = Driver.getDriver().findElements(By.xpath("//thead[@class='grid-header']//th//span[1]"));
        List<String> headerTitles = new ArrayList<>();
        headerElements.forEach(k -> headerTitles.add(k.getText()));
        return headerTitles;
    }

}
