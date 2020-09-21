package com.square;
import java.util.Scanner;
public class Square {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of square:");
int side=sc.nextInt();
int area=side*side;
System.out.println("Area of square: "+area);
}
}
