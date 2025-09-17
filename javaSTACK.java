import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        // Создаем стек
        Stack<Integer> stack = new Stack<>();
        
        // Кладем элементы
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Стек: " + stack);
        
        // Смотрим верхний элемент
        System.out.println("Верхний: " + stack.peek());
        
        // Достаем элементы
        System.out.println("Достали: " + stack.pop());
        System.out.println("Достали: " + stack.pop());
        System.out.println("Осталось: " + stack);
    }
}
