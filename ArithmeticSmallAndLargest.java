package chapterTwo;



import java.util.Scanner;
public class ArithmeticSmallAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int average;
        int product;
        int smallest;
        int largest;
        int a, b, c;

        System.out.println("Input First Integer");
        a = input.nextInt();
        sum = sum + a;

        System.out.println("Input Second Integer");
        b = input.nextInt();
        sum = sum + b;

        System.out.println("Input Third Integer");
        c = input.nextInt();
        sum = sum + c;

        System.out.printf("Sum is %d%n", sum);

        average = sum / 3;
        System.out.printf("Average is %d ", average);

        product = a*b*c;
        System.out.printf("Product is %d%n ", product);






    }





}
