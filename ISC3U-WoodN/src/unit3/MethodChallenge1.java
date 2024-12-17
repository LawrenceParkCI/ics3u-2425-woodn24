package unit3;
/**
Description:Leaning about methods and creating part of one
Date: 2024-12-17
@author Nathan Wood
*/

public class MethodChallenge1 {
   public static void main( String[] args )    {
       // Complete the function below. Don't forget to comment.
       double d1 = distance(-2,1 , 1,5);
       System.out.println(" (-2,1) to (1,5) => " + d1 );

       double d2 = distance(-2,-3 , -4,4);
       System.out.println(" (-2,-3) to (-4,4) => " + d2 );

       System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

       System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
     
   }

 /**
 (Description)
 @param x1 -> The first x coordinate
 @param y1 -> The first y coordinate
 @param x2 -> The second x coordinate 
 @param y2 -> The second y coordinate
 @return The distance from (0,0) to the new point
 */
   public static double distance( int x1, int y1, int x2, int y2 ) {
       // put your code up in here
	   int xtotal = (x1 - x2);
	   int ytotal = (y1 - y2);
   return Math.sqrt(xtotal * xtotal + ytotal * ytotal);
  
   }
}