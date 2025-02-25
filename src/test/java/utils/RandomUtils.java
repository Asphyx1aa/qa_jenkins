package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RandomUtils {

    static final Faker faker = new Faker();

    final String[] gender = {"Male", "Female", "Other"};
    final String[] subjects = {"Hindi", "English", "Maths", "Physics", "Chemistry", "Biology", "Computer Science", "Commerce", "Accounting", "Economics", "Arts", "Social Studies", "History", "Civics"};
    final String[] hobbies = {"Sports", "Reading", "Music"};
    final String[] files = {"sample-pic.jpg", "sample-2.jpg"};
    final String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

    public String getRandomName() {
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomGender() {
        return faker.options().option(gender);
    }

    public Date getRandomBirthday() {
        return faker.date().birthday(18, 70);
    }

    public String getDay(Date dateOfBirthday) {
        return new SimpleDateFormat("dd", Locale.US).format(dateOfBirthday);
    }

    public int getMonth(Date dateOfBirthday) {
        String monthFormatted = new SimpleDateFormat("M", Locale.US).format(dateOfBirthday);
        int month = Integer.parseInt(monthFormatted);
        return month - 1;
    }

    public String getFullMonth(Date dateOfBirthday) {
        return new SimpleDateFormat("LLLL", Locale.US).format(dateOfBirthday);
    }

    public String getYear(Date dateOfBirthday) {
        return new SimpleDateFormat("yyyy", Locale.US).format(dateOfBirthday);
    }

    public String getRandomPhone() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomSubject() {
        return faker.options().option(subjects);
    }

    public String getRandomHobby() {
        return faker.options().option(hobbies);
    }

    public String getRandomImage() {
        return faker.options().option(files);
    }

    public String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomState() {
        return faker.options().option(states);
    }

    public String getRandomCity(String state) {
        return selectCity(state);
    }


    private String selectCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> throw new IllegalArgumentException("Unknown city");
        };
    }

}
