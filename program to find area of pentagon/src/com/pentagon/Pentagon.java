package com.pentagon;

import java.util.Scanner;

public class Pentagon {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of pentagon:");
int s=sc.nextInt();
System.out.println("Enter the apothem of pentagon:");
int a=sc.nextInt();
float area=(float)(5.0/2.0)*s*a;
System.out.println("Area of pentagon: "+area);
}
}
