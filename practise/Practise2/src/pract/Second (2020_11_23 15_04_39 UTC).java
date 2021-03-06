package pract;

import java.util.Scanner;

public class Second {
	
	public static boolean isBinaryNumber(long binary) {
		
		while(binary>0) {
			
			if(binary%10>1) {
				return false;
			}
			binary/=10;
		}
		return true;
	}
	
	public static long binaryToDecimal(long binary) {
		
		long rem=0,i=0,dec=0;
		while(binary>0) {
			
			rem=binary%10;
			dec=dec+(long)(rem*(Math.pow(2, i)));
			binary/=10;
			i++;
		}
		return dec;
	}
	
	public static void main(String[] args) {
		
		//binary to decimal no.
		
		System.out.println("enter binary number");
		
		Scanner sc=new Scanner(System.in);
		long binary=sc.nextInt();
		
		if(isBinaryNumber(binary)) {
			System.out.println("decimal no. "+binaryToDecimal(binary));
		}
	}
}