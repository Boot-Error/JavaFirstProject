package com.sapient;

import java.util.*;

/*
 * Num process module
 *
 */

interface numProcess {

	public abstract int cal(int a, int b);
}

class calculator {

	public static void run() {

		numProcess add = (a, b) -> { return a + b; };
		numProcess sub = (a, b) -> { return a - b; };
		numProcess mul = (a, b) -> { return a * b; };
		numProcess div = (a, b) -> { return a / b; };

		numProcess[] opts = {add, sub, mul, div};

		Scanner sc = new Scanner(System.in);

		int a, b;
		while (true) {

			System.out.println("Enter 2 numbers: ");

			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("Enter choice for computing: ");

			int ch = sc.nextInt();

			int res = opts[ch].cal(a, b);
			System.out.println("The result is " + res);

		}
	}
}
