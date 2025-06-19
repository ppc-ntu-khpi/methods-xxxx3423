import java.time.LocalDate;

public class TestResult {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 6, 1);
        LocalDate endDate = LocalDate.of(2024, 6, 14);

        int hoursWorked = Exercise.Calculate(startDate, endDate);

        System.out.println("Employee worked " + hoursWorked + " hours from " +
                startDate + " to " + endDate + ".");
    }
}
