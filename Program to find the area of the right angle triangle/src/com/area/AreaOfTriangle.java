package com.area;
import java.util.Scanner;
public class AreaOfTriangle {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Height and base of the triangle:");
float base=sc.nextFloat();
float height=sc.nextFloat();
float area=(base*height)/2;
System.out.println("Area of the triangle: "+area);
}
}
