package com.employee;

import java.util.Scanner;

public class MainApplication {
	public static void insertionSortBySalary(Employee[] arr, int size) {
		//1. count number of passes
		//2. take backup of i th element
		//3. compare backup element with all its neighbors
		//4. move j th element one position ahead
		//5. insert backup element at its appropriate position
		
		for(int i=1; i<size; i++) {
			Employee temp = arr[i];
			int j;
			
			for(j=i-1; j>=0 && arr[j].getSalary() < temp.getSalary(); j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}

	
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
		
		insertionSortBySalary(arrayEmployees, arrayEmployees.length);
		
		System.out.println("All employees after sort by salary: \n");
		for(Employee employee : arrayEmployees) {
			System.out.println(employee.toString());
		}
		
		scanner.close();
	}
}
