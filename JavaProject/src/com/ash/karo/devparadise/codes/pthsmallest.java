package com.ash.karo.devparadise.codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pthsmallest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 10;//scanner.nextInt();
		//int[]  arry = new int[10];
		int[]  arry = new int[] {6,42,60,3,11,5,22,75,4,0};
		System.out.println("Arry created length = " + n);
		/*
		 * for(int i=0;i<n;i++) { System.out.println("Enter elements = " + i); arry[i] =
		 * scanner.nextInt(); }
		 */
		int p = 4;//scanner.nextInt();
		int x = 2;//scanner.nextInt();
		int z = 1;//scanner.nextInt();
		System.out.println("p = " + p + "x = " + x + "z = " + z);
		System.out.println(pthsmallerstelement(n,arry,p,x,z));
	}

	private static Integer pthsmallerstelement(int n, int[] arry, int p, int x, int z) {
		int res = 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		int[] temp = new int[p];
		int j = 0;
		for(int i = 0; i <arry.length;i++) {			
			if(arry[i] % x == z) {
				System.out.println(i);
				map.put(i, arry[i]);
				temp[j] = arry[i];
				j++;
			}
		}
		
		Arrays.sort(temp);
		
		for(int i:temp)
		System.out.println("value = " + i);
		
		System.out.println("RESULT FINAL = " + temp[p-1]);
		//Collections.so
		/*
		 * Object[] list = map.keySet().toArray();
		 * map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>
		 * comparingByValue()).forEach((k)-> System.out.println(k));
		 * 
		 * System.out.println("RESULT = " + arry[map.get(p-1)]); List<Object> finalList
		 * = Arrays.asList(list).stream().sorted().collect(Collectors.toList());
		 */
		
		return temp[p-1];
	}

}
