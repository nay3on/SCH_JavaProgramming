package week6;

import java.util.Scanner;

class Player {
	
}

public class WordGameApp {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		
		System.out.print("게임에 참가하는 사람은 몇명입니까>>");
		int n = scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			
		}
		

	}
}
