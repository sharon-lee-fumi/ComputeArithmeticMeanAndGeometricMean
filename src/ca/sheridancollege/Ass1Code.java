package ca.sheridancollege;

import java.util.Scanner;

public class Ass1Code {

	public static void main(String[] args) {
		double n = 0.0;
		double sum = 0.0;
		double mul = 0.0;
		double aMean = 0.0;
		double gMean = 0.0;
		
		double num[] = new double[50];
        Scanner scan = new Scanner(System.in);
		
        System.out.println("How many number you want to Calculate ? ");
        n = scan.nextDouble();
		
        System.out.println("Please enter " + n + " numbers that you want to calculate: ");
        sum = mul = scan.nextDouble();
        for(int i= 1; i < n; i++)
        {
        	num[i] = scan.nextDouble();
            sum = sum + num[i];
            mul = mul * num[i];
        }
		
        aMean = sum / n;
        gMean = Math.pow(mul, (1.0 /n));
		
        System.out.println("Arithmetic Mean = " + aMean);
        System.out.println("Geometric Mean = " + gMean);
	}

}
