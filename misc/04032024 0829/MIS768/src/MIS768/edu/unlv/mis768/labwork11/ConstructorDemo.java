package edu.unlv.mis768.labwork11;  // Rather than using my own package names, I've decided to just use the default package names.
									// I end up - or at least I think that I should end up spending less time trying to figure out
									// sometimes it doesnt make a difference, but I figured I can save some time just using the default package name
									// that the assignment already has.

/**
   This program demonstrates the order in which
   superclass and subclass constructors are called.
*/

public class ConstructorDemo{
   public static void main(String[] args){
	   // instantiate an object of SubClass
	   // It should execute the SuperClass construct, then the SubClass constructor
      SubClass obj = new SubClass();
      
      // See the value of message after executing the two constructors
      System.out.print(obj.getMessage());
   }
}

// general class -> specialized class or base class and -> derived class
// extended from one class to another class.

// a subclass must be specific
// the circle extends from shape it is the first statement
