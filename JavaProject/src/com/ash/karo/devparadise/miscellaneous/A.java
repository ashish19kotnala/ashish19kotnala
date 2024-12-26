package com.ash.karo.devparadise.miscellaneous;

import java.util.Objects;

public class A {
	
	private String field;
	
	private String field2;
	
	@Override
	public int hashCode() {
		return Objects.hash(field, field2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return Objects.equals(field, other.field) && Objects.equals(field2, other.field2);
	}

	public Integer a() {
		return 1;
	}
	
	
}
