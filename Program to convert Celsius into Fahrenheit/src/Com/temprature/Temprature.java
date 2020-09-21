package Com.temprature;
import java.util.Scanner;
public class Temprature {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temprature in celsius:");
float Celsius=sc.nextFloat();  
float Fahrenheit =((Celsius*9)/5)+32;  
System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
}
}
