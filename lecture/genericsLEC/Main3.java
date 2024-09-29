package genericsLEC;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Bag<Book> bookBag = new Bag<>();
        Book calOne = new Book();
        calOne.setPrice(22);
        bookBag.setContent(calOne);

        Bag<Laptop> laptopBag = new Bag<>();
        Laptop applem1 = new Laptop();
        applem1.setName("apple 1523");
        laptopBag.setContent(applem1);

        // laptopBag.setContent(calOne); // cannot do this

        List<Integer> numbers = new ArrayList<>(); // we cannot instantiate list, it's an interface. But we use ArrayList instead which is class
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(2);
        integerSet.add(2);
        integerSet.add(4);
        System.out.println(integerSet); // [2,4]

        Deque<String> lanagauges = new ArrayDeque<>();
        lanagauges.add("Java");
        lanagauges.add("Go");
        lanagauges.add("node.js");
        lanagauges.pop();
        System.out.println(lanagauges);

        Map<String, Integer> namesAgesMap = new HashMap<>();
        namesAgesMap.put("ford",21);
        namesAgesMap.put("john",23);

        for(Map.Entry<String, Integer> entry: namesAgesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
