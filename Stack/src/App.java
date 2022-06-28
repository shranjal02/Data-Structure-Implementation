import com.implementation.stack.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty()); // true

        stack.push(10); // [10]
        stack.push(20); // [10, 20]
        stack.push(30); // [10, 20, 30]

        stack.printStack(); // [10, 20, 30]
        System.out.println(stack.isEmpty()); // false

        stack.pop(); // [10, 20]
        stack.pop(); // [10]

        stack.printStack(); // [10]

    }
}
