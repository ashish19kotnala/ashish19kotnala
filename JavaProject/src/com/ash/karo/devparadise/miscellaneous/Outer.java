package com.ash.karo.devparadise.miscellaneous;

//Java program to demonstrate whether we can override private method 
//of outer class inside its inner class 
class Outer {
  private String msg = "GeeksforGeeks";
  private void fun() {
       System.out.println("Outer fun()");
  }

  class Inner extends Outer {
      private void fun()  {
            System.out.println("Accessing Private Member of Outer: " + msg);
      }
  }

  public static void main(String args[])  {

       // In order to create instance of Inner class, we need an Outer 
       // class instance. So, first create Outer class instance and then
       // inner class instance.
       Outer o = new Outer();
       Inner  i   = o.new Inner();
       
       // This will call Inner's fun, the purpose of this call is to 
       // show that private members of Outer can be accessed in Inner.
       i.fun();  

       // o.fun() calls Outer's fun (No run-time polymorphism).
       o = i; 
       o.fun();
  }
}

//Class 1 // Outer2 class 
class Outer2 { 
 // Method 1 
   // Private method of outer class 
 private void privateMethod() { 
     System.out.println("Private method in outer class"); 
 } 

 // Class 2 
   // Inner class 
 class Inner { 
     // Method 1 
       // Note: This will not be overriding private method of outer class 
     private void privateMethod() { 
         System.out.println("Private method in inner class"); 
     } 

     // Method 2 
       // Public method inside inner class 
     public void callPrivateMethod() { 
         // Calling private method of inner class 
         privateMethod(); 
     } 
 } 

 // Method 3 
   // Main driver method 
 public static void main(String[] args) { 
     // Creating object of outer and inner classes 
       // inside main() method 
     Outer2 outer = new Outer2(); 
     Outer2.Inner inner = outer.new Inner(); 
     inner.callPrivateMethod(); 
     outer.privateMethod();
 } 
}
