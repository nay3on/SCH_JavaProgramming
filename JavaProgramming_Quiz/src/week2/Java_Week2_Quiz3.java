package week2;

import java.util.Scanner;

public class Java_Week2_Quiz3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사칙 연산을 입력하십시오 (ex. 1 + 2) >>"); // 예시처럼 사칙 연산 입력 받기
		
		double number1 = scanner.nextDouble(); // 실수 읽기
		String oper = scanner.next(); // 문자열로 연산자 읽기
		double number2 = scanner.nextDouble(); // 실수 읽기

		
		if(oper.equals("/") & number2 == 0){ // 0으로 나누는 경우: 0으로는 나눌 수 없다
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		else {
			if(oper.equals("+")){ // 연산자가 더하기인 경우
				System.out.println(number1 + number2);
			}
			else if(oper.equals("-")){ // 연산자가 빼기인 경우
				System.out.println(number1 - number2);
			}
			else if(oper.equals("*")){ // 연산자가 곱하기인 경우
				System.out.println(number1 * number2);
			}
			else if(oper.equals("/")){ // 연산자가 나누기인 경우
				System.out.println(number1 / number2);
			}
		}
		scanner.close(); // scanner 닫기
	}
}