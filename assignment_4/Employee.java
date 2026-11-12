package assignment_4;

public class Employee {
  // I declare my instance variables as private because I don't want other classes to modify or access them. This allows me to protect the object's data and allows me ot control how that data is accessed or changed.
  private String name; 
  private int id;

  // Default constructor | this activates when a Employee object gets created
  Employee() {
    name = "None";
    id = 0;
  }

  // Parameterized constructor
  Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.id;
  }
  
  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  // Method
  public void writeOutput() {
    System.out.println("--------------------------");
    System.out.println("Employee's Information");
    System.out.println("Name: " + this.getName());
    System.out.println("ID: " + this.getId());
    System.out.println("--------------------------");
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == this) return true; // if obj is pointing to this object in memory, then they're the same RETURN TRUE
    if(obj == null || getClass() != obj.getClass()) return false; // getClass() returns the runtime class | Employee == Employee? true and Employee == Dog? false
    Employee other = (Employee) obj; // type casting, specifically downcasting | Employee = the data type | other = variable name | = = assignment operator | (Employee) = casts the reference obj to type Employee | obj = the original object reference
    return this.id == other.getId() && this.name == other.getName();
  }
}
