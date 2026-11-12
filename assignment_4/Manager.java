package assignment_4;

public class Manager extends Employee {
  String department_name;
  double annual_bonus;

  // Default Constructor
  Manager() {
    department_name = "None";
    annual_bonus = 0.0;
  }

  // Parameterized Constructor
  Manager(String department_name, double annual_bonus, String name, int id) {
    super(name, id);
    this.department_name = department_name;
    this.annual_bonus = annual_bonus;
  }

  // Accessors
  public String getDepartmentName() {
    return this.department_name;
  }

  public double getAnnualBonus() {
    return this.annual_bonus;
  }

  // Mutators
  public void setDepartmentName(String department_name) {
    this.department_name = department_name;
  }

  public void setAnnualBonus(double annual_bonus) {
    this.annual_bonus = annual_bonus;
  }

  // Methods
  public void writeOutput() {
    System.out.println("--------------------------");
    System.out.println("Manager's Information"); 
    System.out.println("Name: " + this.getName());
    System.out.println("ID: " + this.getId());
    System.out.println("Department Name: " + this.getDepartmentName());
    System.out.println("Annual Bonus: " + this.getAnnualBonus());
    System.out.println("--------------------------");
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == this) return true;
    if(obj == null || getClass() != obj.getClass()) return false;
    Manager other = (Manager) obj;
    return this.department_name == other.getDepartmentName() && this.annual_bonus == other.getAnnualBonus() && this.getId() == other.getId() && this.getName() == other.getName();
  }
  
}
