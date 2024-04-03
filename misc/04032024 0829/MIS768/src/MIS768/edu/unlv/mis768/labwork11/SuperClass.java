package edu.unlv.mis768.labwork11;

public class SuperClass{
	String message;
	
   /**
      Constructor
   */

   public SuperClass(){
      message ="Message from Super Class.";
   }

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
