package com.ash.karo.devparadise.miscellaneous;

class Base {
	  public void fun() //private
	  {
	     System.out.println("Base fun");	 
	  }
	}
	 
class Derived extends Base {
  public void fun() //private
  {
     System.out.println("Derived fun");	 
  }
  
  static void method () {
	  System.out.println("sacsac");
  }
  
  public static void main(String[] args) {
      Base obj = new Derived();
      obj.fun();
      
      Derived obj2 = null;
      Derived.method();
      obj2.method();
      }  
}