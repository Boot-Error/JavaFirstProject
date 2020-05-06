package com.sapient;

import java.util.*;

class Matrix {

	int[] arr;
	int rows;
	int cols;

	private void createMatrix() {
		this.arr = new int[this.rows * this.cols];
	}

	public Matrix(int rows, int cols) {
		
		this.rows = rows;
		this.cols = cols;

		this.createMatrix();
	}


	public Matrix() {

		this.rows = 3;
		this.cols = 3;

		this.createMatrix();
	}

	public Matrix(Matrix m) {

		this.rows = m.rows;
		this.cols = m.cols;

		this.arr = m.arr;
	}

	private int flatIndex(int r, int c) {

		return (this.cols * r) + c;
	}

	public void readMatrix() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {

				System.out.println("Enter value at [" + i + ", " + j + "]: ");
				this.arr[this.flatIndex(i, j)] = sc.nextInt();
			}
		}
	}

	public void displayMatrix() {

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {

				System.out.print(this.arr[this.flatIndex(i, j)] + ", ");
			}

			System.out.print("\n");
		}
	}

	public Matrix addMatrix(Matrix other) {

		if (this.rows != other.rows || this.cols != other.cols) {
			System.out.println("Matrix dimensions are not equal");
			return null;
		}

		Matrix res = new Matrix(other);

		for (int i = 0; i < this.rows * this.cols; i++) {
			res.arr[i] = this.arr[i] + other.arr[i];
		}

		return res;
	}

	public boolean isScalar() {

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (i != j) {
					if (this.arr[this.flatIndex(i, j)] != 0) {
						System.out.println("Matrix is not scalar");
						return false;
					}
				}
			}
		}

		System.out.println("Matrix is scalar");
		return true;

	}
}
