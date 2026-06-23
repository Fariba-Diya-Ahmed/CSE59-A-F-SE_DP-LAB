import java.util.*;

interface TeamMember {
  String getName();
}

interface BonusEligible {
  void calculateBonus();
}

class Employee implements TeamMember, BonusEligible{

  private String name;

  public Employee(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  public void calculateBonus() {
      System.out.println("Calculating standard employee bonus...");
  }
}

class Contractor implements TeamMember {

  private String name;

  public Contractor(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }
}

public class Main {
  public static void main(String[] args) {

    TeamMember e1 = new Employee("Fariba");
    TeamMember c1 = new Contractor("Diya");

    BonusEligible emp = new Employee("Fariba");
    emp.calculateBonus();
  }
}
