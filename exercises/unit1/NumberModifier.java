
import java.util.Scanner;
public class NumberModifier
{
    public static void main(String[] args) {
        int num; 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter a number"); 
        num = scanner.nextInt(); 
        
        switch(num) {
            case 1:
            case 2: 
                num+=1; 
                break; 
            case 3: 
            case 4: 
            case 5: 
                num-=1; 
                break; 
            case 6: 
                num*=2; 
                break;
            default: 
                num*=3;
                break;
            }
            System.out.println("The updated number is: " + num);
        }
        
        
    }
