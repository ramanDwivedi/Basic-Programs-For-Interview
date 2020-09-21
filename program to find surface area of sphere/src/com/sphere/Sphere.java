package com.sphere;
import java.util.Scanner;
public class Sphere {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the sphere:");
double radius=sc.nextDouble();
double pie=3.14285714286;
double area=4*pie*Math.pow(radius, 2.0);
System.out.println("Area of sphere: "+area);
}
}
