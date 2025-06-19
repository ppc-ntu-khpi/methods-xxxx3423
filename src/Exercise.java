import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise {

    public static int Calculate(LocalDate start, LocalDate end) {
        int workingDays = 0;

        // Обхід кожного дня в діапазоні
        for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
            if (isWorkingDay(date)) {
                workingDays++;
            }
        }

        return workingDays * 8; // 8 годин за кожен робочий день
    }

    // Перевірка, чи є день робочим
    private static boolean isWorkingDay(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
    }
}
