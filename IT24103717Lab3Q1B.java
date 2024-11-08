import java.util.Scanner;

public class IT24103717Lab3Q1B{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");

           double priceof1kgrice= input.nextDouble();
        
        System.out.print("Enter the number of kilograms you want to buy: ")
        
          double thenumberofkilogramswanted= input.nextDouble();

           double priceofkgrice=(priceof1kgrice*thenumberofkilogramswanted);
            
           double discount=priceofkgrice*0.10;
 
           double totalamountwithdiscount=(priceofkgrice-discount);
        
        System.out.println();
        
        System.out.print("The total amount after 10% discount is: " + totalamountwithdiscount);
        

         





      }

}
