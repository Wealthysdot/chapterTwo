package chapterTwo;

import java.util.Scanner;

public class BMI{
    public static void main(String []args){


        double weight;
        double height;
        double BMI;

        Scanner input = new Scanner(System.in);

        System.out.println ("Enter Weight in Kilograms");
        weight = input.nextDouble();

        System.out.println ("Enter height in meters");
        height = input.nextDouble();

        BMI = weight / (height * height);
        System.out.printf("BMI is %.2f %n", BMI);

        if (BMI < 18.5) {
            System.out.println ("You are Underweight");
        }

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println ("You are Normal");
        }

        if (BMI > 25 && BMI <= 29.9) {
            System.out.println ("You are Overweight");
        }

        if (BMI >= 30) {
            System.out.println ("You are Obese");
        }


    }
}
