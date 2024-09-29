package genericsEX;

import java.util.*;

public class Bag2<T> {
    private List<T> content = new ArrayList<T>();

    public void addItem(T item){
        content.add(item);
    }

    public void removes(T item){
        content.remove(item);
    }

    public List<T> getItems(){
        return content;
    }
}


class Example34 {
    public static void main(String[] args) {
        Bag2<String> stringBag2 = new Bag2<>();
        stringBag2.addItem("APP");
        stringBag2.addItem("APP2");
        stringBag2.removes("APP2");
        System.out.println(stringBag2.getItems());
    }
}