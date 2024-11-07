import java.util.Scanner;

public class IT24103717Lab3Q1B{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of 1kg of rice: ");

           double priceof1kgrice= input.nextDouble();
        
        System.out.println("Enter the number of kilograms you want to buy: ")
        
          double thenumberofkilogramswanted= input.nextDouble();

           double priceof5kgrice=(priceof1kgrice*thenumberofkilogramswanted);
            
           double discount=priceof5kgrice*0.10;
 
           double totalamountwithdiscount=(priceof5kgrice-discount);
        
        System.out.println("The total amount after 10% discount is: " + totalamountwithdiscount);
        

         


System.out.println("Enter the number of kilograms you want to buy:" + thenumberofkilogramswanted);
System.out.println();

System.out.println("The total amount with 10% discount is:" +totalamountwithdiscount);
      }

}
