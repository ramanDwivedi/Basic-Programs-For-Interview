package com.square;
import java.util.Scanner;
public class Square {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the Side of square:");
int side=sc.nextInt();
int volume=side*side*side;
System.out.println("Volume of square: "+volume);
}
}
