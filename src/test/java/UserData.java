import com.github.javafaker.Faker;

import java.util.Random;

public class UserData {
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPhoneNumber;

    public UserData(String userFirstName, String userLastName, String userEmail, String userPhoneNumber) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
    }

    public static UserData createUserData() {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();

        Random rn = new Random();
        long phone = rn.nextLong(9_999_999_999L - 9_000_000_000L + 1) + 9_000_000_000L;
        String phoneNumber = Long.toString(phone);

        UserData userData = new UserData(firstName, lastName, email, phoneNumber);

        return userData;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
