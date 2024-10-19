package com.example.exception;

class InvalidAgeException extends Exception {
    String message;

    public InvalidAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

class InvalidNameException extends Exception {
    String message;

    public InvalidNameException(String message) { // Corrected here
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

class Employee {
    int eid;
    String name;
    int age;

    public Employee(int eid, String name, int age) throws InvalidAgeException, InvalidNameException {
        this.eid = eid;

        if (!doesNameContainAllAlphabets(name)) {
            throw new InvalidNameException("Name is invalid");
        } else {
            this.name = name;
        }

        if (age < 18) {
            throw new InvalidAgeException("Employee age is less than 18");
        } else {
            this.age = age;
        }
    }

    public static boolean doesNameContainAllAlphabets(String name) {
        for (char ch : name.toCharArray()) {
            int a = (int) ch;
            // Check for uppercase or lowercase letters
            if (!((a >= 65 && a <= 90) || (a >= 97 && a <= 122))) {
                return false; // Return false immediately if a non-alphabet character is found
            }
        }
        return true; // Return true only if all characters are alphabets
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
    }
}

public class UserDefinedExceptions {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee(1, "Akk&&&i", 11);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
    }
}



//package com.example.exception;
////import java
//
//class InvalidAgeException extends Exception{
//	String message;
//	public InvalidAgeException(String message) {
//		this.message = message;
//	}
//	public String getMessage() {
//		return this.message;
//	}
//}
//
//class InvalidNameException extends Exception{
//	String message;
//	public InvalidNameException(String message) {
//		this.message = message;
//
//	}
//		
//	public String getMessage() {
//		return this.message;
//	}
//}
//
//
//
//
//class Employee{
//	int eid;
//	String name;
//	int age;
//	public Employee(int eid, String name, int age) throws InvalidAgeException, InvalidNameException {
//		super();
//		this.eid = eid;
//		if(!doesNameContainsAllAlphabetes(name)) throw new InvalidNameException("Name is invalid");
//		else this.name = name;
//		if(age<18) throw new InvalidAgeException("employee age is less than 18");
//		else this.age = age;
//	}
//	
//	public static boolean doesNameContainsAllAlphabetes(String name) {
//		boolean flag = true;
//		for(char ch: name.toCharArray()) {
//			int a = (int)ch;
//			if(!((a>=65 && a<=90) || (a>=97 && a<=122))) {
//				flag = false;
//				break;
//			}
//		}
//		return flag;
//	}
//	
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
//	}
//	
//}
//
//public class UserDefinedExceptions {
//    public static void main(String [] args) {
//    	try {
//    		Employee e1 = new Employee(1, "Akki", 21);
//    	} catch(InvalidAgeException e) {
//    		System.out.print(e.getMessage());
//    	} catch (InvalidNameException e) {
//    		System.out.print(e.getMessage());
//		}
//    }
//}
