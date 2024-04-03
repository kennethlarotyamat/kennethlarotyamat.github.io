package edu.unlv.mis768.labwork12;

/**
   This class holds data for a computer science student.
*/
public class BusinessStudent extends Student {
   // Required hours defined as constants
   private final int BIZ_HOURS = 40;     // Comp sci hours
   private final int GEN_ED_HOURS = 60; // Gen ed hours

   // Hours taken
   private int bizHours;    // Business  hours taken
   private int genEdHours; // General education hours taken

   /**
      The Constructor sets the student's name, 
      ID number, and the year admitted.
      @param n The student's name.
      @param id The student's ID number.
      @param year The year the student was admitted.
   */
   public BusinessStudent(String n, String id, int year)  {
      super(n, id, year);

   }

   /**
      The setCsHours method sets the number of 
      computer science hours taken.
      @param cs The computer science hours taken.
   */
   public void setBizHours(int b){
      bizHours = b;
   }

   /**
      The setGenEdHours method sets the number of 
      general ed hours taken.
      @param genEd The general ed hours taken.
   */
   public void setGenEdHours(int genEd) {
      genEdHours = genEd;
   }

   /**
      The getRemainingHours method returns the
      the number of hours remaining to be taken.
      @return The hours remaining for the student.
   */


}