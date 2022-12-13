package matrix_transpose;


import java.util.Scanner;


public class Matrix_transpose {

    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("inter the num of rows");
		int rows=sc.nextInt();
		System.out.println("inter the num of columns");
		int columns =sc.nextInt();
		int matrix[][]=new int [rows][columns];
		System.out.println("inter the matrix items");
		for (int i=0;i<rows;i++)
		{
		    for(int j=0;j<columns;j++)
		    {
		        matrix[i][j]=sc.nextInt();
		    }
		}
		for (int i=0;i<rows;i++)
		{
		    for(int j=0;j<columns;j++)
		    {
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("The transpose matrix");
		for (int i=0;i<columns;i++)
		{
		    for(int j=0;j<rows;j++)
		    {
		        System.out.print(matrix[j][i]+" ");
		    }
		    System.out.println();
		}
		
	}
    
}
