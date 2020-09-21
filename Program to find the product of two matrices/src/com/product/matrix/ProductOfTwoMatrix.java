package com.product.matrix;
import java.util.Scanner;
public class ProductOfTwoMatrix {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of row in the first matrix");
int row1=sc.nextInt();
System.out.println("Enter the column of the first matrix");
int col1=sc.nextInt();
int mat1[][]=new int[row1][col1];
System.out.println("Enter the number of row in the second matrix");
int row2=sc.nextInt();
System.out.println("Enter the column of the second matrix");
int col2=sc.nextInt();
int mat2[][]=new int[row2][col2];
System.out.println("enter the elements of first matrix");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
mat1[i][j]=sc.nextInt();	
}
}
System.out.println("enter the elements of second matrix");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
{
mat2[i][j]=sc.nextInt();	
}
}
System.out.println("Elements of first matrix:");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
System.out.print(mat1[i][j]+" ");	
}
System.out.println();
}
System.out.println("Elements of second matrix:");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
{
System.out.print(mat2[i][j]+" ");	
}
System.out.println();
}
if(col1==row2)
{  
//Array prod will hold the result  
int prod[][] = new int[row1][col2]; 
//Performs product of matrices a and b. Store the result in matrix prod  
for(int i = 0; i < row1; i++){  
for(int j = 0; j < col2; j++){  
for(int k = 0; k < row2; k++){  
prod[i][j] = prod[i][j] + mat1[i][k] * mat2[k][j];   
      }  
    }  
}  
System.out.println("Product of two matrices: ");  
for(int i = 0; i < row1; i++){  
for(int j = 0; j < col2; j++){  
System.out.print(prod[i][j] + " ");  
}  
System.out.println();  
}  
}
else
{  
System.out.println("Matrices cannot be multiplied");  
}  

}
}
