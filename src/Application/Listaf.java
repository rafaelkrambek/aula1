package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Listaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		ArrayList<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));

		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		System.out.print("Enter the percentage: ");
		int percentage = sc.nextInt();
		Employee emp = list.stream().filter(x->x.getId() ==id).findFirst().orElse(null);
		

		sc.close();

	}

}
