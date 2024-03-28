package week3;

import java.util.Random;
import java.util.Scanner;

public class Java_Week3_Quiz2 {
	public static void main(String[]args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int RandomNum = random.nextInt(10000) % 100; // 0~100 사이의 정수 중 랜덤한 숫자를 1개 생성
		
		/*
		System.out.println("컴퓨터가 생성한 랜덤한 숫자: "+ RandomNum); // 컴퓨터가 생성한 랜덤 숫자 확인용
		*/
		
		System.out.println("0~100 정수를 입력하세요."); // 0~100 정수를 입력하라는 조건 제시
		System.out.print("정수 입력>>");
		int UserNum = scanner.nextInt();
		int sum = 0; // 정수를 입력한 횟수의 합
		int t = 1; // 카운터 변수
		
		while(RandomNum!=UserNum) {
			
			if(RandomNum > UserNum && UserNum > 0 && UserNum < 100) { // 랜덤 숫자가 입력한 숫자보다 작은 경우
				System.out.println("Up");
				sum += t;
				t++;
				System.out.print("정수 입력>>");
				UserNum = scanner.nextInt();
				}
			
			else if(RandomNum < UserNum && UserNum > 0 && UserNum < 100) { // 랜덤 숫자가 입력한 숫자보다 큰 경우
				System.out.println("Down");
				sum += t;
				t++;
				System.out.print("정수 입력>>");
				UserNum = scanner.nextInt();
				}
			
			else {
				System.out.println("0~100 정수가 아닙니다. 다시 입력해주세요."); // 0~100를 벗어난 수를 입력한 경우
				sum += t;
				t++;
				System.out.print("정수 입력>>");
				UserNum = scanner.nextInt();
				}		
			}
		
			if(RandomNum == UserNum) { // 랜덤 숫자가 입력한 숫자와 일치하는 경우
			System.out.print("!!성공!!");
			System.out.print("	(입력횟수: " + t + ")");
			}
			
		scanner.close();;
	}
}
