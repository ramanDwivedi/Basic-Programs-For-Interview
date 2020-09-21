package com.DisariumNumbers;
public class DisariumNumbers {
public static boolean Disarium(int n)
{
int no_digit=Integer.toString(n).length();
int x=n;
int sum=0;
while(x > 0)
{
int r=x % 10;
sum +=(int)Math.pow(r, no_digit--);
x /=10;
}
return (sum==n);
}
public static void main(String[] args) {
int result = 0;  
//Displays all disarium numbers between 1 and 100  
System.out.println("Disarium numbers between 1 and 100 are");  
for(int i = 1; i <= 100; i++){  
if(Disarium(i))  
System.out.print(i + " ");  
}  
}
}
