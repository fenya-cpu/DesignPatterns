package lab4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Laba4 {

    public static void main(String[] args) {
        System.out.println("ЛАБОРАТОРНА РОБОТА №4");
        List<Integer> intList = Arrays.asList(10, 5, 8, 3, 15, 20, 8, 11);
        List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.0, 10.0);
        List<String> stringList = Arrays.asList("Яблуко", "Банан", "Ананас", "Ківі", "Апельсин");
        List<String> textList = Arrays.asList("", "  ", "Перший", "Другий");
        List<String> capitalStrings = Arrays.asList("Київ", "Львів", "Одеса");
        String sentence = "Привіт, як твої справи сьогодні?";

        //1.непарні числа
        System.out.println("1.Непарні числа: " + filterOddNumbers(intList));

        //2.Знайти середнє зі списку дійсних значень
        System.out.println("2.Середнє значення: " + calculateAverage(doubleList));

        //3.Сортування списку рядків в алфавітному порядку
        System.out.println("3.Алфавітне сортування: " + sortStringsAlphabetically(stringList));

        //4.Сума всіх парних чисел
        System.out.println("4.Сума парних чисел: " + sumOfEvenNumbers(intList));

        //5.Обчислити факторіал заданого числа
        int numberForFactorial = 5;
        System.out.println("5.Факторіал числа " + numberForFactorial + ": " + calculateFactorial(numberForFactorial));

        //6.Множення та підсумовування всіх елементів
        long[] sumAndProduct = calculateSumAndProduct(intList);
        System.out.println("6.Сума всіх елементів: " + sumAndProduct[0] + ", Добуток: " + sumAndProduct[1]);

        //7.Квадрат кожного числа
        System.out.println("7.Квадрати чисел: " + calculateSquares(intList));

        //8.Сортування рядків за довжиною
        System.out.println("8.Сортування за довжиною: " + sortStringsByLength(stringList));

        //9.Підрахувати кількість слів у реченні
        System.out.println("9.Кількість слів у реченні: " + countWordsInSentence(sentence));

        //10.Знайти перший непорожній рядок
        System.out.println("10.Перший непорожній рядок: " + findFirstNonEmptyString(textList));

        //11.Перевірити чи всі рядки починаються з великої літери
        System.out.println("11.Чи всі починаються з великої літери: " + checkAllStartWithCapital(capitalStrings));

        //12.Друге за величиною число в списку
        System.out.println("12.Друге за величиною число: " + findSecondLargest(intList));

        //13.Найбільше парне число
        System.out.println("13.Найбільше парне число: " + findLargestEven(intList));
    }

    //1.Відфільтрувати непарні числа
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    //2.Знайти середнє зі списку дійсних значень
    public static double calculateAverage(List<Double> numbers) {
        return numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    //3.Сортування списку рядків в алфавітному порядку
    public static List<String> sortStringsAlphabetically(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    //4.Обчислення суми всіх парних чисел
    public static int sumOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    //5.Обчислити факторіал заданого числа
    public static long calculateFactorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Факторіал визначений лише для невід'ємних чисел.");
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long a, long b) -> a * b);
    }

    //6.Розрахувати множення та підсумовування всіх елементів
    public static long[] calculateSumAndProduct(List<Integer> numbers) {
        long sum = numbers.stream().mapToLong(Integer::longValue).sum();
        long product = numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
        return new long[]{sum, product};
    }

    //7.Квадрат кожного числа у списку
    public static List<Integer> calculateSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    //8.Сортування рядків на основі їх довжини в порядку зростання
    public static List<String> sortStringsByLength(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    //9.Підрахувати кількість слів у реченні
    public static long countWordsInSentence(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return 0;
        return Arrays.stream(sentence.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
    }

    //10.Знайти перший непорожній рядок у списку рядків
    public static String findFirstNonEmptyString(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .findFirst()
                .orElse("Порожній список або всі рядки порожні");
    }

    //11.Перевірити, чи всі рядки у списку починаються з великої літери
    public static boolean checkAllStartWithCapital(List<String> strings) {
        return strings.stream()
                .allMatch(s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
    }

    //12.Знайти друге за величиною число в списку цілих чисел
    public static Integer findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    //13.Знайти найбільше парне число в списку цілих чисел
    public static Integer findLargestEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo)
                .orElse(null);
    }
}