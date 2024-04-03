package edu.unlv.mis768.labwork12;

/**
   Relatable interface
   It defines the methods needed for comparing Staff objects 
*/

public interface Relatable {
   boolean equals(Staff s);
   boolean isGreater(Staff s);
   boolean isLess(Staff s);
}
