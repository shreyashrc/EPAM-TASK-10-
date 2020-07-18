package com.epam.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	//The method returns sum of elements of the List. 
	public void retSum(List<Integer> list){
		System.out.println("he sum of the Intgers is : ");
		System.out.println(list.stream().reduce(0,(c,e) -> c+e)) ;		
	}
	
	//The method returns sum Strings which have first character as 'a' and length = 3  
	public void filterList(List<String> list) {
		System.out.println("The filtered list is : ");
		list.stream().filter(i -> i.charAt(0) == 'a' && i.length() == 3).forEach(System.out::println);
	}
	
	//The function returns all palindromes in the given list .
	public void getPalindromes(List<String> list) {
		System.out.println("he palindromes in the list : ");
		list.stream().filter(i -> i.equals(new StringBuffer(i).reverse().toString())).forEach(System.out::println);		
	}
	
	
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(12 , 56 , 76 , 15 , 56 , 15) ;
		List<String> stringList1 = Arrays.asList("abs",  "abb" , "asdvdf" , "Adsd" , "Adc") ;
		List<String> stringList2 = Arrays.asList("aabaa" , "aBcBa" , "aaadaa" , "ascasc" , "MalayalaM" , "Sdcdw")  ;
		
		Demo d = new Demo() ;
		
		d.retSum(intList);
		d.filterList(stringList1);
		d.getPalindromes(stringList2);
		
		
	
		
	}
	

}
