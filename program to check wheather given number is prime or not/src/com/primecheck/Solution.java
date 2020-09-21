package com.primecheck;
import java.util.Scanner;

public class Solution {
static boolean isPrime(int n)
{
boolean flag=true;
if(n <=1)
flag=false;	
for(int i=2;i<=n-1;i++)
if(n % i==0)
flag=false;
return flag;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
if(isPrime(num))
System.out.println("number is prime");
else
System.out.println("Number is not prime");	
}
}
