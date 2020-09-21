package com.cgpa;
import java.util.Scanner;
public class CgpaProgram {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double English, Hindi, Maths, Science, SocialStudy,  CGPAper ;  
System.out.println("Enter the marks of the given subjects:");
English=sc.nextDouble();
Hindi=sc.nextDouble();
Maths=sc.nextDouble();
Science=sc.nextDouble();
SocialStudy=sc.nextDouble();
CGPAper=(English+Hindi+Maths+Science+SocialStudy)/(5.0);
System.out.println(CGPAper);
	}

}
