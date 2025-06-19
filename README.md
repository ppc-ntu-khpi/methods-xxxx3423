[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18249430)
# Практична робота "Створення і використання статичних методів" 
Мною було вибрано слідуюче завдання: знайти кількість відпрацьованих співробітником годин у проміжку між двома заданими датами (враховувати лише робочі дні, тривалість робочого дня - 8 годин)
## В рамках практичної роботи я зробив наступне:
1. Модифікував стартовий код таким чином, щоб метод ```Calculate``` класу ```Exercise``` містив код обчислення значення у відповідності до обраного мною завдання 
2. Рядок, який виводиться у результаті виконання методу ```main``` класу ```TestResult```  скоригував у відповідності до специфіки завдання

## Код:
## Exercise.java:
```Java
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


## TestResult.java
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


## Результат:
![](https://github.com/ppc-ntu-khpi/methods-xxxx3423/blob/master/png/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202025-06-19%20212530.png?raw=true)


[![Run on Repl.it](https://repl.it/badge/github/ppc-ntu-khpi/identifiers-types-starter)](https://repl.it/github/ppc-ntu-khpi/identifiers-types-starter) [![Gitter](https://badges.gitter.im/PPC-SE-2020/OOP.svg)](https://gitter.im/PPC-SE-2020/OOP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

