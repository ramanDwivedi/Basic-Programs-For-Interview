package com.happynumber;
import java.util.Scanner;
public class HappyNumber {
//isHappyNumber() will determine whether a number is happy or not  
public static void isHappyNumber(int num){  
int rem = 0, sum = 0;  
//Calculates the sum of squares of digits  
while(num > 0){  
rem = num%10;  
sum = sum + (rem*rem);  
num = num/10;  
} 
if(sum > 9)
isHappyNumber(sum);
else if(sum==1)
System.out.println("Happy number");
else
System.out.println("Not happy number");	
}  
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
isHappyNumber(num);

}
}
