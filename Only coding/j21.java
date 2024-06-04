import java.util.*;
import java.io.*;
//matrix multiplication program of any size.
public class j21 {
  static int[][] matrixmultiplication(int r1,int c1,int[][] a1,int r2,int c2,int[][] a2)
  {    
    int re[][] = new int[r1][c2];
    int i,j,o;       
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c2;j++)
      {
        for(o=0;o<r2;o++)
        {
          re[i][j]+=a1[i][o]*a2[o][j];
        }
      }
    }
    return re;
  }
    public static void main(String[] args)throws IOException{
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the row and column values: ");
         int r1=s.nextInt();
         int c1=s.nextInt();
         int[][] a1=new int[r1][c1];
         System.out.println("Enter the matrix1 elements:");
         for(int i=0;i<r1;i++)
         {
            for(int j=0;j<c1;j++)
            {
              a1[i][j]=s.nextInt();
            }
         }
         System.out.println("Enter the row and column values: ");
         int r2=s.nextInt();
         int c2=s.nextInt();
         int[][] a2=new int[r2][c2];
         System.out.println("Enter the matrix2 elements:");
         for(int i=0;i<r2;i++)
         {
            for(int j=0;j<c2;j++)
            {
              a2[i][j]=s.nextInt();
            }
         }
         int[][] a = matrixmultiplication(r1,c1,a1,r2,c2,a2);
         System.out.println("Multiplied matrix is: ");
         for(int w=0;w<r1;w++)
         {
            for(int g=0;g<c2;g++)
            {
              System.out.print(a[w][g]+" ");
            }
            System.out.println();
         }  
          s.close();
    }
    
}
