package com.thirdassignment2;

import java.util.Stack;

public class Skyscraper {
	class StackSorting {
		int floorcount;
		int floorsize;
        
        
		static Stack<Integer> sortStack(Stack<Integer> input) {
			
				
			
			Stack<Integer> tempStack = new Stack<Integer>();
			while (!input.isEmpty()) {
				int temp = input.pop();
				while (!tempStack.isEmpty() && tempStack.peek() < temp) {

					input.push(tempStack.pop());
				}
				tempStack.push(temp);

			}
			return tempStack;

		}
		
	}
}
