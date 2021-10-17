package com.thirdassignment2;

import java.util.Scanner;
import java.util.Stack;

import com.thirdassignment2.Skyscraper.StackSorting;

public class Driver {

	public static void main(String args[]) {

		Stack<Integer> input = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int floorcount = sc.nextInt();

		for (int i = 1; i <= floorcount; i++) {
			System.out.println("Enter the floor size given on day  " + i + " :");
			int floorsize = sc.nextInt();
		}
		input.push(1);
		input.push(2);
		input.push(3);

		System.out.println("The order of construction is as follows:" + StackSorting.sortStack(input));

	}

}
