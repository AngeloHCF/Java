package five;

public class Main {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // true
        // false
        // true
        // reason for this is because a.equals(c) says are the text the same
        // whereas a == b says are these the same objects
        // a == b is true because Java reuses the same "hello" object from the string pool
        // new String places the string in the heap
        System.out.println();
        Integer num_one = 100;
        Integer num_two = 100;

        Integer num_three = 200;
        Integer num_four = 200;

        System.out.println(num_one == num_two);
        System.out.println(num_three == num_four);

        // true
        // true
        // wrong it's true and false

        // Integers objects from -128 to 127 are cached by Java
        // So two Integers with value 100 can reference the same object
        // making == return true
        //
        // 200 is outside the guaranteed cached range
        // so the two Integers reference different objects, making it return false
        //
        // == compare object references, while .equals() compares their values
    }
}