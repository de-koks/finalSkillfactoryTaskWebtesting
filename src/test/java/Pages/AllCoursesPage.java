package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

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
    private static final String IT_SPEC_FROM_SCRATCH_CARD_XPATH = "//div[@class='card__link']//a[text()='IT-специалист с нуля']";
    private static final String IT_SPEC_FROM_SCRATCH_PAGE_URL = "https://skillfactory.ru/it-specialist-proforientaciya";
    private static final String PYTHON_TESTER_CARD_XPATH = "//div[@class='card__link']//a[text()='Тестировщик-автоматизатор на Python']";
    private static final String PYTHON_TESTER_PAGE_URL = "https://skillfactory.ru/qa-engineer-python-testirovshchik-programmnogo-obespecheniya";
    private static final String PYTHON_DEVELOPER_CARD_XPATH = "//div[@class='card__link']//a[text()='Python-разработчик']";
    private static final String PYTHON_DEVELOPER_PAGE_URL = "https://skillfactory.ru/python-developer";
    private static final String DATA_ANALYST_CARD_XPATH = "//div[@class='card__link']//a[text()='Аналитик данных']";
    private static final String DATA_ANALYST_PAGE_URL = "https://skillfactory.ru/data-analyst-pro";
    private static final String GRAPH_DESIGNER_PRO_CARD_XPATH = "//div[@class='card__link']//a[text()='Графический дизайнер с нуля до PRO']";
    private static final String GRAPH_DESIGNER_PRO_PAGE_URL = "https://contented.ru/edu/graphic-designer-pro?utm_source=skillfactory";
    private static final String PYTHON_DEVELOPER_PRO_CARD_XPATH = "//div[@class='card__link']//a[text()='Python-разработчик PRO']";
    private static final String PYTHON_DEVELOPER_PRO_PAGE_URL = "https://skillfactory.ru/python-developer-pro";
    private static final String DATA_SCIENTIST_CARD_XPATH = "//div[@class='card__link']//a[text()='Data Scientist']";
    private static final String DATA_SCIENTIST_PAGE_URL = "https://skillfactory.ru/data-scientist-pro";
    public String getProforientationTestPageUrl() { return PROFORIENTATION_TEST_PAGE_URL; }
    public String getItSpecFromScratchPageUrl() { return IT_SPEC_FROM_SCRATCH_PAGE_URL; }
    public String getPythonTesterPageUrl() { return PYTHON_TESTER_PAGE_URL; }
    public String getPythonDeveloperPageUrl() { return PYTHON_DEVELOPER_PAGE_URL; }
    public String getDataAnalystPageUrl() { return DATA_ANALYST_PAGE_URL; }
    public String getGraphDesignerProPageUrl() { return GRAPH_DESIGNER_PRO_PAGE_URL; }
    public String getPythonDeveloperProPageUrl() { return PYTHON_DEVELOPER_PRO_PAGE_URL; }
    public String getDataScientistPageUrl() { return DATA_SCIENTIST_PAGE_URL; }

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
    public void clickItSpecFromScratchCard() {
        driver.findElement(By.xpath(IT_SPEC_FROM_SCRATCH_CARD_XPATH)).click();
    }
    public void clickPythonTesterCard() {
        driver.findElement(By.xpath(PYTHON_TESTER_CARD_XPATH)).click();
    }
    public void clickPythonDeveloperCard() {
        driver.findElement(By.xpath(PYTHON_DEVELOPER_CARD_XPATH)).click();
    }
    public void clickDataAnalystCard() {
        driver.findElement(By.xpath(DATA_ANALYST_CARD_XPATH)).click();
    }
    public void clickGraphDesignerProCard() {
        driver.findElement(By.xpath(GRAPH_DESIGNER_PRO_CARD_XPATH)).click();
    }
    public void clickPythonDeveloperProCard() {
        driver.findElement(By.xpath(PYTHON_DEVELOPER_PRO_CARD_XPATH)).click();
    }
    public void clickDataScientistCard() {
        driver.findElement(By.xpath(DATA_SCIENTIST_CARD_XPATH)).click();
    }
}
