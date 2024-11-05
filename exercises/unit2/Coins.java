
import java.util.Scanner;
public class Coins {

    public static void main(String[] args) {
        int amount;
        int numberOfTenCoins; 
        int numberOfFiveCoins; 
        int numberOfOneCoins; 
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter a the amount"); 
        amount = scanner.nextInt(); 

        numberOfTenCoins=amount/10; 
        amount%=10; 
        
        numberOfFiveCoins=amount/5; 
        amount%=5; 
        
        numberOfOneCoins=amount; 
        
        System.out.println("We need " + numberOfTenCoins + " coins of 10 NIS");
        System.out.println("We need " + numberOfFiveCoins + " coins of 5 NIS");
        System.out.println("We need " + numberOfOneCoins + " coins of 1 NIS");

        }
        
        
    }