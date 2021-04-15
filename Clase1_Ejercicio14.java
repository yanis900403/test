package Clase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Clase1_Ejercicio14 {

    @Test
    //Ejercicio #14
    public void Exercice14(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.netflix.com.uy/");

        List<WebElement> Elements_h1= driver.findElements(By.tagName("h1"));
        for (WebElement h1:Elements_h1){
            System.out.println("Elementos de tipo h1 son:" + h1.getText());
        }

        List<WebElement> Elements_h2= driver.findElements(By.tagName("h2"));
        for (WebElement h2:Elements_h2){
            System.out.println("Los elementos de tipo h2 son:" + h2.getText());
        }

        driver.navigate().refresh();

        List<WebElement> Elements_Buttons=driver.findElements(By.tagName("button"));
        for (WebElement Text_Button:Elements_Buttons){
            System.out.println("Los elementos de los botones son:" + Text_Button.getText());
        }

        List<WebElement> Cant_Elements_div=driver.findElements(By.tagName("div"));
        System.out.println("Cantidad de elementos de tipo div son:" + Cant_Elements_div.size());

        System.out.println("Titulo de la pagina" + driver.getTitle());

        List<WebElement> Elements_Tipo_Link= driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de elementos de tipo link es:" + Elements_Tipo_Link.size());
    }
}
