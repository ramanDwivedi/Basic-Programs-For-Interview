package com.uppertriangular;
import java.util.Scanner;
public class UpperTriangularMatrix {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows in matrix");
int row=sc.nextInt();
System.out.println("Enter the column number of matrix");
int col=sc.nextInt();
int mat[][]=new int[row][col];
System.out.println("Enter the matrix elements");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
mat[i][j]=sc.nextInt();
}
}
System.out.println("Matrix Elements are:");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat[i][j]+" ");	
}
System.out.println();
}
System.out.println("Upper triangular matrix is:");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++) {
if(i>j)
System.out.print("0 ");
else
System.out.print(mat[i][j]+" ");	
}
System.out.println();
}
}
}
