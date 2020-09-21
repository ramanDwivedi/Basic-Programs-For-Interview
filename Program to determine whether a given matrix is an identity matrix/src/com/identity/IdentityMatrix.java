package com.identity;
import java.util.Scanner;
public class IdentityMatrix {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
boolean flag=true;
System.out.println("Enter the number of row in matrix");
int row=sc.nextInt();
System.out.println("Enter the number of column in matrix");
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
System.out.println("Matrix elements are:");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat[i][j]+"  ");
}
System.out.println();
}


if(row != col){  
System.out.println("Matrix should be a square matrix");  
} 
else {  
//Checks if diagonal elements are equal to 1 and rest of elements are 0  
for(int i = 0; i < row; i++){  
for(int j = 0; j < col; j++){  
if(i == j && mat[i][j] != 1){  
flag = false;  
break;  
}  
else if(i != j && mat[i][j] != 0){  
flag = false;  
break;  
}  
}  
}  
if(flag)  
System.out.println("Given matrix is an identity matrix");  
else  
System.out.println("Given matrix is not an identity matrix");  
}  
}
}
