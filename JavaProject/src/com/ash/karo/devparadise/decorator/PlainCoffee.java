package com.ash.karo.devparadise.decorator;

//PlainCoffee.java
public class PlainCoffee implements Coffee {
 @Override
 public String getDescription() {
     return "Plain Coffee";
 }

 @Override
 public double getCost() {
     return 2.0;
 }
}