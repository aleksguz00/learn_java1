import java.util.Arrays;
import java.util.Random;

public class Practice
{
    public static void main(String[] args)
    {
        int[] array = fillArray();
        int[] newArray = createNewArray(array);

        for (int i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : newArray)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] fillArray()
    {
        int min = -10;
        int max = 10;

        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; ++i)
        {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    private static int findAvg(int[] array)
    {
        int avg = 0;

        for (int i : array)
        {
            avg += i;
        }

        avg /= array.length;

        System.out.println(avg);

        return avg;
    }

    private static int[] createNewArray(int[] array)
    {
        Arrays.sort(array);
        int avg = findAvg(array);

        int index = 0;
        
        while (array[index] < avg) ++index;

        int[] newArray = new int[index];

        System.arraycopy(array, 0, newArray, 0, newArray.length);

        return newArray;
    }
}