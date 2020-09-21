package com.cone;

import java.util.Scanner;

public class Cone {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the cone:");
int radius=sc.nextInt();
System.out.println("Enter the height of cone:");
int height=sc.nextInt();
double pie=3.14285714286;
double area=(pie*radius*radius*height)/3;
System.out.println("Area of the cone: "+area);

}

}
