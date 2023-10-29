import java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Please enter a number for base of exponential number:");
        int base= input.nextInt();

        System.out.print("Please enter a number for exponent of exponent number:");
        int exponent=input.nextInt();

        int total=1;
        for (int i=1;i<=exponent;i++){
            total=total*base;
        }
        System.out.println(total);
    }
}
