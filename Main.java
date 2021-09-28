import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<>("New York", "NYC");

        Pair<Integer, String> p2 = new Pair<>(12345, "Alice Bark");
        ArrayList<Pair<Integer, String>> list = new ArrayList<>();
        list.add(p2);
        list.add(new Pair<>(22222, "Paul Clark"));
        list.add(new Pair<>(12432, "Jenson Button"));
        System.out.println(list);
        java.util.Collections.sort(list);
        System.out.println(list);
        Integer[] list1 = {11,34,23,14,1};
        printArray(list1);
        Pair.sort(list1);
        printArray(list1);
        String[] list2 = {"James Robert", "Michael Masserson", "Charles Leclerc", "Lando Norris"};
        printArray(list2);
        Pair.sort(list2);
        printArray(list2);

    }
    public static <E> void printArray(E[] list){
        System.out.println(Arrays.toString(list));
    }
}