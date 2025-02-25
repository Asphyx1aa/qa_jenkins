package components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public static void setDay(String day, int month, String year) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }
}
