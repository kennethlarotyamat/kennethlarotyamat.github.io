package edu.unlv.mis768.labwork12;

/**
   StreamingMovie class
*/

public class StreamingMovie implements RetailItem {
   private String title;       // The movie title
   private int runningTime;    // Running time in minutes
   private double retailPrice; // The movie's retail price
   
   /**
      Constructor
      @param movieTitle The movie title.
      @param runTime The running time in minutes.
      @param moviePrice The movie price.
   */

   public StreamingMovie(String movieTitle, int runTime, double moviePrice) {
      title = movieTitle;
      runningTime = runTime;
      retailPrice = moviePrice;
   }
   
   /**
      getTitle method
      @return The movie's title.
   */

   public String getTitle() {
      return title;
   }
   
   /**
      getRunningTime method
      @return The running time in minutes.
   */

   public int getRunningTime() {
      return runningTime;
   }

   /**
      getRetailPrice method (Required by the RetailItem
      interface)
      @return The retail price of the movie.
   */

   public double getRetailPrice() {
      return retailPrice;
   }
   
   /**
    * toString method overwrite the default toString method
    * @return The product type, title and running time.
    */
   public String toString(){
	   String str = "The product is a DVD.\n"
	   		+ "The title is "+this.title+".\n"
	   		+ "The running time is "+this.runningTime+" minutes.\n";
	   return str;
   }
}