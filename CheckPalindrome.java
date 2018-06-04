package com.practice.pyusha.arrays;

import java.util.Scanner;

/*
 * input : word to check for palindrome(String)
 * 
 * output: true/false
 * 
 * complexity: O(n)
 */
public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(isPalindrome(word));
	}

	public static boolean isPalindrome(String word) {
		int start_idx = 0;
		int end_indx = word.length()-1;
		boolean result = true;
		while (start_idx < end_indx) {
			if (word.charAt(start_idx) == word.charAt(end_indx)) {
				start_idx++;
				end_indx--;
			}else{
				result = false;
				break;
			}
		}
		return result;
	}
}
