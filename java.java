import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("a"); items.add("b"); items.add("c");
        String addItem = "d";
        items.add(addItem);
        String removeItem = "b";
        items.remove(removeItem);
        System.out.println(items.get(0));
    }
}
