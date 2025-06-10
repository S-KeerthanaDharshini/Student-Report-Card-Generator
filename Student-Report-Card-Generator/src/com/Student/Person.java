package com.Student;

public class Person {
      private static String name;
      private static int age;
      
      public void setName(String name) {
    	  this.name = name;
      }
      public String getName() {
    	  return name;
      }
      public void setAge(int age) {
    	  this.age= age;
      }
      public int getAge() {
    	  return age;
      }
      public void displayDetails() {
    	  System.out.println("Name : "+name);
    	  System.out.println("Age : "+age);
      }
}
