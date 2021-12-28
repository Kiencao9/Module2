package Bai11.TrienKhaiStack;

public class GenericStackClient {
    public static void starkOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("2.1 Size of stark after push operations: " + stack.size());
        System.out.println("2.2 Pop elements from stark : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stark after pop operations : " + stack.size());
    }

    private static void starkOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stark after push operation: " + stack.size());
        System.out.println("2.2 Pop elements from stark: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stark after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stark of integers");
        starkOfIntegers();
        System.out.println("\n2. Stark of Strings");
        starkOfIStrings();
    }
}
