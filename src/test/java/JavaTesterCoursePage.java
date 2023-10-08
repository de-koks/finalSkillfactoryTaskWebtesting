import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaTesterCoursePage {
    private static final String JAVA_TESTER_COURSE_URL = "https://skillfactory.ru/java-qa-engineer-testirovshik-po";
    private static final String FIRST_HEADER_PHONE_NUMBER = "+7 495 291-09-12";
    private static final String SECOND_HEADER_PHONE_NUMBER = "+7 958 577-04-17";
    private static final String SIGN_UP_FOR_COURSE_BUTTON_CLASS = "tn-elem__3596564571596261549401";
    private static final String SIGN_UP_FOR_COURSE_POPUP_XPATH = "//div[@class='t702__wrapper']//div[text()='Записаться на курс']";
    public String getSignUpForCoursePopupXpath() {
        return SIGN_UP_FOR_COURSE_POPUP_XPATH;
    }
    public static String getUrl(){
        return JAVA_TESTER_COURSE_URL;
    }
    private final WebDriver driver;
    public JavaTesterCoursePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(JAVA_TESTER_COURSE_URL);
    }

    public void clickSignUpForCourseButton() {
        driver.findElement(By.className(SIGN_UP_FOR_COURSE_BUTTON_CLASS)).click();
    }

}
