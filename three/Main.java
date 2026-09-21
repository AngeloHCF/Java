/*
Package
  Classes
    Each class has a collection of methods, they allow us to do actions
*/

package three; // way you organize, allows you to have the same class name in the front packages | should have the same name as the folder ? 

// collection of classes
// an instruction to the computer is called a statement
// objectName.methodName(argumentsTheMethodsTake)
// IDE: Integrated Development Environment

import java.util.Scanner; // class loader, imports another class, they have a collection of methods/functions
// java.util is the class, Scanner is the class

public class Main { // entry point, when we run the code, the computer looks for the main function
                    // (OS)
  public static void main(String[] args) { // then it calls the method <- this is the entry point ?
    // System is a class
    System.out.println("Hello out there.");
    System.out.println("I will add two numbers for you.");
    System.out.println("Enter two whole numbers on a line:");
    int n1, n2;
    Scanner keyboard = new Scanner(System.in); // pointer that points to this object
    n1 = keyboard.nextInt();
    n2 = keyboard.nextInt();
    System.out.println("The sum of those two numbers is");
    System.out.println(n1 + n2);
    keyboard.close();
  }
}

/*
 * Encapsulation: the data and methods are associated with any particular class
 * Polymorphism: Greek meaning "many forms", same program instruction adapts to
 * mean different things dependong on the context
 * Inheritence: Parent based where you can derive variables and methods to a
 * child (hierarchy)
 * Three types of error: Syntax error, runtime error, compile error, logic
 * errors0
 * 
 */