package application;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Department department1 = new Department("Customer Service", "USA", "Boston");
		Employee employee2 = new Employee("Hubert", "Maier", department1);

		employee2.print();
		employee1.print();

		System.out.println(employee1.isEquals(employee2));
		System.out.println(department1.isEquals(new Department()));

		application();
	}

	private static void application() {
		Scanner scanner = new Scanner(System.in);
		String userSelection="";

		Department[] departmentList = new Department[5];
		departmentList[0] = new Department("Customer Service", "UK", "London");
		departmentList[1] = new Department("Sales", "DE", "Berlin");
		departmentList[2] = new Department("Research", "CH", "Bern");
		departmentList[3] = new Department("Finance", "AT", "Vienna");
		int departmentNumber = 0;


		do{
			System.out.println("Would you like to create a new department select yes, otherwise no to choose from an existing department");
			String selection = scanner.next();


			if(selection.equalsIgnoreCase("yes")) {
				System.out.println("Please create a department with Name, Country and City");
				String departmentName = scanner.next();
				System.out.println(departmentName);
				String country = scanner.next();
				System.out.println(country);
				String city = scanner.next();
				System.out.println(city);
				departmentList[4]=new Department(departmentName, country, city);
				departmentNumber = 4;
			} else if(selection.equalsIgnoreCase("no")) {
				System.out.println("These are the following departments. Please select with the corresponding number");
				for(int i=0; i< departmentList.length; i++) {
					System.out.println("Number: " + i + "Department name: " + departmentList[i]);
				}
				departmentNumber = scanner.nextInt();
			}

			System.out.println("Please create an employee record with employee first and last name");
			String firstName = scanner.next();
			String lastName = scanner.next();

			System.out.println("Sie haben folgenden Mitarbeiter angelegt");

			Employee employeeNew = new Employee(firstName, lastName, departmentList[departmentNumber]);

			System.out.println(employeeNew);

			System.out.println("Would you like to register another employee. Enter j for yes and n for close");
			userSelection = scanner.next();

		}
		while(userSelection.equalsIgnoreCase("j"));
		System.out.println("Goodbye");
	}

}




	/*
	 * for the bonus task
	 *
	 * private static int generateID() {}
	 *
	 */


