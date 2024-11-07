import java.util.Scanner;

public class IT24103717Lab3Q1A{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of 1kg of rice: ");
          double priceof1kgrice= input.nextDouble();

        System.out.println("Enter the number of kilograms you want to buy: ");
          double thenumberofkilogramswanted= input.nextDouble();

          double totalpriceofrice=(priceof1kgrice * thenumberofkilogramswanted);


        System.out.println();

        System.out.println("The total amount is: " +totalpriceofrice);



    }
}

         
