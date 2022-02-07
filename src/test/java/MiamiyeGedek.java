import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MiamiyeGedek {

    WebDriver driver;
    @BeforeTest
    public void smsgondergelirem()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\jeko\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();
    }

    @Test
    public void hardaQaldinDeGorum()
    {
        driver.get("https://www.google.com/");
        System.out.println(d;river.getTitle());
    }


}
