package count;

import java.util.Scanner;

public class digitscount {
	int i=0,n;
	digitscount(int num){
		n=num;
		while(n!= 0) {
			i++;
			n=n/10;
		}
		System.out.println(i);
	}
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		digitscount digit = new digitscount(num);
		
	}
}