import java.util.ArrayList;

public class МойСписок {
    public static void main(String[] args) {
        // Делаю список
        ArrayList<Integer> числа = new ArrayList<>();
        числа.add(10);
        числа.add(20);
        числа.add(30);
        System.out.println("Мой список: " + числа);
        
        // Добавляю число
        числа.add(40);
        System.out.println("Добавил 40: " + числа);
        
        // Убираю число
        числа.remove(1);
        System.out.println("Убрал второй: " + числа);
        
        // Показываю все
        System.out.println("Все числа:");
        for (int число : числа) {
            System.out.println(число);
        }
    }
}
