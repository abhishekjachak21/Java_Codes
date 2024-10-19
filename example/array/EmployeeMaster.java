


package com.examples.array;

class EmployeD {
    private int employeeId;
    private String employeeName;
    private int salary;
    private String email;
    private String designation;

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        // Set employeeName only if it's not "pagal"
        if (!employeeName.equals("pagal")) {
            this.employeeName = employeeName;  // Corrected the assignment
        } else {
            System.out.println("Employee name cannot be 'pagal'.");
        }
    }

    // Optional: Include getters and setters for other fields (salary, email, designation)
}

public class EmployeeMaster {

    public static void main(String[] args) {
        EmployeD e = new EmployeD();
        e.setEmployeeName("John Doe"); // Example employee name
        System.out.println("Employee Name: " + e.getEmployeeName()); // To verify the name
    }
}





//package com.examples.array;
//
//class Employee {
//  private int employeeId;
//  private String employeeName;
//  private int salary;
//  private String email;
//  private String designation;
//
//  public int getEmployeeId() {
//      return this.employeeId;
//  }
//
//  public void setEmployeeId(int employeeId) {
//      this.employeeId = employeeId;
//  }
//
//  public String getEmployeeName() {
//      return employeeName;
//  }
//
//  public void setEmployeeName(String employeeName) {
//      // Set employeeName only if it's not "pagal"
//      if (!employeeName.equals("pagal")) {
//          this.employeeName = employeeName;  // Corrected the assignment
//      } else {
//          System.out.println("Employee name cannot be 'pagal'.");
//      }
//  }
//
//  // Optional: Include getters and setters for other fields (salary, email, designation)
//}
//
//public class EmployeeMaster {
//
//  public static void main(String[] args) {
//      Employee e = new Employee();
//      e.setEmployeeName("John Doe"); // Example employee name
//      System.out.println("Employee Name: " + e.getEmployeeName()); // To verify the name
//  }
//}


