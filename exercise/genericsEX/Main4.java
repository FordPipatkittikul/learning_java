package genericsEX;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<>();
        boxInt.setContent(23);

        Box<String> boxStr = new Box<>();
        boxStr.setContent("fafafd");

        List<Integer> numberss = new ArrayList<>(); // we cannot instantiate list, it's an interface. But we use ArrayList instead which is class
        numberss.add(2);
        numberss.add(3);
        numberss.add(4);

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
