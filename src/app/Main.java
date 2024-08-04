package app;

import java.util.Arrays;

public class Main {
static int[] numbers;
    public static void main(String[] args) {
        numbers = new int[]{34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};

        System.out.println("Array Elements: " + Arrays.toString(numbers));
        int negativeSum = 0;
        int oddCount = 0;
        int evenCount = 0;

        for (int number : numbers) {
            if (number < 0) {
                negativeSum += number;
            }
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Sum of negative numbers: " + negativeSum +
                "\nNumber of even numbers : " + evenCount +
                "\nNumber of odd numbers : " + oddCount);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Minimum element : " + numbers[minIndex] +
                "\nat index: " + minIndex +
                "\nMaximum element : " + numbers[maxIndex] +
                "\nat index : " + maxIndex);

        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        int sum = 0;
        int count = 0;
        for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
        }
        {
            double average =  (double) sum / count;
            System.out.printf("Average of numbers after" +
                    "the first negative number: %.2f " , average);
        }

    }
}
