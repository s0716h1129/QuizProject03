package ch03;

import java.util.Scanner;

public class ch0302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.printf("%d * %d = %d", num, num, num*num);
		sc.close();
	}
}
