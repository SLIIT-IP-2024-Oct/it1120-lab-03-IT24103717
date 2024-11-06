public class IT24103717Lab3Q1B{

    public static void main(String[] args){

           int priceof1kgrice= 225;
        
           int thenumberofkilogramswanted= 5;

           double priceof5kgrice=(priceof1kgrice*thenumberofkilogramswanted);
            
           double discount=priceof5kgrice*0.10;
 
           double totalamountwithdiscount=(priceof5kgrice-discount);

         
System.out.println("Enter the price of 1kg of rice:" +priceof1kgrice);

System.out.println("Enter the number of kilograms you want to buy:" + thenumberofkilogramswanted);
System.out.println();

System.out.println("The total amount with 10% discount is:" +totalamountwithdiscount);
      }

}