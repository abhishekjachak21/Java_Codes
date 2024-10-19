package com.examples.array;

class Employee {
    int employeeId;
    String employeeName;
    int salary;
    String email;
    String designation;

    public Employee() {}

    public Employee(int employeeId, String employeeName, int salary, String email, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.email = email;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
                + ", email=" + email + ", designation=" + designation + "]";
    }
}

class EmployeeDatabase {
    Employee employees[];

    public EmployeeDatabase() {
        this.employees = new Employee[10];
    }

    void insertEmployee(Employee e) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = e;
                return;
            }
        }
        System.out.println("Overflow: No more employees can be inserted.");
    }

    void updateEmployee(String employeeName, int salary, int employeeId) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].employeeId == employeeId) {
                this.employees[i].employeeName = employeeName;
                this.employees[i].salary = salary;
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    void deleteEmployee(int employeeId) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].employeeId == employeeId) {
                this.employees[i] = null;
                System.out.println("Employee with ID " + employeeId + " deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    Employee getEmployeeById(int employeeId) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee getEmployeeWithHighestSalary() {
        Employee salMax = null; // Start with null
        for (Employee e : employees) {
            if (e != null) {
                if (salMax == null || e.salary > salMax.salary) {
                    salMax = e;
                }
            }
        }
        return salMax;
    }

    public void sortEmployeesBySalary() {
        selectionSort(this.employees);
    }

    public Employee[] getEmployeesByDesignation(String designation) {
        Employee edesig[] = new Employee[employees.length];
        int i = 0;
        for (Employee e : employees) {
            if (e != null && e.designation.equals(designation)) {
                edesig[i++] = e;
            }
        }
        // Return only the populated part of the array
        Employee[] result = new Employee[i];
        System.arraycopy(edesig, 0, result, 0, i);
        return result;
    }

    Employee[] getAllEmployees() {
        return this.employees;
    }

    void displayEmployeesData() {
        for (Employee e : this.employees) {
            if (e != null) { // Check for null before printing
                System.out.println(e);
            }
        }
    }

    public static int getMaxElementIndex(Employee arr[], int b) {
        int index = 0;
        Employee max = arr[0];
        for (int i = 1; i < b; i++) {
            if (arr[i] != null && (max == null || arr[i].salary > max.salary)) {
                index = i;
                max = arr[i];
            }
        }
        return index;
    }

    public static void swap(Employee arr[], int x, int y) {
        Employee temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void selectionSort(Employee arr[]) {
        for (int i = arr.length; i >= 1; i--) {
            int index = getMaxElementIndex(arr, i);
            if (index != i - 1) {
                swap(arr, index, i - 1);
            }
        }
    }
}

public class EmployeeApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nikhil", 20000, "nikhil@gmail.com", "Trainer");
        Employee e2 = new Employee(2, "Nitin", 10000, "nitin@gmail.com", "Developer");
        Employee e3 = new Employee(3, "Nishtha", 12000, "nishtha@gmail.com", "Tester");
        Employee e4 = new Employee(4, "Jatin", 13000, "jatin@gmail.com", "Tester");

        EmployeeDatabase database = new EmployeeDatabase();
        database.insertEmployee(e1);
        database.insertEmployee(e2);
        database.insertEmployee(e3);
        database.insertEmployee(e4);

        database.sortEmployeesBySalary();

        System.out.println("All Employees sorted by salary:");
        database.displayEmployeesData();

        Employee highestSalaryEmployee = database.getEmployeeWithHighestSalary();
        if (highestSalaryEmployee != null) {
            System.out.println("Employee with the highest salary: " + highestSalaryEmployee);
        }
    }
}





















/////sir uploaded
//
//
//package com.examples.array;
//
//
//class Employee {
//
// int employeeId;
//
// String employeeName;
//
// int salary;
//
// String email;
//
// String designation;
//
// public Employee() {
//
// }
// 
// 
//
// public Employee(int employeeId, String employeeName, int salary, String email, String designation) {
//
// super();
//
// this.employeeId = employeeId;
//
// this.employeeName = employeeName;
//
// this.salary = salary;
//
// this.email = email;
//
// this.designation = designation;
//
// }
//
// // toString method returns the string representation of an object.
//
// @Override
//
// public String toString() {
//
// return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
//
//  + ", email=" + email + ", designation=" + designation + "]";
//
// }
//
//}
//
//class EmployeeDatabase {
//
// Employee employees[];
//
// public EmployeeDatabase() {
//
// this.employees = new Employee[10];
//
// }
//
// void insertEmployee(Employee e) {
//
// for (int i = 0; i < this.employees.length; i++) {
//
//  if (this.employees[i] == null) {
//
//  this.employees[i] = e;
//
//  return;
//
//  }
//
// }
//
// System.out.println("overflow no more employees can be inserted");
//
// }
//
// void updateEmployee(String employeeName, int salary, int employeeId) {
//
// for (int i = 0; i < this.employees.length; i++) {
//
//  if (this.employees[i].employeeId == employeeId) {
//
//  this.employees[i].employeeName = employeeName;
//
//  this.employees[i].salary = salary;
//
//  return;
//
//  }
//
// }
//
// System.out.println("employee with the id not found");
//
// }
//
// void deleteEmployee(int employeeId) {
//
// for (int i = 0; i < this.employees.length; i++) {
//
//  if (this.employees[i].employeeId == employeeId) {
//
//  this.employees[i] = null;
//
//  return;
//
//  }
//
// }
//
// System.out.println("employee with the id not found");
//
// }
//
// Employee getEmployeeById(int employeeId) {
//
// for (int i = 0; i < this.employees.length; i++) {
//
//  if (this.employees[i].employeeId == employeeId) {
//
//  return employees[i];
//
//  }
//
// }
//
// return null;
//
// }
//
// public Employee getEmployeeWithHighestSalary() {
//
// Employee salMax = this.employees[0];
//
// for (Employee e : employees) {
//
//  if (e != null) {
//
//  if (e.salary > salMax.salary) {
//
//   salMax = e;
//
//  }
//
//  }
//
// }
//
// return salMax;
//
// }
//
// public void sortEmployeesBySalary() {
//
// selectionSort(this.employees);
//
// }
//
// public Employee[] getEmployeesByDesignation(String designation) {
//
// Employee edesig[] = new Employee[employees.length];
//
// int i = 0;
//
// for (Employee e : employees) {
//
//  if (e != null) {
//
//  if (e.designation.equals(designation)) {
//
//   edesig[i++] = e;
//
//  }
//
//  }
//
// }
//
// return edesig;
//
// }
//
// Employee[] getAllEmployees() {
//
// return this.employees;
//
// }
//
// void displayEmployeesData() {
//
// for (Employee e : this.employees)
//
//  System.out.println(e);
//
// }
//
// public static int getMaxElementIndex(Employee arr[], int b) {
//
// int index = 0;
//
// Employee max = arr[0];
//
// for (int i = 1; i < b; i++) {
//
//  if (max != null) {
//
//  if (arr[i] != null) {
//
//   if (arr[i].salary > max.salary) {
//
//   index = i;
//
//   max = arr[i];
//
//   }
//
//  }
//
//  }
//
// }
//
// return index;
//
// }
//
// public static void swap(Employee arr[], int x, int y) {
//
// Employee temp = arr[x];
//
// arr[x] = arr[y];
//
// arr[y] = temp;
//
// }
//
// public static void selectionSort(Employee arr[]) {
//
// for (int i = arr.length; i >= 1; i--) {
//
//  int index = getMaxElementIndex(arr, i);
//
//  if (index != i - 1)
//
//  swap(arr, index, i - 1);
//
// }
//
// }
//
//}
//
//public class EmployeeApplication {
//
// public static void main(String[] args) {
//
// Employee e1 = new Employee(1, "nikhil", 20000, "nikhil@gmail.com", "trainer");
//
// Employee e2 = new Employee(2, "nitin", 10000, "nitin@gmail.com", "developer");
//
// Employee e3 = new Employee(3, "nishtha", 12000, "nishtha@gmail.com", "tester");
//
// Employee e4 = new Employee(4, "jatin", 13000, "jatin@gmail.com", "tester");
//
// EmployeeDatabase database = new EmployeeDatabase();
//
// database.insertEmployee(e1);
//
// database.insertEmployee(e2);
//
// database.insertEmployee(e3);
//
// database.insertEmployee(e4);
//
// /*
//
//  * for (Employee e : database.getEmployeesByDesignation("trainer")) {
//
//  * System.out.println(e); }
//
//  */
//
// database.sortEmployeesBySalary();
//
// for (Employee e : database.getAllEmployees()) {
//
//  System.out.println(e);
//
// }
//
// }
//
//}
//
//
//





























































































//package com.examples.array;
//
//class Employee {
//    int employeeId;
//    String employeeName;
//    int salary;
//    String email;
//    String designation;
//
//    public Employee() {}
//
//    public Employee(int employeeId, String employeeName, int salary, String email, String designation) {
//        this.employeeId = employeeId;
//        this.employeeName = employeeName;
//        this.salary = salary;
//        this.email = email;
//        this.designation = designation;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
//                + ", email=" + email + ", designation=" + designation + "]";
//    }
//}
//
//class EmployeeDatabase {
//    Employee[] employees;
//
//    public EmployeeDatabase() {
//        employees = new Employee[10];
//    }
//
//    void insertEmployee(Employee e) {
//        for (int i = 0; i < this.employees.length; i++) {
//            if (this.employees[i] == null) {
//                this.employees[i] = e;
//                return;
//            }
//        }
//        System.out.println("Overflow: Unable to insert employee. Database is full.");
//    }
//
//    void updateEmployee(String employeeName, int salary, int employeeId) {
//        for (int i = 0; i < this.employees.length; i++) {
//            if (this.employees[i] != null && this.employees[i].employeeId == employeeId) {
//                this.employees[i].employeeName = employeeName;
//                this.employees[i].salary = salary;
//                return;
//            }
//        }
//        System.out.println("Employee with ID " + employeeId + " not found.");
//    }
//
//    void deleteEmployee(int employeeId) {
//        for (int i = 0; i < this.employees.length; i++) {
//            if (this.employees[i] != null && this.employees[i].employeeId == employeeId) {
//                this.employees[i] = null;
//                System.out.println("Employee with ID " + employeeId + " deleted.");
//                return;
//            }
//        }
//        System.out.println("Employee with ID " + employeeId + " not found.");
//    }
//
//    Employee getEmployeeById(int employeeId) {
//        for (int i = 0; i < this.employees.length; i++) {
//            if (this.employees[i] != null && this.employees[i].employeeId == employeeId) {
//                return employees[i];
//            }
//        }
//        return null;
//    }
//
//    // Method to get employee with the highest salary
//    public Employee getEmployeeWithHighestSalary() {
//        Employee highest = null;
//        for (Employee emp : employees) {
//            if (emp != null) {
//                if (highest == null || emp.salary > highest.salary) {
//                    highest = emp;
//                }
//            }
//        }
//        return highest;
//    }
//
//    public void sortEmployeesBySalary() {
//        for (int i = 1; i < employees.length; i++) {
//            if (employees[i] != null) {
//                Employee key = employees[i];
//                int j = i - 1;
//                while (j >= 0 && employees[j] != null && employees[j].salary > key.salary) {
//                    employees[j + 1] = employees[j];
//                    j--;
//                }
//                employees[j + 1] = key;
//            }
//        }
//    }
//    
//    public Employee[] getEmployeesByDesignation(String designation) {
//    	return null;
//    }
//
//    Employee[] getAllEmployees() {
//        return this.employees;
//    }
//
//    public void printAllEmployees() {
//        System.out.println("All Employees:");
//        for (Employee emp : employees) {
//            if (emp != null) {
//                System.out.println(emp);
//            }
//        }
//    }
//}
//
//public class EmployeeApplication {
//    public static void main(String[] args) {
//        Employee e1 = new Employee(1, "Nikil", 100000, "nikhil@gmail.com", "Trainer");
//        Employee e2 = new Employee(2, "Nirkil", 15000, "nikhil@gmail.com", "Dev");
//        Employee e3 = new Employee(3, "Nikifefgl", 34000, "nikhil@gmail.com", "Soft");
//        Employee e4 = new Employee(4, "Nikifdl", 87000, "nikhil@gmail.com", "Oracle");
//
//        EmployeeDatabase database = new EmployeeDatabase();
//
//        database.insertEmployee(e1);
//        database.insertEmployee(e2);
//        database.insertEmployee(e3);
//        database.insertEmployee(e4);
//
//        database.updateEmployee("Kaushik", 23000, 1);
//        database.deleteEmployee(4);
//
//        System.out.println(database.getEmployeeById(2)); // Get employee by ID 2
//
//        // Print all employees
//        database.printAllEmployees();
//
//        // Get employee with the highest salary
//        Employee highestSalaryEmployee = database.getEmployeeWithHighestSalary();
//        if (highestSalaryEmployee != null) {
//            System.out.println("Employee with the highest salary: " + highestSalaryEmployee);
//        }
//
//        // Sort employees by salary and print them
//        database.sortEmployeesBySalary();
//        System.out.println("Employees sorted by salary:");
//        database.printAllEmployees();
//    }
//}
//
//
//
//package com.examples.array;
//
//
//class Employee{
//	int employeeId;
//	String employeeName;
//	int salary;
//	String email;
//	String designation;
//	
//	public Employee() {}
//	public Employee(int employeeId, String employeeName, int salary, String email, String designation) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.salary = salary;
//		this.email = email;
//		this.designation = designation;
//	}
//	//toString method returns the string representation of an object.
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
//				+ ", email=" + email + ", designation=" + designation + "]";
//	}
//}
// 
//class EmployeeDatabase{
//	Employee employees[];
//	public EmployeeDatabase() {
//		employees= new Employee[10];
//	}
//	
//	void insertEmployee(Employee e) {
//		for(int i=0;i<this.employees.length;i++) {
//			if(this.employees[i] == null) {
//				this.employees[i] = e;
//				return;
//			}
//		}
//		System.out.println("Overflow");
//	}
//	void updateEmployee(String employeeName,int salary, int employeeId) {
//		for(int i=0;i<this.employees.length;i++) {
//			if(this.employees[i].employeeId == employeeId) {
//				this.employees[i].employeeName = employeeName;
//				this.employees[i].salary = salary;
//				return;
//			}
//		}
//		System.out.println("employee with the id not found");
//	}
//	void deleteEmployee(int employeeId) {
//		for(int i=0;i<this.employees.length;i++) {
//			if(this.employees[i].employeeId == employeeId) {
//				this.employees[i] = null;
//				return;
//			}
//		}
//		System.out.println("deleted");
//	}
//	Employee getEmployeeById(int employeeId) {
//		for(int i=0;i<this.employees.length;i++) {
//			if(this.employees[i].employeeId == employeeId) {
//				return employees[i] ;
//			}
//		}
//		return null;
//	}
//	
//	publicEmployee getEmployeeWithHighestSalary(int employeeId) {
//		for(int i=0;i<this.employees.length;i++) {
//			if(this.employees[i].employeeId == employeeId) {
//				return employees[i] ;
//			}
//		}
//		return null;
//	}
//	
//	public  void sortEmployeesBySalary() {
//		
//	}
//	
//	Employee[] getAllEmployees() {
//		
//		
//		return this.employees;
//	}
//}
//
// 
//public class EmployeeApplication {
//   public static void main(String[] args) {
//	  Employee e1 = new Employee(1,"nikil", 100000, "nikhil@gmail.com", "trainer");
//	  Employee e2 = new Employee(2,"ni4rkil", 15000, "nikhil@gmail.com", "dev");
//	  Employee e3 = new Employee(3,"nikifefgl", 34000, "nikhil@gmail.com", "soft");
//	  Employee e4 = new Employee(4,"nikifdl", 87000, "nikhil@gmail.com", "oracle");
//	  
//	  EmployeeDatabase database = new EmployeeDatabase();
//	  
//	  database.insertEmployee(e1);
//	  database.insertEmployee(e2);
//	  database.insertEmployee(e3);
//	  database.insertEmployee(e4);
//	  
//	  database.updateEmployee("Kaushik", 23000, 1);
//	  database.deleteEmployee(4);
//	  
//	  //database 
//	  System.out.println(database.getEmployeeById(2));
//	
//}
//}
// 