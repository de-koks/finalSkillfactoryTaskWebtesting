import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestingCoursesPage {
    private final WebDriver driver;

    public TestingCoursesPage(WebDriver driver) {
        this.driver = driver;
    }
    private static final String JAVA_TESTER_COURSE_CARD_CLASS = "tn-elem__5608766611679951555532";

    public void clickJavaTesterCourseCard() {
        driver.findElement(By.className(JAVA_TESTER_COURSE_CARD_CLASS)).click();
    }
}
