package pract;

import java.util.Random;
import java.util.Scanner;

public class Practise16 {

	public static void main(String[] args) {
	
		// generate random numbers for a given range
		
		try {
			Scanner sc=new Scanner(System.in);
		    int range=sc.nextInt();
		    
		    Random ran=new Random();
		    
		    for(int i=0;i<10;i++) {
		    	
		    	System.out.println(ran.nextInt(range));
		    }
			
		}catch (Exception e) {
	         e.printStackTrace();
		}
	}
	}