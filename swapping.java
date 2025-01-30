import java.util.Scanner;
public class swapping {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the num1 ");
        int number1 = scanner.nextInt();
        System.out.println("enter the num2");
        int number2 = scanner.nextInt();
        System.out.println("BEFORE SWAPPING NUMBERS");
        System.out.println(number1);
        System.out.println(number2);
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("AFTER SWAPPING OF NUMBERS");
        System.out.println(number1);
        System.out.println(number2);
        scanner.close();
    }   
}