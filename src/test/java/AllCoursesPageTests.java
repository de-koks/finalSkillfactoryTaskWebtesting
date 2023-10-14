import Pages.AllCoursesPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllCoursesPageTests {

    public static final WebDriver driver;
    public static final AllCoursesPage allCoursesPage;

    static {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Denis\\tools\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        allCoursesPage = new AllCoursesPage(driver);
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }

    /*
The Proforientation test card on the All Courses page leads to the Proforientation test page.
 */
    @Test
    public void allCoursesPageProforientationTestCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickProforientationTestCard();
        switchToNextTab();

        StringBuffer stringBuffer = new StringBuffer(driver.getCurrentUrl());
        String currentPage = stringBuffer.substring(0, allCoursesPage.getProforientationTestPageUrl().length());
        assertEquals(allCoursesPage.getProforientationTestPageUrl(), currentPage);
    }

    /*
    The "IT specialist from scratch" course card on the All Courses page leads to the IT specialist from scratch course page.
     */
    @Test
    public void allCoursesITspecFromScratchCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickItSpecFromScratchCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getItSpecFromScratchPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Python automation tester" course card on the All Courses page leads to the Python automation tester course page.
     */
    @Test
    public void allCoursesPythonTesterCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickPythonTesterCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getPythonTesterPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Python developer" course card on the All Courses page leads to the Python developer course page.
     */
    @Test
    public void allCoursesPythonDevCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickPythonDeveloperCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getPythonDeveloperPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Data analyst" course card on the All Courses page leads to the Data analyst course page.
     */
    @Test
    public void allCoursesDataAnalystCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickDataAnalystCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getDataAnalystPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Graphical designer from scratch to pro" course card on the All Courses page
    leads to the Graphical designer from scratch to pro course page.
     */
    @Test
    public void allCoursesGraphDesignerProCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickGraphDesignerProCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getGraphDesignerProPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Python developer pro" course card on the All Courses page leads to the Python developer pro course page.
     */
    @Test
    public void allCoursesPythonDevProCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickPythonDeveloperProCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getPythonDeveloperProPageUrl(), driver.getCurrentUrl());
    }

    /*
    The Data scientist" course card on the All Courses page leads to the Data scientist course page.
     */
    @Test
    public void allCoursesDataScientistCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickDataScientistCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getDataScientistPageUrl(), driver.getCurrentUrl());
    }
}
