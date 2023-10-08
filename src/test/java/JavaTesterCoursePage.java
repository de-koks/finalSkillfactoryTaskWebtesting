import org.openqa.selenium.WebDriver;

public class JavaTesterCoursePage {
    private static final String JAVA_TESTER_COURSE_URL = "https://skillfactory.ru/java-qa-engineer-testirovshik-po";
    private final WebDriver driver;
    public JavaTesterCoursePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(JAVA_TESTER_COURSE_URL);
    }

}
