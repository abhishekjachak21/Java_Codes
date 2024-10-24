package com.example.array;

class Employee {
	int employeeId;
	String employeeName;
	int salary;
	String email;
	String designation;

	public Employee() {
	}

	public Employee(int employeeId, String employeeName, int salary, String email, String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
		this.designation = designation;
	}

	// toString method returns the string representation of an object.
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
		System.out.println("overflow no more employees can be inserted");
	}

	void updateEmployee(String employeeName, int salary, int employeeId) {
		for (int i = 0; i < this.employees.length; i++) {
			if (this.employees[i].employeeId == employeeId) {
				this.employees[i].employeeName = employeeName;
				this.employees[i].salary = salary;
				return;
			}
		}
		System.out.println("employee with the id not found");
	}

	void deleteEmployee(int employeeId) {
		for (int i = 0; i < this.employees.length; i++) {
			if (this.employees[i].employeeId == employeeId) {
				this.employees[i] = null;
				return;
			}
		}
		System.out.println("employee with the id not found");
	}

	Employee getEmployeeById(int employeeId) {
		for (int i = 0; i < this.employees.length; i++) {
			if (this.employees[i].employeeId == employeeId) {
				return employees[i];
			}
		}
		return null;
	}

	public Employee getEmployeeWithHighestSalary() {
		Employee salMax = this.employees[0];
		for (Employee e : employees) {
			if (e != null) {
				if (e.salary > salMax.salary) {
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
			if (e != null) {
				if (e.designation.equals(designation)) {
					edesig[i++] = e;
				}
			}
		}
		return edesig;

	}

	Employee[] getAllEmployees() {
		return this.employees;
	}

	void displayEmployeesData() {
		for (Employee e : this.employees)
			System.out.println(e);
	}

	public static int getMaxElementIndex(Employee arr[], int b) {
		int index = 0;
		Employee max = arr[0];
		for (int i = 1; i < b; i++) {
			if (max != null) {
				if (arr[i] != null) {
					if (arr[i].salary > max.salary) {
						index = i;
						max = arr[i];
					}

				}
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
			if (index != i - 1)
				swap(arr, index, i - 1);
		}

	}
}

public class EmployeeApplication {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "nikhil", 20000, "nikhil@gmail.com", "trainer");
		Employee e2 = new Employee(2, "nitin", 10000, "nitin@gmail.com", "developer");
		Employee e3 = new Employee(3, "nishtha", 12000, "nishtha@gmail.com", "tester");
		Employee e4 = new Employee(4, "jatin", 13000, "jatin@gmail.com", "tester");

		EmployeeDatabase database = new EmployeeDatabase();
		database.insertEmployee(e1);
		database.insertEmployee(e2);
		database.insertEmployee(e3);
		database.insertEmployee(e4);

		/*
		 * for (Employee e : database.getEmployeesByDesignation("trainer")) {
		 * System.out.println(e); }
		 */

		database.sortEmployeesBySalary();
		for (Employee e : database.getAllEmployees()) {
			System.out.println(e);
		}

	}
}
