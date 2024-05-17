import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 6-значное число: ");
        String number = scanner.nextLine();
        scanner.close();

        if (checkLuckyNumber(number))
            System.out.println("Число " + number + " счастливое");
        else
            System.out.println("Число " + number + " счастливое");
    }

    private static boolean checkLuckyNumber(String number)
    {
        String firstPart = number.substring(0, number.length() / 2);
        String secondPart = number.substring(number.length() / 2, number.length());

        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 0; i < firstPart.length(); ++i)
        {
            firstNumber += Character.getNumericValue(firstPart.charAt(i));
        }

        for (int i = 0; i < secondPart.length(); ++i)
        {
            secondNumber += Character.getNumericValue(secondPart.charAt(i));
        }

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber == secondNumber) return true;

        return false;
    }
}