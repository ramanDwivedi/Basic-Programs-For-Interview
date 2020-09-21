package com.simpleinterest;
import java.util.Scanner;
public class SimpleInterest {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value of amout time and rate:");
float p=sc.nextFloat();
float r=sc.nextFloat();
float t=sc.nextFloat();
float si=(p*r*t)/100;
System.out.println("Simple interst is: "+si);
}
}
