package data;

public class StudentData {
    private final String studentName;
    private final String studentLastName;
    private final String studentMail;
    private final String studentGender;
    private final String studentNumber;
    private final String studentDayOfBirth;
    private final String studentFullMonthOfBirth;
    private final int studentMonthOfBirth;
    private final String studentYearOfBirth;
    private final String studentSubjects;
    private final String studentHobbies;
    private final String studentPicture;
    private final String studentAddress;
    private final String studentState;
    private final String studentCity;

    public StudentData(String studentName, String studentLastName, String studentMail, String studentGender,
                       String studentNumber, String studentDayOfBirth, String studentFullMonthOfBirth,
                       int studentMonthOfBirth, String studentYearOfBirth,
                       String studentSubjects,
                       String studentHobbies,
    String studentPicture, String studentAddress, String studentState, String studentCity) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentMail = studentMail;
        this.studentGender = studentGender;
        this.studentNumber = studentNumber;
        this.studentDayOfBirth = studentDayOfBirth;
        this.studentFullMonthOfBirth = studentFullMonthOfBirth;
        this.studentMonthOfBirth = studentMonthOfBirth;
        this.studentYearOfBirth = studentYearOfBirth;
        this.studentSubjects = studentSubjects;
        this.studentHobbies = studentHobbies;
        this.studentPicture = studentPicture;
        this.studentAddress = studentAddress;
        this.studentState = studentState;
        this.studentCity = studentCity;
    }

    public String setStudentName() {
        return studentName;
    }

    public String setStudentLastName() {
        return studentLastName;
    }

    public String setStudentMail() {
        return studentMail;
    }

    public String setStudentGender() {
        return studentGender;
    }

    public String setStudentNumber() {
        return studentNumber;
    }

    public String setStudentDayOfBirth() {
        return studentDayOfBirth;
    }

    public String setStudentFullMonthOfBirth() {
        return studentFullMonthOfBirth;
    }

    public int setStudentMonthOfBirth() {
        return studentMonthOfBirth;
    }


    public String setStudentYearOfBirth() {
        return studentYearOfBirth;
    }

    public String setStudentSubjects() {
        return studentSubjects;
    }

    public String setStudentHobbies() {
        return studentHobbies;
    }

    public String setStudentPicture() {
        return studentPicture;
    }

    public String setStudentAddress() {
        return studentAddress;
    }

    public String setStudentState() {
        return studentState;
    }

    public String setStudentCity() {
        return studentCity;
    }



}
