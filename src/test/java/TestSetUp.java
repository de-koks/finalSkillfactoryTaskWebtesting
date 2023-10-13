import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class TestSetUp {
    public static final WebDriver driver;
    public static final MainPage mainPage;
    public static final CoursesPage coursesPage;
    public static final TestingCoursesPage testingCoursesPage;
    public static final JavaTesterCoursePage javaTesterCoursePage;

    static {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Denis\\tools\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage = new MainPage(driver);
        coursesPage = new CoursesPage(driver);
        testingCoursesPage = new TestingCoursesPage(driver);
        javaTesterCoursePage = new JavaTesterCoursePage(driver);
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void availability_MainMenu_AllCourses_Testing_JavaTester() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainMenu();
        switchToNextTab();
        coursesPage.clickTestingButton();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(JavaTesterCoursePage.getUrl(), currentUrl);
    }

    @Test
    public void availability_MainMenu_AllCourses_JavaTester() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainMenu();
        switchToNextTab();
        coursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(JavaTesterCoursePage.getUrl(), currentUrl);
    }

    @Test
    public void availability_MainMenu_Testing_JavaTester() {
        mainPage.open();
        mainPage.clickTestingOnMainMenu();
        switchToNextTab();
        testingCoursesPage.clickJavaTesterCourseCard();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(JavaTesterCoursePage.getUrl(), currentUrl);
    }

    @Test
    public void availability_Testing_JavaTester() {
        mainPage.open();
        mainPage.clickTestingButton();
        switchToNextTab();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(JavaTesterCoursePage.getUrl(), currentUrl);
    }

    @Test
    public void signupCourseButtonOpensPopupCanBeFilled() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickSignUpForCourseButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(javaTesterCoursePage.getSignUpForCoursePopupXpath())));
        javaTesterCoursePage.fillSighCoursePopUp();
    }

    @Test
    public void readBlogButtonOpensBlogPage() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickReadBlogButton();
        switchToNextTab();
        StringBuffer stringBuffer = new StringBuffer(driver.getCurrentUrl());
        String currentPage = stringBuffer.substring(0, javaTesterCoursePage.getBlogPageUrl().length());
        assertEquals(javaTesterCoursePage.getBlogPageUrl(), currentPage);
    }

    @Test
    public void javaTesterPageHabrButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickHabrButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getHabrPageUrl(), driver.getCurrentUrl());
    }

    @Test
    public void javaTesterPageVkButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickVkButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getVkPageUrl(), driver.getCurrentUrl());
    }

    @Test
    public void javaTesterPageTwitterButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickTwitterButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getTwitterPageUrl(), driver.getCurrentUrl());
    }

    @Test
    public void javaTesterPageYoutubeButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickYoutubeButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getYoutubePageUrl(), driver.getCurrentUrl());
    }
}
