import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursesPage {
    private final WebDriver driver;
    public CoursesPage(WebDriver driver){
        this.driver = driver;
    }

    private static final String TESTING_BUTTON_XPATH = "//a[contains(@class,'tn-atom') and text()='Тестирование']";
    private static final String JAVA_TESTER_COURSE_CARD_XPATH = "//li[@id='QAJA']";

    public void clickTestingButton() {
        driver.findElement(By.xpath(TESTING_BUTTON_XPATH)).click();
    }

    public void clickJavaTesterCourseCard() {
        driver.findElement(By.xpath(JAVA_TESTER_COURSE_CARD_XPATH)).click();
    }
}
