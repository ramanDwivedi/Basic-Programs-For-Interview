package com.surface;
import java.util.Scanner;
public class SurfaceArea {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of the cube:");
float side=sc.nextFloat();
float area=6*side*side;
System.out.println("Surface area of the triangle: "+area);
}
}
