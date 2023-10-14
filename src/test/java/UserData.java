import com.github.javafaker.Faker;

import java.util.Random;

public record UserData(String userFirstName, String userLastName, String userEmail, String userPhoneNumber) {

    public static UserData createUserData() {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();

        Random rn = new Random();
        long phone = rn.nextLong(9_999_999_999L - 9_000_000_000L + 1) + 9_000_000_000L;
        String phoneNumber = Long.toString(phone);

        return new UserData(firstName, lastName, email, phoneNumber);
    }
}
