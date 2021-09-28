public class Main{
    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<>("New York", "NYC");

        Pair<Integer, String> p2 = new Pair<>(12345, "Alice Bark");
        ArrayList<Pair<Integer, String>> list = new ArrayList<>();
        list.add(p2);
        list.add(new Pair<>(22222, "Paul Clark"));
        System.out.println(list);
    }
}