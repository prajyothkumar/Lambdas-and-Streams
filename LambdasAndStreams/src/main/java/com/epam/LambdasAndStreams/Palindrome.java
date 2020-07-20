package com.epam.LambdasAndStreams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
interface Palin
{
	boolean check(List<String> l1);
}

public class Palindrome {
	public static boolean isPalindrome(List<String> l1) {
	    Collections.replaceAll(l1,"\\s+", " ");
		l1.replaceAll(e->e.toLowerCase());
		boolean c = false;
		List<String> l2=new ArrayList<String>();
		for(String str:l1)
		{
		c=IntStream.range(0, str.length() / 2)
					 .noneMatch(i-> str.charAt(i) != str.charAt(str.length() - i - 1));	
			 if(c==true)
				l2.add(str);
		}
		l2.forEach(System.out::println);
	    return c;
	}
	public static void main(String[] args) {	        
				List<String> l1=new ArrayList<String>(Arrays.asList("sea","madam","kavya","anna","mom"));
				System.out.println("The list of palindromes:");
				Palin p1=Palindrome::isPalindrome;
				p1.check(l1);
			   }   
}
