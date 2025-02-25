package data;

import utils.RandomUtils;

import java.util.Date;

public class TestDataFactory {
    final RandomUtils randomUtils = new RandomUtils();

    public StudentData createStudent() {
        String studentName = randomUtils.getRandomName();
        String studentLastName = randomUtils.getRandomLastName();
        String studentMail = randomUtils.getRandomEmail();
        String studentGender = randomUtils.getRandomGender();
        String studentNumber = randomUtils.getRandomPhone();
        Date studentBirthday = randomUtils.getRandomBirthday();
        String studentDayOfBirth = randomUtils.getDay(studentBirthday);
        String studentFullMonthOfBirth = randomUtils.getFullMonth(studentBirthday);
        int studentMonthOfBirth = randomUtils.getMonth(studentBirthday);
        String studentYearOfBirth = randomUtils.getYear(studentBirthday);
        String studentSubject = randomUtils.getRandomSubject();
        String studentHobbies = randomUtils.getRandomHobby();
        String studentPicture = randomUtils.getRandomImage();
        String studentAddress = randomUtils.getRandomAddress();
        String studentState = randomUtils.getRandomState();
        String studentCity = randomUtils.getRandomCity(studentState);

        return new StudentData(studentName, studentLastName, studentMail, studentGender, studentNumber,
                studentDayOfBirth, studentFullMonthOfBirth, studentMonthOfBirth, studentYearOfBirth,
                studentSubject, studentHobbies, studentPicture, studentAddress, studentState, studentCity);
    }
}
