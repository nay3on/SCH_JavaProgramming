package week6;

import java.util.InputMismatchException;
import java.util.Scanner;

class Player {
	String name; // 게임 참가자 이름 필드
	String word; // 게임 참가자가 말한 단어 필드
	
	void getWord() { // 사용자로부터 단어 받는 메소드
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(name + ">>");
		String word = scanner.next(); // 사용자로부터 단어 입력 받기
		
		this.word = word;
	}
	
	boolean check(String lastWord) { // lastWord(앞 순서 단어)와 게임 참가자가 말한 word를 비교하여 끝말잇기에 성공했는지 판단하는 메소드
		int lastIndex = lastWord.length() - 1; // 단어에서 lastWord의 마지막 글자의 위치
		char last_letter = lastWord.charAt(lastIndex); // lastWord의 마지막 글자
		char first_letter = word.charAt(0); // word의 첫 글자
		
		if(last_letter == first_letter) // lastWord의 마지막 글자와 word의 첫 글자가 일치하는지 확인
			return true; // 끝말잇기에 성공한 경우
		else 
			return false; // 끝말잇기에 실패한 경우
	}
}


public class WordGameApp {
	static Scanner scanner = new Scanner(System.in);
	
	public static void game() { // 게임을 진행하는 메소드
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int n = scanner.nextInt(); // 사용자로부터 게임 참가자 수 입력 받기
		
		Player[] player = new Player[n]; // Player 객체를 게임 참가자 수(n) 만큼 배열로 생성
		
		for(int i=0; i<n; i++) { // 게임 참가자 수 만큼 이름 입력 받기
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			player[i] = new Player();
			player[i].name = name;
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		
		String lastWord = "아버지"; // 처음 제시된 단어
		int i = 0;
		
		while(true) {
			player[i].getWord(); // 사용자로부터 단어 받아오는 메소드 실행
			
			if(!(player[i].check(lastWord))) { // 끝말잇기 성공 여부 판단 메소드 실행 -> 끝말잇기에 실패한 경우(false인 경우)
				System.out.println(player[i].name + "이(가) 졌습니다.");
				System.exit(0); // 게임 종료
			}
			
			lastWord = player[i].word; // 입력 받은 단어를 lastWord(끝말잇기 성공 판별을 위한 최근 단어)로 저장)
			
			i++; // 다음 게임 참가자 순서
			if(i == n) { // 게임 참가자들이 끝말잇기를 한 바퀴 돌면 순서대로 다시 돌기
				i = 0;	
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		
		while(true) { // 끝말잇기에 실패할 때까지 계속 진행
			try {
				game(); // 게임 진행 메소드 실행
			}
			catch(InputMismatchException e) { // 게임 참가자 수 입력 값이 정수가 아닌 경우 예외 처리
				System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
				scanner.nextLine(); // 잘못 입력됐던 값 지우기
				continue; // 다시 게임 진행
			}
			catch(Exception e) {
				System.out.println("잘못된 입력입니다. 게임을 다시 시작합니다."); // 그 외 예외 처리
				scanner.nextLine(); // 잘못 입력됐던 값 지우기
				continue; // 다시 게임 진행
			}
		}
	}
}
