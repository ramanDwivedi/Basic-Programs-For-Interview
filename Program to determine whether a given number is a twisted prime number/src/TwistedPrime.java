import java.util.Scanner;

public class TwistedPrime {
public static boolean isPrime(int num)
{
boolean flag=true;	
if(num<=1)
flag=false;	
for(int i=2;i<num;i++)
{
if(num % i==0)
flag=false;
}
return flag;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  number");
int num=sc.nextInt();
if(isPrime(num))
{
String stnum=(new StringBuffer(Integer.toString(num)).reverse().toString());
int rev=Integer.valueOf(stnum);
if(isPrime(rev))
System.out.println("Given number is twisted prime");
else
System.out.println("Given number is prime but not twisted prime");	
}
else
System.out.println("Given number is neither prime nor twisted prime");	
	
}
}
