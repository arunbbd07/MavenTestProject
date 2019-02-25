package com.arun.corejava;

public class TwoDimArray {

	public static void main(String[] args) {
		int[][] twoarr = new int[4][3];
		int temp = 10;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				twoarr[i][j] = temp;
				temp += 10;
			}
		}
		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 3; l++) {
				System.out.print(twoarr[k][l] + " ");
			}
			System.out.println();
		}

	}

}
