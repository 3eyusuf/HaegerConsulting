package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import static org.junit.Assert.*;

public class HomePage extends BasePage {

    @FindBy(id = "heager-svg-logo")
    public WebElement logo_loc;


    public  void title_method(String expectedResult){

        WebElement title=Driver.get().findElement(By.xpath("//h2[text()='"+expectedResult+"']"));
        String actualResult= title.getText();
        assertEquals(expectedResult,actualResult);

    }

    public void menu(String part) throws InterruptedException {
        WebElement menu= Driver.get().findElement(By.xpath("//a[text()='"+part+"']"));
        menu.click();
        Thread.sleep(3000);

    }

}
