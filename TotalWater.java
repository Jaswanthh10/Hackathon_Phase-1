import java.util.Scanner;
public class TotalWater{
static int calculateTotal(int morningUsage, int eveningUsage) {
    return morningUsage + eveningUsage;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the water consumed in the morning in liters: ");
        int a=sc.nextInt();
        System.out.println("Enter the water consumed in the evening in liters: ");
        int b=sc.nextInt();
        int total=calculateTotal(a, b);
        System.out.println("Total water consumed: " + total + " liters");
    }
}