package tests;

import data.StudentData;
import data.TestDataFactory;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static io.qameta.allure.Allure.step;

public class RegistrationFormTest extends BaseTest {

    final RegistrationPage registrationPage = new RegistrationPage();
    final TestDataFactory testDataFactory = new TestDataFactory();

    final StudentData student = testDataFactory.createStudent();

    @Test
    void successfulFillingFormTest() {


        step("Заполняем форму", () -> {
            registrationPage.openPage()
                    .removeBanner()
                    .setName(student.setStudentName())
                    .setLastName(student.setStudentLastName())
                    .setUserEmail(student.setStudentMail())
                    .setUserGender(student.setStudentGender())
                    .setUserNumber(student.setStudentNumber())
                    .setUserBirthday(student.setStudentDayOfBirth(), student.setStudentMonthOfBirth(), student.setStudentYearOfBirth())
                    .setUserSubjects(student.setStudentSubjects())
                    .setUserHobbies(student.setStudentHobbies())
                    .uploadUserPicture(student.setStudentPicture())
                    .setUserAddress(student.setStudentAddress())
                    .setUserState(student.setStudentState())
                    .setUserCity(student.setStudentCity());
        });

        step("Отправляем форму", () -> {
            registrationPage.submitRegistrationForm();
        });

        step("Проверяем форму", () -> {
            registrationPage
                    .checkUserData("Student Name", String.format("%s %s", student.setStudentName(), student.setStudentLastName()))
                    .checkUserData("Student Email", student.setStudentMail())
                    .checkUserData("Gender", student.setStudentGender())
                    .checkUserData("Mobile", student.setStudentNumber())
                    .checkUserData("Date of Birth", String.format("%s %s,%s", student.setStudentDayOfBirth(), student.setStudentFullMonthOfBirth(),
                            student.setStudentYearOfBirth()))
                    .checkUserData("Subjects", student.setStudentSubjects())
                    .checkUserData("Hobbies", student.setStudentHobbies())
                    .checkUserData("Picture", student.setStudentPicture())
                    .checkUserData("Address", student.setStudentAddress())
                    .checkUserData("State and City", String.format("%s %s", student.setStudentState(), student.setStudentCity()));
        });
    }

    @Test
    void fillFormWithNecessaryFieldsTest() {

        step("Заполняем форму", () -> {
            registrationPage
                    .openPage()
                    .removeBanner()
                    .setName(student.setStudentName())
                    .setLastName(student.setStudentLastName())
                    .setUserGender(student.setStudentGender())
                    .setUserNumber(student.setStudentNumber());
        });

        step("Отправляем форму", () -> {
            registrationPage.submitRegistrationForm();
        });

        step("Проверяем форму", () -> {
            registrationPage
                    .submitRegistrationForm()
                    .checkUserData("Student Name", String.format("%s %s", student.setStudentName(), student.setStudentLastName()))
                    .checkUserData("Gender", student.setStudentGender())
                    .checkUserData("Mobile", student.setStudentNumber());
        });
    }

    @Test
    void fillFormWithoutNecessaryFieldsTest() {

        step("Заполняем форму", () -> {
            registrationPage
                    .openPage()
                    .removeBanner()
                    .setUserEmail(student.setStudentMail())
                    .setUserBirthday(student.setStudentDayOfBirth(), student.setStudentMonthOfBirth(), student.setStudentYearOfBirth())
                    .setUserSubjects(student.setStudentSubjects())
                    .setUserHobbies(student.setStudentHobbies())
                    .uploadUserPicture(student.setStudentPicture())
                    .setUserAddress(student.setStudentAddress())
                    .setUserState(student.setStudentState())
                    .setUserCity(student.setStudentCity());
        });

        step("Отправляем форму", () -> {
            registrationPage.submitRegistrationForm();
        });

        step("Проверяем, что форма не создана", () -> {
            registrationPage
                    .checkTableExist();
        });
    }
}
