package week2;

import java.util.Scanner;

public class Java_Week2_Quiz1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하십시오>>");
		
		int money = scanner.nextInt(); // 정수로 금액 입력 받기
		
		
		int how_many_50000 = money / 50000;
		// 전체 금액에서 50000으로 나눈 몫은 오만원권의 개수
		
		int how_many_10000 = (money - 50000*how_many_50000) / 10000;
		// 전체 금액에서 오만원권으로 교환 가능한 금액을 뺀 나머지를 10000으로 나눈 몫은 만원권의 개수
		
		int how_many_1000 = (money - 50000*how_many_50000 - 10000*how_many_10000) / 1000;
		// 전체 금액에서 오만원권,만원권으로 교환 가능한 금액을 뺀 나머지를 10000으로 나눈 몫은 천원권의 개수
		
		int how_many_500 = (money - 50000*how_many_50000 - 10000*how_many_10000 - 1000*how_many_1000) / 500;
		// 전체 금액에서 오만원권,만원권,천원권으로 교환 가능한 금액을 뺀 나머지를 10000으로 나눈 몫은 오백원의 개수
		
		int how_many_100 = (money - 50000*how_many_50000 - 10000*how_many_10000 - 1000*how_many_1000 - 500*how_many_500) / 100;
		// 전체 금액에서 오만원권,만원권,천원권,오백원으로 교환 가능한 금액을 뺀 나머지를 10000으로 나눈 몫은 백원의 개수
		
		int how_many_50 = (money - 50000*how_many_50000 - 10000*how_many_10000 - 1000*how_many_1000 - 500*how_many_500 - 100*how_many_100) / 50;
		// 전체 금액에서 오만원권,만원권,천원권,오백원,백원으로 교환 가능한 금액을 뺀 나머지를 10000으로 나눈 몫은 오십원의 개수
		
		int how_many_10 = (money - 50000*how_many_50000 - 10000*how_many_10000 - 1000*how_many_1000 - 500*how_many_500 - 100*how_many_100 - 50*how_many_50) / 10;
		// 전체 금액에서 오만원권,만원권,천원권,오백원,백원,오십원으로 교환 가능한 금액을 뺀 나머지를 10000으로 나눈 몫은 십원의 개수
		
		int how_many_1 = (money - 50000*how_many_50000 - 10000*how_many_10000 - 1000*how_many_1000 - 500*how_many_500 - 100*how_many_100 - 50*how_many_50 - 10*how_many_10) / 1;
		// 전체 금액에서 오만원권,만원권,천원권,오백원,백원,오십원,십원으로 교환 가능한 금액을 뺀 나머지를 10000으로 나눈 몫은 일원의 개수
		
		
		System.out.println("오만원권 " + how_many_50000 + "매");
		System.out.println("만원권 " + how_many_10000 + "매");
		System.out.println("천원권 " + how_many_1000 + "매");
		System.out.println("오백원 " + how_many_500 + "개");
		System.out.println("백원 " + how_many_100 + "개");
		System.out.println("오십원 " + how_many_50 + "개");
		System.out.println("십원 " + how_many_10 + "개");
		System.out.println("일원 " + how_many_1 + "개");
		
		scanner.close(); // scanner 닫기
	}
}
