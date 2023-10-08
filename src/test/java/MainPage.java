import org.openqa.selenium.WebDriver;

public class MainPage {
    private static final String MAIN_PAGE_URL = "https://skillfactory.ru/";
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(MAIN_PAGE_URL);
    }
}
