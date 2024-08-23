import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];
        System.out.println("Enter four numbers: ");
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = findMin(numbers);
        int max = findMax(numbers);

        List<Integer> primes = generatePromes(min, max);
        System.out.println("Prime numbers between " + min + " and " + max + ": " + primes);
    }

    private static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number: numbers){
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number: numbers){
            if (number > max) {
                max= number;
            }
        }
        return  max;
    }

    private static List<Integer> generatePromes(int min, int max) {
        List<Integer> primes = new ArrayList<>();

        if (min < 2) {
            min =2;
        }
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.abs(num); i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }
}
