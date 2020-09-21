package com.disariumnumber;
import java.util.Scanner;
import java.util.regex.Matcher;
public class DisariumNumber {
// Method to check whether a number is disarium or not 
public static boolean check(int n) 
{ 
// Count digits in n. 
int count_digits = Integer.toString(n).length(); 
// Compute sum of terms like digit multiplied by 
// power of position 
int sum = 0; // Initialize sum of terms 
int x = n; 
while (x > 0) 
{ 
// Get the rightmost digit 
int r = x%10; 
// Sum the digits by powering according to 
// the positions 
sum = (int) (sum + Math.pow(r, count_digits--)); 
x = x/10; 
} 
// If sum is same as number, then number is 
return (sum == n); 
} 
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
System.out.println(check(num) ? "Disarium Number" : "Not a Disarium Number"); 
}

}
