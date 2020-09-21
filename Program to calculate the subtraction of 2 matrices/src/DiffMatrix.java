import java.util.Scanner;
public class DiffMatrix {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row in matrix");
int row=sc.nextInt();
System.out.println("Enter the number of column");
int col=sc.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
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
System.out.println("Elements of first matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat1[i][j]+" ");	
}
System.out.println();
}
System.out.println("Elements of second matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(mat2[i][j]+" ");	
}
System.out.println();
}
int diff[][]=new int[row][col];
System.out.println("Difference of the elements of mat1 and mat2");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
diff[i][j]=mat1[i][j]-mat2[i][j];
System.out.print(diff[i][j]+" ");
}
System.out.println();
}

}

}
