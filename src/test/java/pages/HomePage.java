package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.*;

public class HomePage extends BasePage {


    public  void title_method(String expectedResult){

        WebElement title=Driver.get().findElement(By.xpath("//h2[text()='"+expectedResult+"']"));
        String actualResult= title.getText();
        assertEquals(expectedResult,actualResult);
        System.out.println("actualResult = " + actualResult);
        System.out.println("expectedResult = " + expectedResult);

    }

    public void menu(String part) throws InterruptedException {
        WebElement menu= Driver.get().findElement(By.xpath("//a[text()='"+part+"']"));
        menu.click();
        Thread.sleep(3000);

    }
}
