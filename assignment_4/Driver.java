package assignment_4;

public class Driver {
  public static void main(String[] args) {
    // Create two Employee objects
    Employee emp1 = new Employee(); // Default Constructor
    Employee emp2 = new Employee("Angelo", 1); // Parameterized Constructor

    // Create two Manager objects
    Manager man1 = new Manager(); // Default Constructor
    Manager man2 = new Manager("Police", 20000, "Angelo", 1); // Parameterized Constructor

    Manager man3TEST = new Manager("Police", 20000, "Angelo", 1); // Parameterized Constructor
    

    // Test writeOutput for both classes
    emp2.writeOutput();
    man2.writeOutput();

    // Test equals method for both equal and different objects
    System.out.println(emp2.equals(emp1));
    System.out.println(emp2.equals(emp2));

    System.out.println(man2.equals(emp2));
    System.out.println(man2.equals(man1));
    System.out.println(man2.equals(man3TEST));
  }
}
