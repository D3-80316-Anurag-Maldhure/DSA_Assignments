package com.employee;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Employee[] arrayEmployees = new Employee[5];
		
		arrayEmployees[0] = new Employee(1, "Rishi", "Shinde", 80012.12, "Statistics");
		arrayEmployees[1] = new Employee(2, "Anurag", "Maldhure", 205212.12, "Technology");
		arrayEmployees[2] = new Employee(3, "Sandesh", "Tribhuvan", 10210.12, "Statistics");
		arrayEmployees[3] = new Employee(4, "Kaustubh", "Patil", 70212.32, "CRM");
		arrayEmployees[4] = new Employee(5, "Kunal", "Bhojankar", 21455.12, "Trainee");
		
		System.out.println("All employees: \n");
		for(Employee employee : arrayEmployees) {
			System.out.println(employee.toString());
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------");
	
		System.out.println("Enter the employee id of the employee you want to search : ");
		int idToSearch = scanner.nextInt();
		for(int i=0; i<arrayEmployees.length; i++) {
			if(arrayEmployees[i].getEmpId() == idToSearch) {
				System.out.println("Employee with id = " + idToSearch + " found!");
				System.out.println("\n" + arrayEmployees[i].toString());
				break;
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Enter the employee id of the employee you want to search : ");
		String fnameToSearch = scanner.next();
		for(int i=0; i<arrayEmployees.length; i++) {
			if(arrayEmployees[i].getFnameString().equals(fnameToSearch)) {
				System.out.println("Employee with first name = " + fnameToSearch + " found!");
				System.out.println("\n" + arrayEmployees[i].toString());
				break;
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Enter the employee id of the employee you want to search : ");
		double salaryToSearch = scanner.nextDouble();
		for(int i=0; i<arrayEmployees.length; i++) {
			if(arrayEmployees[i].getSalary() == salaryToSearch) {
				System.out.println("Employee with salary = " + salaryToSearch + " found!");
				System.out.println("\n" + arrayEmployees[i].toString());
				break;
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------");
		scanner.close();
	}

}
