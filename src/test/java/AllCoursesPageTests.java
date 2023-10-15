import Pages.AllCoursesPage;
import org.junit.jupiter.api.AfterAll;
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

    @AfterAll
    public static void closeDriver() {
        driver.quit();
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
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

        StringBuilder stringBuffer = new StringBuilder(driver.getCurrentUrl());
        String currentPage = stringBuffer.substring(0, allCoursesPage.getProforientationTestPageUrl().length());
        assertEquals(allCoursesPage.getProforientationTestPageUrl(), currentPage);
    }

    /*
    The "IT specialist from scratch" course card on the All Courses page leads to the IT specialist from scratch course page.
     */
    @Test
    public void allCoursesITSpecFromScratchCardLeads() {
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
    The Data scientist course card on the All Courses page leads to the Data scientist course page.
     */
    @Test
    public void allCoursesDataScientistCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickDataScientistCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getDataScientistPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Data scientist from scratch to pro" course card on the All Courses page leads to the Data scientist from scratch to pro course page.
     */
    @Test
    public void allCoursesDataScientistProCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickDataScientistProCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getDataScientistProPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Project manager in IT" course card on the All Courses page leads to the Project manager in IT course page.
     */
    @Test
    public void allCoursesProjectManagerCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickProjectManagerCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getProjectManagerPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Fullstack Python developer" course card on the All Courses page leads to the Fullstack Python developer course page.
     */
    @Test
    public void allCoursesFullstackPythonDevCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickFullstackPythonDeveloperCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getFullstackPythonDeveloperPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "White hacker" course card on the All Courses page leads to the White hacker course page.
     */
    @Test
    public void allCoursesWhiteHackerCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickWhiteHackerCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getWhiteHackerPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "UX/UI designer from scratch to pro" course card on the All Courses page
    leads to the UX/UI designer from scratch to pro course page.
     */
    @Test
    public void allCoursesUxUiDesignerProCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickUxUiDesignerProCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getUxUiDesignerProPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Internet marketer" course card on the All Courses page leads to the Internet marketer course page.
     */
    @Test
    public void allCoursesInternetMarketerCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickInternetMarketerCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getInternetMarketerPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Data sciences" course card on the All Courses page leads to the Data sciences course page.
     */
    @Test
    public void allCoursesDataSciencesMiptCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickDataSciencesMiptCard();
        switchToNextTab();
        StringBuffer stringBuffer = new StringBuffer(driver.getCurrentUrl());
        String currentUrl = stringBuffer.substring(0, allCoursesPage.getDataSciencesMiptPageUrl().length());
        assertEquals(allCoursesPage.getDataSciencesMiptPageUrl(), currentUrl);
    }

    /*
    The "IT products management" course card on the All Courses page leads to the IT products management course page.
     */
    @Test
    public void allCoursesITProductsManagementMiptCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickItProductsManagementMiptCard();
        switchToNextTab();
        StringBuffer stringBuffer = new StringBuffer(driver.getCurrentUrl());
        String currentUrl = stringBuffer.substring(0, allCoursesPage.getItProductsManagementMiptPageUrl().length());
        assertEquals(allCoursesPage.getItProductsManagementMiptPageUrl(), currentUrl);
    }

    /*
    The "Neural network specialist" course card on the All Courses page leads to the Neural network specialist course page.
     */
    @Test
    public void allCoursesNeuralNetworkSpecCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickNeuralNetworksSpecCard();
        switchToNextTab();
        assertEquals(allCoursesPage.getNeuralNetworksSpecPageUrl(), driver.getCurrentUrl());
    }

    /*
    The "Natural language processing in linguistics and IT" course card on the All Courses page
    leads to the Natural language processing in linguistics and IT course page.
     */
    @Test
    public void allCoursesNlpInLinguisticsAndItTsuCardLeads() {
        allCoursesPage.open();
        allCoursesPage.clickNlpInLinguisticsAndItCard();
        switchToNextTab();
        StringBuffer stringBuffer = new StringBuffer(driver.getCurrentUrl());
        String currentPage = stringBuffer.substring(0, allCoursesPage.getNlpInLinguisticsAndItPageUrl().length());
        assertEquals(allCoursesPage.getNlpInLinguisticsAndItPageUrl(), currentPage);
    }
}
