package pract;

import java.util.Scanner;

public class Practise17 {

	public static void main(String[] args) {
	
		//addition of two matrics
		
		System.out.println("enter size of matrix");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		
		//enter elements of matrix a 
		System.out.println("enter elements of matrix a");
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				a[i][j]=sc.nextInt();
			}
		}
		//enter elements of matrix b
		System.out.println("enter elements of matrix b");
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix a");
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("matrix b");
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		//c matrix
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("matrix c");
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}
