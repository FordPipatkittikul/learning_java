package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLEC {
    public static void main(String[] args) {
        // Creating a stream from a collection
        List<String> names = Arrays.asList("Walnut", "Manadarin", "Snow flake");
        Stream<String> nameStream = names.stream();

        // Creating a stream from an array
        String[] namesArray = {"Walnut", "Manadarin", "Snow flake"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        // Creating a stream using the Stream.iterate() method
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);

        // Creating a stream using the Stream.generate() method
        Stream<Double> randomNumberStream = Stream.generate(Math::random);

        // *******Termnal operations*******

        nameStream.forEach(n -> System.out.println(n));
        long numberOfItems = names.stream().count();

        // collect: transforms the stream into different data structure, such as List, Set, or Map
        List<String> namesList = names.stream().collect(Collectors.toList());

        // reduce: apllies a binary operator to the elements in the stream, reducing them to a single value.
        Optional<String> totalString = names.stream().reduce((str1,str2) -> str1 + str2);
        System.out.println(totalString);


        // *******Intermediate operations*******

        Stream<String> nameStartWithM = names.stream().filter(name -> name.startsWith("M"));
        nameStartWithM.forEach(System.out::println); // Manadarin

        Stream<Integer> nameLengths = names.stream().map(String::length);
        nameLengths.forEach(System.out::println); // 6 9 10

        Stream<String> sortedNames = names.stream().sorted(Comparator.naturalOrder());
        sortedNames.forEach(System.out::println); // Manadarin, Snow flake, Walnut

    }

}
