import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaTesterCoursePage {
    private final WebDriver driver;
    public JavaTesterCoursePage(WebDriver driver){
        this.driver = driver;
    }
    private static final String JAVA_TESTER_COURSE_URL = "https://skillfactory.ru/java-qa-engineer-testirovshik-po";
    private static final String SIGN_UP_FOR_COURSE_BUTTON_CLASS = "tn-elem__3596564571596261549401";
    private static final String SIGN_UP_FOR_COURSE_POPUP_XPATH = "//div[@class='t702__wrapper']//div[text()='Записаться на курс']";
    private static final String READ_BLOG_BUTTON_CLASS = "tn-elem__2988276021608735135443";
    private static final String BLOG_PAGE_URL = "https://blog.skillfactory.ru/";
    private static final String HABR_BUTTON_LINK_TEXT = "Хабр";
    private static final String HABR_PAGE_URL = "https://habr.com/ru/companies/skillfactory/articles/";
    private static final String VK_BUTTON_TEXT = "VKontakte";
    private static final String VK_PAGE_URL = "https://vk.com/skillfactoryschool";
    private static final String TWITTER_BUTTON_TEXT = "Twitter";
    private static final String TWITTER_PAGE_URL = "https://twitter.com/skillfactoryru";
    private static final String YOUTUBE_BUTTON_XPATH = "//div[@class='tn-atom']/a[text()='YouTube']";
    private static final String YOUTUBE_PAGE_URL = "https://www.youtube.com/channel/UClOTq6XN8g7-16QLGnZ6_EA";
    private static final String TELEGRAM_BUTTON_XPATH = "//a[text()='Telegram']";
    private static final String TELEGRAM_CHANNEL_URL = "https://t.me/skillfactory";
    private static final String DZEN_BUTTON_TEXT = "Яндекс.Дзен";
    private static final String DZEN_PAGE_URL = "https://dzen.ru/skill_factor";

    public String getPageUrl(){
        return JAVA_TESTER_COURSE_URL;
    }
    public String getSignUpForCoursePopupXpath() {
        return SIGN_UP_FOR_COURSE_POPUP_XPATH;
    }
    public String getBlogPageUrl() {
        return BLOG_PAGE_URL;
    }
    public String getHabrPageUrl() {
        return HABR_PAGE_URL;
    }
    public String getVkPageUrl() {
        return VK_PAGE_URL;
    }
    public String getTwitterPageUrl() {
        return TWITTER_PAGE_URL;
    }
    public String getYoutubePageUrl() {
        return YOUTUBE_PAGE_URL;
    }
    public String getTelegramChannelUrl() { return TELEGRAM_CHANNEL_URL; }

    public String getDzenPageUrl() { return DZEN_PAGE_URL; }

    public void open(){
        driver.get(JAVA_TESTER_COURSE_URL);
    }

    public void clickSignUpForCourseButton() {
        driver.findElement(By.className(SIGN_UP_FOR_COURSE_BUTTON_CLASS)).click();
    }
    public void fillSighCoursePopUp() {
        UserData userData = UserData.createUserData();
        driver.findElement(By.id("input_1495810359387")).sendKeys(String.format("%s %s", userData.userFirstName(), userData.userLastName()));
        driver.findElement(By.id("input_1495810354468")).sendKeys(userData.userEmail());
        driver.findElement(By.id("input_1495810410810")).sendKeys(userData.userPhoneNumber());
    }

    public void clickReadBlogButton() {
        driver.findElement(By.className(READ_BLOG_BUTTON_CLASS)).click();
    }

    public void clickHabrButton() {
        driver.findElement(By.linkText(HABR_BUTTON_LINK_TEXT)).click();
    }

    public void clickVkButton() {
        driver.findElement(By.linkText(VK_BUTTON_TEXT)).click();
    }

    public void clickTwitterButton() {
        driver.findElement(By.linkText(TWITTER_BUTTON_TEXT)).click();
    }

    public void clickYoutubeButton() {
        driver.findElement(By.xpath(YOUTUBE_BUTTON_XPATH)).click();
    }
    public void clickTelegramButton() {
        driver.findElement(By.xpath(TELEGRAM_BUTTON_XPATH)).click();
    }
    public void clickDzenButton() {
        driver.findElement(By.linkText(DZEN_BUTTON_TEXT)).click();
    }
}
