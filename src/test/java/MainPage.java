import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {
    private static final String MAIN_PAGE_URL = "https://skillfactory.ru/";
    private static final String ONLINE_COURSES_ON_MAIN_MENU_XPATH = "//*[@class='main__nav']//*[text()='онлайн-курсы']";
    private static final String ALL_COURSES_MAIN_MENU_XPATH = "//span[text()='Все онлайн-курсы']";
    private static final String TESTING_MAIN_MENU_XPATH = "//span[text()='Тестирование']";
    private static final String TESTING_BUTTON_XPATH = "//ul[@class='directions__list']//span[text()='Тестирование']";
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(MAIN_PAGE_URL);
    }

    public void clickAllCoursesOnMainMenu(){
        WebElement onlineCoursesOnMainMenu = driver.findElement(By.xpath(ONLINE_COURSES_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(onlineCoursesOnMainMenu).perform();
        driver.findElement(By.xpath(ALL_COURSES_MAIN_MENU_XPATH)).click();
    }

    public void clickTestingOnMainMenu() {
        WebElement onlineCoursesOnMainMenu = driver.findElement(By.xpath(ONLINE_COURSES_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(onlineCoursesOnMainMenu).perform();
        driver.findElement(By.xpath(TESTING_MAIN_MENU_XPATH)).click();
    }

    public void clickTestingButton() {
        driver.findElement(By.xpath(TESTING_BUTTON_XPATH)).click();
    }
}
