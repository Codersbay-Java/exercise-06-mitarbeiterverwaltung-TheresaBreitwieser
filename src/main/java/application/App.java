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

		do{
			System.out.println("Please create a department with Name, Country and City");
			String departmentName = scanner.next();
			String country = scanner.next();
			String city = scanner.next();

			System.out.println("Please create an employee record with employee first and last name");
			String firstName = scanner.next();
			String lastName = scanner.next();

			System.out.println("Sie haben folgenden Mitarbeiter angelegt");
			Department departmentNew=new Department(departmentName, country, city);
			Employee employeeNew = new Employee(firstName, lastName, departmentNew);

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


