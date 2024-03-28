package week3;

import java.util.Scanner;

public class Java_Week3_Quiz1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("양수 a, b를 입력하십시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sum = 0; // 1부터 b까지의 수 중에서 a배수의 총합을 저장할 변수
		
		for(int i = 0; i < b; i++) { // 1부터 b까지의 a배수를 확인하는 반복문
			
			try {
			
			if((i % a) == 0) { // a의 배수인 경우
				
				/*
				System.out.println(i + " "); // 1부터 b까지의 수 중에서 a의 배수 확인용
				*/
				sum += i;
				continue;
				}
			
			} catch(ArithmeticException e) { // a를 0으로 입력 받았을 때 0으로 나눌 수 없는 경우 예외 처리
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
		}
		
		if(a<=0 || b<=0) { // 입력 받은 a나 b가 양수가 아닌 경우
			System.out.println("입력된 수는 양수가 아닙니다.");
		}
		else {
			System.out.println("1부터 " + b + "까지의 수 중 " + a + "배수의 합은 " + sum + "입니다.");
		}
		
		scanner.close();
	}
}
