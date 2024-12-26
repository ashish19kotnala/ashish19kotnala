package com.ash.karo.devparadise.codes;

import java.util.HashMap;
import java.util.Map;

public class CommonArrary {

	public static void main(String[] args) {

		int[] integer1= {1,2,3,4,5,6};
		int[] integer2= {4,5,6,7,8};
		int[] integer3= {4,5,6};
		
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int[] combined = new int[integer1.length+integer2.length+integer3.length];
		int counter = 0;
		for(int i=0; i<integer1.length;i++) {
			map.put(integer1[i], false); // [0,1] [1,2]....
			counter++;
		}
		for(int i=0; i<integer2.length;i++) {
			if(map.containsKey(integer2[i])) {
				//System.out.println("{"+ integer2[i] + ",");
				combined[counter] = integer2[i]; 
				map.put(integer2[i], true);
				counter++;
			}
			map.put(integer2[i], false); // [0,1] [1,2]....
			
		}
		for(int i=0; i<integer3.length;i++) {
			combined[counter] = integer3[i];
			if(map.containsKey(integer3[i]) && map.get(integer3[i]).booleanValue() == true) {
				//System.out.println(" "+ integer3[i] + "}");
				combined[counter] = integer2[i]; 
				
				counter++;
			}
			map.put(integer2[i], false); // [0,1] [1,2]....
		}
		
		
		System.out.println();
		for(int i=0; i<counter;i++) {
			System.out.println(combined[i]);
		}
	}

}
