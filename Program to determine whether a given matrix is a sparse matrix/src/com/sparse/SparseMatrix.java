package com.sparse;

import java.util.Scanner;

public class SparseMatrix {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row of the matrix");
int row=sc.nextInt();
System.out.println("Enter the column of the matrix");
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
System.out.println("Matrix elements:");
System.out.println();
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat[i][j]+" ");	
}
System.out.println();
}
System.out.println();
int count=0;
int size=row*col;
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
if(mat[i][j]==0)
count++;	
}
}
if(count>(size/2))
System.out.println("Given matrix is sparse");
else
System.out.println("Given matrix is not sparse");	
}

}
