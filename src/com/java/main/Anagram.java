package com.java.main;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args) {
		isAnagram("nabLKKKKKKKDCNK,CZ","JSABKSXAB,SD");
	}

	private static void isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		String str1=a.toLowerCase().replace(" ", "");
		String str2=b.toLowerCase().replace(" ", "");
		System.out.println(str1+ "  "+str2);
		boolean status=false;
		if(str1.length()!=str2.length()) {
			status=false;
		}else {
			char[] str1char=str1.toCharArray();
			char[] str2char=str2.toCharArray();
			Arrays.sort(str1char);
			Arrays.sort(str2char);
			System.out.println(String.valueOf(str1char)+ "  "+String.valueOf(str2char));
			if(String.valueOf(str1char).equals(String.valueOf(str2char))) {
				status=true;
				System.out.println("true");
			}else {
				status=false;
			}
		}
		if(status) {
			System.out.println(a+" and "+b +" are Anagrams");
		}else {
			System.out.println(a+" and "+b +" are not Anagrams");
		}

	}
}
