package com.equelateral.triangle;
import java.util.Scanner;
public class AreaOfTriangle {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the side:");
int length=sc.nextInt();
double area=(1.73*length*length)/4;
System.out.println("Area of Equilateral triangle: "+area);

	}

}
