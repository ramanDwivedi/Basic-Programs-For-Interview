package com.frequency;

import java.util.Scanner;

public class FrequencyCheck {
public static void main(String[] args) {
int evenCount=0,oddCount=0;	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows in matrix");
int rows=sc.nextInt();
System.out.println("Enter the number of column in matrix");
int cols=sc.nextInt();
int mat[][]=new int[rows][cols];
System.out.println("Enter the elements of matrix");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)	
{
mat[i][j]=sc.nextInt();	
}
}
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)	
{
if(mat[i][j] % 2==0)
evenCount++;
else
oddCount++;	
}
}
System.out.println("Even elements of the matrix is:"+evenCount);
System.out.println("Odd elements of the matrix is:"+oddCount);
}
}
