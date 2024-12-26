package com.ash.karo.devparadise.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ash.karo.devparadise.model.Employee;

public class All {

	public static void main(String[] args) {
		// I have a problem with System.exit(0);. When I tried the below code the output was nothing because of System.exit(0);:
		//Q1();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Q2");
		// Given the array {10, 1, 20, 2, 100, 100, 100}, write Java code using Java Streams to 
		// determine the number of occurrences of a particular value.
		Q2();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Q3");
		
		// How to find only duplicate elements with their count from the String ArrayList in Java 8?
		Q3();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Q4");
		
		// Write a program to print the count of each character in a String using streams.
		Q4();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Q5");
		
		// Write a Program to give the sum of the salary of employees.
		Q5();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Q6");
		
		// Write a Program to give the sum of the salary of employees.
		Q6();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Q7");
		
		// Write a Program to give the sum of the salary of employees.
		Q7();
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Q8");
		
		//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
		Q8();
	}
	
	
	private static void Q1() {
		String number = "12345M";
		try {
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("inside finally");
		}

		try {
			System.exit(0);
		} finally {
			System.out.println("I am  finally block");
		}
	}

	
	private static void Q2() {
		
		int[] values = {10, 1, 20, 2, 100, 100, 100};
		int number = 100;

		// Wont work
		//System.out.println(Arrays.asList(values).stream().filter(s-> s == number).count());

		long result = Arrays.stream(values).filter(value -> value == number).count();
		System.out.println(result);
	}

	
	private static void Q3() {
		List<String> words = Arrays.asList("Dev","Byte","School","Dev","Byte");
		
		System.out.println(words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())));
	}
	

	private static void Q4() {
		String val= "DevByteSchool";
		
		Map<Character, Long> charCount = val.chars().mapToObj(c -> (char)c)
			    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

			System.out.println(charCount);
	}

	
	private static void Q5() {
		
		// Write a Program to give the sum of the salary of employees.
		
		Employee employee1=new Employee("test1",1000);
		Employee employee2=new Employee("test2",2000);
		Employee employee3=new Employee("test3",3000);
		Employee employee4=new Employee("test1",4000);
		
		List<Employee> employees=new ArrayList<>();

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		//employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).;
		System.out.println(employees.stream().mapToDouble(Employee::getSalary).sum());
	}
	
	private static void Q6() {
		Employee employee1=new Employee("test1",1000);
		Employee employee2=new Employee("test2",2000);
		Employee employee3=new Employee("test3",3000);
		Employee employee4=new Employee("test1",4000);
		
		List<Employee> employees=new ArrayList<>();

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		Map<String,Double> uniqueEmployee = employees.stream()
			    .collect(Collectors.toMap(Employee::getName,Employee::getSalary,
			        (existing,replacement)->existing,()-> new TreeMap<>(Comparator.naturalOrder())));

			System.out.println(uniqueEmployee);		
	}
	
	private static void Q7() {
		// Given a String, find the first non-repeated character in it using Stream functions.
		
		String str = "aabbcddef";
		
		//System.out.println(str.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		Optional<Character> firstNonRepeatedChar = null;
		LinkedHashMap<Character, Boolean> mapNow = str.chars()
			    .mapToObj(c -> (char) c)
			    .collect(
			        LinkedHashMap::new,
			        (map, ch) -> map.put(ch, !map.containsKey(ch)),
			        LinkedHashMap::putAll
			    );
		System.out.println(mapNow);
		
		firstNonRepeatedChar = mapNow.entrySet().stream().filter(entry -> entry.getValue())
		  .map(Map.Entry::getKey).findFirst();
		 
		firstNonRepeatedChar.ifPresent(System.out::println);
			
	}
	
	
	private static void Q8() {
		
	}

}
