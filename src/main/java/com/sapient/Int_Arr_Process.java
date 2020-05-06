package com.sapient;

import java.util.*;

class Int_Arr_Process {

	int[] arr;

	public Int_Arr_Process() {

		this.arr = new int[10];
	}

	public Int_Arr_Process(int size) {

		this.arr = new int[size];
	}

	public Int_Arr_Process(Int_Arr_Process iap) {

		this.arr = iap.arr;
	}

	public void readArray() {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.arr.length; i++) {

			System.out.println("Enter the value at arr[" + i + "]: ");
			arr[i] = sc.nextInt();

		}
	}

	public void displayArr() {

		System.out.println("The array displayed horizontally");

		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i]);
		}

		System.out.println("\nThe Array displayed vertically");

		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}

	public void sort() {

		Arrays.sort(this.arr);
	}

	public void BigSmall() {
	
		int big = Integer,MIN_VALUE;
		int small = Integer.MAX_VALUE;

		for (int i = 0; i < this.arr.length; i++) {

			int val = this.arr[i];
			if (val > big) {
				big = val;
			}

			if (val < small) {
				small = val;
			}
		}

		System.out.println("The smallest number is " + small);
		System.out.println("The biggest number is " + big);
	}

	public void Sum() {

		int sum = 0;
		for (int i = 0; i < this.arr.length; i++) {
			sum += this.arr[i];
		}
	}

	public void secondBig() {

		int sbig = Integer.MIN_VALUE;
		int big = sbig + 1;

		for (int i = 0; i < this.arr.length; i++) {

			int val = this.arr.length;

			if (val > big) {
				sbig = big;
				big = val;
			}
		}

		System.out.println("The second biggest value is " + sbig);

	}
}
