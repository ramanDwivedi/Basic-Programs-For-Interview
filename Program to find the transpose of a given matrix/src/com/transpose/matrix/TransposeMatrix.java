package com.transpose.matrix;
import java.util.Scanner;
public class TransposeMatrix {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row in the matrix matrix");
int row=sc.nextInt();
System.out.println("Enter the number of column in the matrix");
int col=sc.nextInt();
int mat[][]=new int[row][col];
System.out.println("Enter the elements of the matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{	
mat[i][j]=sc.nextInt();
}
}
int trans[][]=new int[col][row];
for(int i = 0; i < col; i++){  
for(int j = 0; j < row; j++){  
//Converts the row of original matrix into column of transposed matrix  
trans[i][j] = mat[j][i];  
}  
} 
System.out.println("Matrix elements: ");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat[i][j]+" ");	
}
System.out.println();
}
System.out.println("Transpose of given matrix: ");  
for(int i = 0; i < col; i++){  
for(int j = 0; j < row; j++){  
System.out.print(trans[i][j] + " ");  
}  
System.out.println();  
}  
}
}

