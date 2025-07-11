package practice_pack.basics;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        float tempK = tempC + 273.15f;
        System.out.println("Temperature in Fahrenheit: " + tempF);
        System.out.println("Temperature in Kelvin: " + tempK);
    }
}
