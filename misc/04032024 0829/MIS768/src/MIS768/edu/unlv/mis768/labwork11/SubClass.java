package edu.unlv.mis768.labwork11;

public class SubClass extends SuperClass {
	
   /**
      Constructor
   */
   public SubClass() {
	   // get the value of the message field
	   String str = getMessage();
	   // append a string to the current value
	   str+="\nAdd a line to the message";
	   // set the updated string as the new value of the message field
	   setMessage(str);
   }
}
