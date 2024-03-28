package week3;

import java.util.Scanner;

public class Java_Week3_Quiz3 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String course [] = { "java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = { 95, 88, 76, 62, 55 };
		
		String CourseName;
		int i = 0;
			
		while(true) {
			
			System.out.print("과목 이름>>"); // 과목 이름 입력 받기
			CourseName = scanner.next();
			
			if(CourseName.equals("그만")) { // "그만"을 입력 받으면 종료
				break;
			}
			
			for(i=0; i<course.length; i++) { // 배열 내에 입력한 과목이 존재하는지 확인
				
				if(CourseName.equals(course[i])) { // 입력한 과목 이름과 일치하는 과목을 발견한 경우
					System.out.println(course[i] + "의 점수는 " + score[i] + "입니다.");
					break;
					}
				}
			
			if(i == course.length) { // 배열을 끝까지 확인했는데 입력한 과목 이름과 일치하는 과목이 없는 경우
				System.out.println("없는 과목입니다.");
				}

			}
		
		scanner.close();
	}
}
