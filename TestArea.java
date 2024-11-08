package OOPS;

import java.util.Scanner;

interface Shapee {
	public void printArea();
}

class Rectanglee implements Shapee {
	public void printArea() {
		System.out.println("\t\tCalculating Area of Rectangle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int a = input.nextInt();
		System.out.print("\nEnter breadth: ");
		int b = input.nextInt();
		int area = a * b;
		System.out.println("Area of Rectangle: " + area);
	}
}

class Trianglee implements Shapee {
	public void printArea() {
		System.out.println("\t\tCalculating Area of Triangle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter height: ");
		int a = input.nextInt();
		System.out.print("\nEnter breadth: ");
		int b = input.nextInt();
		double area = 0.5 * a * b;
		System.out.println("Area of Triangle: " + area);
	}
}

class Circlee implements Shapee {
	public void printArea() {
		System.out.println("\t\tCalculating Area of Circle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int a = input.nextInt();
		double area = 3.14 * a * a;
		System.out.println("Area of Circle: " + area);
	}
}

public class TestArea {
	public static void main(String[] args) {
		Shapee obj;
		obj = new Rectanglee();
		obj.printArea();
		obj = new Trianglee();
		obj.printArea();
		obj = new Circlee();
		obj.printArea();
	}
}