import java.util.Scanner;

public class IT24103717Lab3Q2{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
     System.out.print("Enter the monthly salary: ");
       double monthlysalary= input.nextDouble();
        
     System.out.print("Enter the number of OT hours: ");
      double numberofothours= input.nextDouble();

     System.out.print("Enter the OT hourly rate: ");
       double othourlyrate= input.nextDouble();

       double otamount=(othourlyrate*numberofothours);

       double totalsalary=(monthlysalary+ otamount);

     System.out.println();

    System.out.print("The total salary including OT is: " +totalsalary);
      }

}

       

       
           
    
