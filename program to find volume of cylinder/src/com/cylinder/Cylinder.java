package com.cylinder;
import java.util.Scanner;
public class Cylinder {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the cylinder:");
int radius=sc.nextInt();
System.out.println("Enter the height of radius:");
int height=sc.nextInt();
double pie=3.14285714286;
double volume=pie*radius*radius*height;
System.out.println("Volume of the cylinder: "+volume);
}
}
