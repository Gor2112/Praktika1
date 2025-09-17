import java.util.Stack;

public class МойСтек {
    public static void main(String[] args) {
        // Стек из книг
        Stack<String> книги = new Stack<>();
        
        // Кладу книги
        книги.push("Математика");
        книги.push("История");
        книги.push("География");
        System.out.println("Стек книг: " + книги);
        
        // Смотрю верхнюю
        System.out.println("Верхняя книга: " + книги.peek());
        
        // Беру книгу
        String взятая = книги.pop();
        System.out.println("Взял книгу: " + взятая);
        System.out.println("Осталось: " + книги);
    }
}
