package com.cuboid;
import java.util.Scanner;
public class Cuboid {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Length of cuboid:");
float l=sc.nextFloat();
System.out.println("Enter the Breadth of cuboid:");
float b=sc.nextFloat();
System.out.println("Enter the Height of cuboid:");
float h=sc.nextFloat();
float surfaceArea=2*(l*b+b*h+h*l);
System.out.println("Surface area of cuboid:"+surfaceArea);



	}

}
