package FunctionalProgramStreamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Walnut", "Manadarin", "Snow flake");
        List<String> namesUpperCase = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(namesUpperCase);

        List<Integer> numberss = Arrays.asList(1,2,3);
        List<Integer> squareOddNum = numberss.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squareOddNum);

        List<Integer> numbers2 = Arrays.asList(1,2,3,4);
        Long countEvenNum = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(countEvenNum);

        List<String> names2 = Arrays.asList("xyz", "agc","sss", "Snow flake");
        List<String> namesWithLessThanSixChar = names2.stream()
                .filter(n -> n.length() < 6)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(namesWithLessThanSixChar);

        List<String> Strings = Arrays.asList("a", "b","c", "d");
        Strings.stream().forEach(c -> System.out.println(c));

        List<Integer> numbers3 = Arrays.asList(2,3,4,5);
        int sumOfSquares = numbers3.stream()
                .map(n -> n * n)
                .reduce(0,Integer::sum);

    }

}
