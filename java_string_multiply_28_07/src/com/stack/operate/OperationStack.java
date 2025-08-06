package com.stack.operate;

import java.util.Stack;

public class OperationStack {

	public static void main(String args[]) {

		StackWithMax sItems = new StackWithMax();
		sItems.push(20);

		sItems.push(10);

		sItems.push(50);
		System.out.println(sItems.getMax());

	}

	static class StackWithMax {
		// main stack
		static Stack<Integer> mainStack = new Stack<Integer>();

		// Stack to keep track of max element
		static Stack<Integer> trackStack = new Stack<Integer>();

		void push(int x) {
			mainStack.push(x);
			if (mainStack.size() == 1) {
				trackStack.push(x);
				return;
			}

			if (x > trackStack.peek())
				trackStack.push(x);
			else
				trackStack.push(trackStack.peek());
		}

		int getMax() {
			return trackStack.peek();
		}

		void pop() {
			mainStack.pop();
			trackStack.pop();
		}
	};

}
