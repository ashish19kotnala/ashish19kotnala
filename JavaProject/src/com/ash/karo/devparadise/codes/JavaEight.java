package com.ash.karo.devparadise.codes;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEight {

	public static void main(String[] args) {

		List<List<String>> list = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("a1","b1"),Arrays.asList("a2","b2"));
		
		List<String> ary = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(ary);
		
	}

}
