package week2;

import java.util.Scanner;

public class Java_Week2_Quiz2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하십시오>>"); // 정수로 삼각형 각 변의 길이 입력
		
		// 삼각형 각 변의 길이 읽기
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a+b>c & a+c>b & b+c>a){ // 삼각형이 성립하는 조건: 두변의 길이의 합이 나머지 한변의 길이보다 커야한다
			System.out.println("삼각형이 됩니다.");
		}
		else { // 삼각형 성립 조건에 맞지 않는 경우
			System.out.println("삼각형이 안됩니다.");
		}
		
		scanner.close(); // scanner 닫기
	}
}