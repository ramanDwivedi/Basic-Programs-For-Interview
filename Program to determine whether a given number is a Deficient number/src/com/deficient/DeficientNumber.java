package com.deficient;
import java.util.Scanner;
public class DeficientNumber {
// Function to calculate sum of divisors 
static int divisorsSum(int n) 
{ 
int sum = 0; // Initialize sum of prime factors 
// Note that this loop runs till square root of n 
for (int i = 1; i <= (Math.sqrt(n)); i++) { 
if (n % i == 0) { 
// If divisors are equal, take only one 
// of them 
if (n / i == i) 
{ 
sum = sum + i; 
} 
else // Otherwise take both 
{ 
sum = sum + i; 
sum = sum + (n / i); 
} 
} 
} 
return sum; 
} 
// Function to check Deficient Number 
static boolean isDeficient(int n) 
{ 
// Check if sum(n) < 2 * n 
return (divisorsSum(n) < (2 * n)); 
} 
public static void main(String[] args) {
System.out.println("Enter the number?");  
Scanner sc = new Scanner(System.in);   
int n = sc.nextInt();  
if (isDeficient(n))   
System.out.println("The number is deficient.");   
else  
System.out.println("The number is not deficient");    
}
}
