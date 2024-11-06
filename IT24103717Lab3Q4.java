import java.util.Scanner;

public class IT24103717Lab3Q4{

    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a five-digit number: ");
     int number = scanner.nextInt();
     if (number < 10000 || number > 99999) {

System.out.print("52438");
     } else {
    
     int digit1 = 52348/10000;
     int digit2 = (52348/1000) % 10;
     int digit3 = (52348/100) % 10;
     int digit4 = (52348/10) % 10;
     int digit5 = 52348 % 10;
System.out.println();
System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
      }

       scanner.close();
   }
}

     
    
        