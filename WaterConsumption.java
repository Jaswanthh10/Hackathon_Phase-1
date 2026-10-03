import java.util.Scanner;
public class WaterConsumption {
    public static void main (String[] args){
Scanner sc=new Scanner(System.in);
  System.out.println("Enter the water consumed in liters: ");
  double water=sc.nextDouble();
  int bill;
if(water<=500)
     bill=100;
else
  bill=200;
System.out.println("Bill Amount: " + bill);
    }}