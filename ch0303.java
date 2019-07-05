package ch03;

import java.util.Scanner;

public class ch0303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%d 나누기 %d의 몫은 %d 입니다. \n", num1, num2, num1/num2);
		System.out.printf("%d 나누기 %d의 나머지는 %d 입니다.", num1, num2, num1%num2);
		
		sc.close();

	}

}
