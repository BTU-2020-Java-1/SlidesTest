package ge.edu.btu.slide_9.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(24);
        list.add(15);

        System.out.println("პირველი ელემენტი: " + list.get(0));
        System.out.println("სია: " + list);

        list.set(2, 52);
        System.out.println("სია: " + list);

        list.remove(1);
        System.out.println("სია: " + list);

        list.remove(Integer.valueOf(15));
        System.out.println("სია: " + list);

        System.out.println(list.contains(7));
    }
}


