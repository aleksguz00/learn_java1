import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату рождения в формате день-месяц-год: ");
        String date = scanner.nextLine();

        scanner.close();

        String zodiacSign = showZodiac(date);
        String japanYear = showJapanYear(date);

        System.out.printf("Знак: %s. Год: %s%n", zodiacSign, japanYear);
    }

    private static String showZodiac(String date)
    {
        String[] cutDate = date.split(" ");

        int day = Integer.parseInt(cutDate[0]);
        String month = cutDate[1].toLowerCase();

        String zodiacSign;

        switch (month)
        {
            case "января":
                zodiacSign = day <= 19 ? "Козерог" : "Водолей";
                break;
            case "февраля":
                zodiacSign = day <= 19 ? "Водолей" : "Рыбы";
                break;
            case "марта":
                zodiacSign = day <= 20 ? "Рыбы" : "Овен";
                break;
            case "апреля":
                zodiacSign = day <= 19 ? "Овен" : "Телец";
                break;
            case "мая":
                zodiacSign = day <= 20 ? "Телец" : "Близнецы";
                break;
            case "июня":
                zodiacSign = day <= 20 ? "Близнецы" : "Рак";
                break;
            case "июля":
                zodiacSign = day <= 22 ? "Рак" : "Лев";
                break;
            case "августа":
                zodiacSign = day <= 22 ? "Лев" : "Дева";
                break;
            case "сентября":
                zodiacSign = day <= 22 ? "Дева" : "Весы";
                break;
            case "октября":
                zodiacSign = day <= 22 ? "Весы" : "Скорпион";
                break;
            case "ноября":
                zodiacSign = day <= 22 ? "Скорпион" : "Стрелец";
                break;
            case "декабря":
                zodiacSign = day <= 21 ? "Стрелец" : "Козерог";
                break;
            
            default:
                zodiacSign = "NaN";
                break;
        }

        return zodiacSign;
    }
    
    private static String showJapanYear(String date)
    {
        String[] cutDate = date.split(" ");

        String yearString = cutDate[2];

        if (yearString.matches(".*[^0-9]$"))
        {
            yearString = yearString.substring(0, yearString.length() - 1);
        }

        int year = Integer.parseInt(yearString);
        int yearNumber = year % 12;

        String japanYear;

        switch (yearNumber)
        {
            case 0:
                japanYear = "Обезьяны";
                break;
            case 1:
                japanYear = "Петуха";
                break;
            case 2:
                japanYear = "Собаки";
                break;
            case 3:
                japanYear = "Свиньи";
                break;
            case 4:
                japanYear = "Крысы";
                break;
            case 5:
                japanYear = "Быка";
                break;
            case 6:
                japanYear = "Тигра";
                break;
            case 7:
                japanYear = "Кролика";
                break;
            case 8:
                japanYear = "Дракона";
                break;
            case 9:
                japanYear = "Змеи";
                break;
            case 10:
                japanYear = "Лошади";
                break;
            case 11:
                japanYear = "Козы";
                break;

            default:
                japanYear = "NaN";
                break;
        }

        return japanYear;
    }
}