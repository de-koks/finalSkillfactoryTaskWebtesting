import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllCoursesPage {
    private final WebDriver driver;
    public AllCoursesPage(WebDriver driver){
        this.driver = driver;
    }

    private static final String ALL_COURSES_PAGE_URL = "https://skillfactory.ru/courses";
    private static final String TESTING_BUTTON_XPATH = "//a[contains(@class,'tn-atom') and text()='Тестирование']";
    private static final String JAVA_TESTER_COURSE_CARD_XPATH = "//li[@id='QAJA']";
    private static final String PROFORIENTATION_TEST_CARD_XPATH = "//div[@class='card__link']//a[text()='Найдите свое призвание']";
    private static final String PROFORIENTATION_TEST_PAGE_URL = "https://free.skillfactory.ru/proftest?utm_source=sf-index&utm_medium=site&utm_campaign=np_all_all_sf-index_site_lp_leadmagnet-111_none_all_sf_catalog-card&utm_content=catalog-card";
    public String getProforientationTestPageUrl() { return PROFORIENTATION_TEST_PAGE_URL; }

    public void open() { driver.get(ALL_COURSES_PAGE_URL); }
    public void clickTestingButton() {
        driver.findElement(By.xpath(TESTING_BUTTON_XPATH)).click();
    }
    public void clickJavaTesterCourseCard() {
        driver.findElement(By.xpath(JAVA_TESTER_COURSE_CARD_XPATH)).click();
    }
    public void clickProforientationTestCard() {
        driver.findElement(By.xpath(PROFORIENTATION_TEST_CARD_XPATH)).click();
    }
}
