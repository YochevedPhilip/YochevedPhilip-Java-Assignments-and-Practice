import java.util.Scanner;
/*
 * A class that get 3 points coordinats, and return the longest
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
        
        double maxLong; 
        
        if(longAB>=longBC) {
            maxLong=longAB; 
            if(longAB<longAC) {
                maxLong=longAC; 
            }
        } else if (longBC>=longAC) {
            maxLong=longBC; 
        } else {
            maxLong=longAC;
        }
        
        int xPrint1, xPrint2, yPrint1, yPrint2;   
        switch(maxLong) {
            case longAB: 
                xPrint1=x1; 
                xPrint2=x2; 
                yPrint1=y1; 
                yPrint2=y2;
                break;
            case longBC: 
                xPrint1=x2; 
                xPrint2=x3; 
                yPrint1=y2; 
                yPrint2=y3;
                break;
            case longAC: 
                xPrint1=x1; 
                xPrint2=x3; 
                yPrint1=y1; 
                yPrint2=y3;
                break;
        }
        
        String points="("+ xPrint1 + "," + yPrint1 + ")" + "," + "("+ xPrint2 + "," + yPrint2 + ")";
        System.out.println("Maxlinecreatedbythefollowingpoints:" + points);


        
        
        //...
    } // end of method main
} //end of class MaxLine