package com.sphere;
import java.util.Scanner;
public class Sphere {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the radius of sphere:");
double  radius=sc.nextInt();
double pie=3.14285714286;  
double volume=(4.0/3.0)*pie*Math.pow(radius, 3.0);
System.out.println("Volume of sphere: "+volume);
}
}
