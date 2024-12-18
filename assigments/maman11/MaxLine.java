import java.util.Scanner;
/**
 * This program calculates the longest distance between three given points on a 2D plane.
 * It reads the coordinates of the three points, computes the lengths of the three possible lines,
 *  and identifies the pair of points that זform the longest line segment.
 * @author (Yocheved Philip)
 * @version (208664433)
 */
public class MaxLine{ 
    public static void main (String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first point coordinates:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println ("Enter second point coordinates:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println ("Enter third point coordinates:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt(); 

        double longAB = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)); 
        double longBC = Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2)); 
        double longAC = Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2)); 
        String points;

        if(longAB>=longBC && longAB>=longAC) {
            points="("+ x1 + "," + y1 + ")" + ", " + "("+ x2 + "," + y2 + ").";
        } else if (longBC>=longAC && longBC >= longAB) {
            points="("+ x2 + "," + y2 + ")" + ", " + "("+ x3 + "," + x3 + ").";
        } else {
            points="("+ x1 + "," + y1 + ")" + ", " + "("+ x3 + "," + y3 + ").";
        }
        
        System.out.println("Maxlinecreatedbythefollowingpoints:" + points);
        
    } // end of method main
} //end of class MaxLine