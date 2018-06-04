package com.practice.pyusha.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * input : size of array(int)
 * 			value of n(int)
 * 
 * output:array with random numbers b/w 0 to n
 * 
 * complexity: O(n)
 */
public class FillRandom {             
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int n = sc.nextInt();
		int[] array = new int[size];
		int[] result = FillRandomMethod(array, n);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] +" ");
		}
	}

	public static int[] FillRandomMethod(int[] arr, int n) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(n+1);
		}
		return arr;
	}
}
