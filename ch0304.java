package ch03;

import java.util.Scanner;

public class ch0304 {
	public static void main(String[] args) {
		int big;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요.");
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰수 : " + big);
		
		sc.close();
		
	}
}
