package com.equal.matrix;

import java.util.Scanner;

public class EqualMatrix {
public static void main(String[] args) {
boolean flag=true;	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row in first matrix");
int row1=sc.nextInt();
System.out.println("Enter the number of column in second matrix");
int col1=sc.nextInt();
int mat1[][]=new int[row1][col1];
System.out.println("Enter the number of row in second matrix");
int row2=sc.nextInt();
System.out.println("Enter the number of column in second list");
int col2=sc.nextInt();
int mat2[][]=new int[row2][col2];
System.out.println("Enter the elements of first matrix");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
mat1[i][j]=sc.nextInt();
}
System.out.println("Enter the elements of the second matrix");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
mat2[i][j]=sc.nextInt();	
}
System.out.println("Elements of first matrix");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
System.out.print(mat1[i][j]+" ");	
}
System.out.println();
}
System.out.println("Elements of second matrix");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
{
System.out.print(mat1[i][j]+" ");	
}
System.out.println();
}
if(row1!=row2 && col1!=col2)
System.out.println("Matrices are not equal");
else
{
for(int i = 0; i < row1; i++){  
for(int j = 0; j < col1; j++){  
if(mat1[i][j] != mat2[i][j]){  
flag = false;  
break;  
}  
}  
}
if(flag)  
System.out.println("Matrices are equal");  
else  
System.out.println("Matrices are not equal");  
}
}
}
