package question1.driver;

import java.util.Scanner;

import question1.services.Floor;

public class FloorSizeProblem {

	public static void main(String[] args) {

		System.out.println("enter the total no of floors in the building");

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];

		// Read the size of floors 
		for (int i = 0; i < n; i++) { 
			System.out.println("enter the floor size given on day :"+(i+1));
			array[i] = sc.nextInt();
			}
		
		//Declaration of Object for Floor Class
		Floor fl =new Floor();
		
		//Calling the FloorConstruction method of Floor Class
		fl.FloorConstruction(n, array);
		
		sc.close();

	}

}
