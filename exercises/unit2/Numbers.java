
import java.util.Scanner;
public class Numbers {

    public static void main(String[] args) {
        int num1;
        int num2;
        int sum; 
        int substraction;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter a number"); 
        num1 = scanner.nextInt(); 
        System.out.println("Please enter a number"); 
        num2 = scanner.nextInt(); 
        
        sum=num1+num2; 
        substraction=num1-num2; 
        
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println(num1 + "-" + num2 + "=" + substraction);

        }
        
        
    }