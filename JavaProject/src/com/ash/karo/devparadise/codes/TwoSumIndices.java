package com.ash.karo.devparadise.codes;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndices {
	
	public static void main(String...args) {

		int[] ary = {2,7,11,4,9,5};		
		int[] result = new int[2];
		int sum = 9;
		Map<Integer, Integer> mapStore = new HashMap<Integer, Integer>();
		for(int i=0;i<ary.length;i++) {
			if(mapStore.containsKey(sum - ary[i])) {
				result[0] = mapStore.get(sum - ary[i]);
				result[1] = i;
				System.out.println(result[0] + "" + result[1]);
			} else {
				mapStore.put(ary[i], i);
			}
		}
	}
}
