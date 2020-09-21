package com.cylinder;
import java.util.Scanner;
public class Cylinder {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the cylinder:");
float r=sc.nextFloat();
System.out.println("Enter the height of the cylinder:");
float h=sc.nextFloat();
float surfaceArea=(2*22*(r+h))/7;
System.out.println(surfaceArea);
}
}
