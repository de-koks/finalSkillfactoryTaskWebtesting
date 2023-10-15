import Pages.AllCoursesPage;
import Pages.JavaTesterCoursePage;
import Pages.MainPage;
import Pages.TestingCoursesPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class JavaTesterCoursePageTests {
    public static final WebDriver driver;
    public static final MainPage mainPage;
    public static final AllCoursesPage allCoursesPage;
    public static final TestingCoursesPage testingCoursesPage;
    public static final JavaTesterCoursePage javaTesterCoursePage;

    static {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Denis\\tools\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage = new MainPage(driver);
        allCoursesPage = new AllCoursesPage(driver);
        testingCoursesPage = new TestingCoursesPage(driver);
        javaTesterCoursePage = new JavaTesterCoursePage(driver);
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }

    /*
    Java QA course page is available by the path:
    Main page - > Main menu -> Online courses -> All online courses -> Testing -> Java tester card.
     */
    @Test
    public void availabilityMainMenuAllCoursesTestingJavaTester() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainMenu();
        switchToNextTab();
        allCoursesPage.clickTestingButton();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(javaTesterCoursePage.getPageUrl(), currentUrl);
    }

    /*
    Java QA course page is available by the path:
    Main page - > Main menu -> Online courses -> All online courses -> Java tester card.
     */
    @Test
    public void availabilityMainMenuAllCoursesJavaTester() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainMenu();
        switchToNextTab();
        allCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(javaTesterCoursePage.getPageUrl(), currentUrl);
    }

    /*
    Java QA course page is available by the path:
    Main page - > Main menu -> Online courses -> Testing -> Java tester card.
     */
    @Test
    public void availabilityMainMenuTestingJavaTester() {
        mainPage.open();
        mainPage.clickTestingOnMainMenu();
        switchToNextTab();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(javaTesterCoursePage.getPageUrl(), currentUrl);
    }

    /*
    Java QA course page is available by the path: Main page - > Testing -> Java tester card.
     */
    @Test
    public void availabilityTestingJavaTester() {
        mainPage.open();
        mainPage.clickTestingButton();
        switchToNextTab();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getPageUrl(), driver.getCurrentUrl());
    }

    /*
    "Sign up for a course" button on the Java tester page opens a pop-up
    with Name, Email, Phone number fields that can be filled.
     */
    @Test
    public void signupCourseButtonOpensPopupCanBeFilled() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickSignUpForCourseButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(javaTesterCoursePage.getSignUpForCoursePopupXpath())));
        javaTesterCoursePage.fillSighCoursePopUp();
    }

    /*
    "Read blog" button on the Java QA course page opens the Blog page.
     */
    @Test
    public void readBlogButtonOpensBlogPage() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickReadBlogButton();
        switchToNextTab();
        StringBuffer stringBuffer = new StringBuffer(driver.getCurrentUrl());
        String currentPage = stringBuffer.substring(0, javaTesterCoursePage.getBlogPageUrl().length());
        assertEquals(javaTesterCoursePage.getBlogPageUrl(), currentPage);
    }

    /*
    Habr button at the footer of the Java QA course page leads to the skillfactory's habr.com page.
     */
    @Test
    public void javaTesterPageHabrButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickHabrButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getHabrPageUrl(), driver.getCurrentUrl());
    }

    /*
    VKontakte button at the footer of the Java QA course page leads to the skillfactory's vk.com page.
     */
    @Test
    public void javaTesterPageVkButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickVkButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getVkPageUrl(), driver.getCurrentUrl());
    }

    /*
    Twitter button at the footer of the Java QA course page leads to the skillfactory's twitter.com page.
     */
    @Test
    public void javaTesterPageTwitterButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickTwitterButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getTwitterPageUrl(), driver.getCurrentUrl());
    }

    /*
    YouTube button at the footer of the Java QA course page leads to the skillfactory's youtube.com page.
     */
    @Test
    public void javaTesterPageYoutubeButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickYoutubeButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getYoutubePageUrl(), driver.getCurrentUrl());
    }

    /*
    Telegram button at the footer of the Java QA course page leads to the skillfactory's telegram channel.
     */
    @Test
    public void javaTesterPageTelegramButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickTelegramButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getTelegramChannelUrl(), driver.getCurrentUrl());
    }

    /*
    Dzen button at the footer of the Java QA course page leads to the skillfactory's dzen.ru page.
     */
    @Test
    public void javaTesterPageDzenButtonLeads() {
        javaTesterCoursePage.open();
        javaTesterCoursePage.clickDzenButton();
        switchToNextTab();
        assertEquals(javaTesterCoursePage.getDzenPageUrl(), driver.getCurrentUrl());
    }

}
