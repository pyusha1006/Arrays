package com.practice.pyusha.arrays;

import java.util.Scanner;

/*
 * input : sentence to count vowels in(String)
 * 
 * output:no.og vowels
 * 
 * complexity: O(n)
 */
public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(countVowels(line));
	}

	public static int countVowels(String line) {
		int count = 0;
		for(int i =0;i<line.length();i++){
			if(line.charAt(i)=='a' || line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u')
				count++;
		}
		return count;
	}
}
