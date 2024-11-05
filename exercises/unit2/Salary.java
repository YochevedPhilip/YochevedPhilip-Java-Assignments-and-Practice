import java.util.Scanner;
public class Salary {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        final int ADULT = 18, SENIOR = 67;          
        final int GRANT = 200, HEALTH_TAX = 100;   
        int age; 
        double salary; 
        System.out.println("Please enter the age");
        age = scanner.nextInt(); 
        System.out.println("Please enter the age");
        salary = scanner.nextInt(); 
        if(age>=ADULT && age<SENIOR) 
           salary-=HEALTH_TAX; 
        else 
           salary+=200; 
        System.out.println("The salary is " + salary);
           
           
           
        
        
    }
    
}