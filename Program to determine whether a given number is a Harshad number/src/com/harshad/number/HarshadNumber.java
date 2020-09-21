package com.harshad.number;

import java.util.Scanner;

public class HarshadNumber {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int sum=0,rem=0,n;
n=num;
while(num > 0)
{
rem=num % 10;
sum +=rem;
num /=10;
}
if(n%sum == 0)  
System.out.println(n + " is a harshad number");  
else  
System.out.println(n + " is not a harshad number");  
}

}
