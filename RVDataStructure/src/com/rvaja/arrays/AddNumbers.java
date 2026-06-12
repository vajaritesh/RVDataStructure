package com.rvaja.arrays;

public class AddNumbers {

	public static void main(String[] args) {
		System.out.println("RV Addition of numbers in Arrays");
		int[] arr = {1,2,3,4,5};
		int sum = addNumbers(arr);		
		System.out.println("Addition Result: "+ sum);
	}

	private static int addNumbers(int[] arr) {
		int sum = 0;
		for(int num:arr) {
			sum +=  num;
		}
		return sum;
	}

}
