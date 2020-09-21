package com.matrixsum;

import java.util.Scanner;

public class MatrixSum {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows in matrixes");
int row=sc.nextInt();
System.out.println("Enter the number of column of matrixes");
int col=sc.nextInt();
int mat1[][]=new int[row][col];
int mat2 [][]=new int[row][col];
System.out.println("Enter the elements of first matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
mat1[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements of second matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
mat2[i][j]=sc.nextInt();
}
}
System.out.println("Elements of the first matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat1[i][j]+" ");	
}
System.out.println();
}
System.out.println();
System.out.println("Elements of the second matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat2[i][j]+" ");	
}
System.out.println();
}
System.out.println();
int sum[][]=new int[row][col];
System.out.println("Sum of the matrixes");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
sum[i][j]=mat1[i][j]+mat2[i][j];
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
}
