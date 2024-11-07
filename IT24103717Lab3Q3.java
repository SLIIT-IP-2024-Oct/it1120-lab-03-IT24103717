import java.util.Scanner;
public class IT24103717Lab3Q3{
 public static void main(String[]args){
  Scanner input=new Scanner(System.in);
 System.out.print("Enter the Rupee amount=");
  int Amount=input.nextInt();
  int notes5000=Amount/5000;
  int remainder1=Amount%5000;
 System.out.println("5000 Notes-"+notes5000);
  int notes1000=(remainder1)/1000;
  int remainder2=(remainder1)%1000;
 System.out.println("1000 Notes-"+notes1000);
  int notes500=(remainder2)/500;
  int remainder3=(remainder2)%500;
 System.out.println("500 Notes-"+notes500);
  int notes200=(remainder3)/200;
  int remainder4=(remainder3)%200;
 System.out.println("200 Notes-"+notes200);
  int notes100=(remainder4)/100;
  int remainder5=(remainder4)%100;
 System.out.println("100 Notes-"+notes100);
  int notes50=(remainder5)/50;
  int remainder6=(remainder5)%50;
 System.out.println("50 Notes-"+notes50);
  int notes20=(remainder6)/20;
  int remainder7=(remainder6)%20;
 System.out.println("20 Notes-"+notes20);
  int coins10=(remainder7)/10;
  int remainder8=(remainder7)%10;
 System.out.println("10 coins-"+coins10);
   int coins05=(remainder8)/5;
   int remainder9=(remainder8)%5;
 System.out.println("05 coins-"+coins05);
   int coins02=(remainder9)/2;
   int remainder10=(remainder9)%2;
 System.out.println("02 coins-"+coins02);
 System.out.println("01 coins-"+remainder10);
  }
}  
   
