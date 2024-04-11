package week4;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Java_Week4_Quiz2 {
	public static void main (String[]args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("두 행렬의 크기>>");
		
		int Row_A = scanner.nextInt();
		int Col_A = scanner.nextInt();
		int Row_B = scanner.nextInt();
		int Col_B = scanner.nextInt();

		int [][] array_A = new int[Row_A][Col_A];
		int [][] array_B = new int[Row_B][Col_B];
		
		int a = 0; // 배열의 범위를 벗어난 경우 나중에 문장을 출력할 때 쓰기 위한 값
		
		
		try {	
			int [][] array_add = new int[Row_A][Col_A];
			int [][] array_sub = new int[Row_A][Col_A];
			int [][] array_mul = new int[Row_A][Col_A];
			
			for(int i=0; i < Row_A; i++) {
				
				for(int j=0; j < Col_A; j++) {
					array_add[i][j] = array_A[i][j] + array_B[i][j];
				}
			}
			
			for(int i=0; i < Row_A; i++) {
				
				for(int j=0; j < Col_A; j++) {
					array_sub[i][j] = array_A[i][j] - array_B[i][j];
				}
			}
			
			for(int i=0; i < Row_A; i++) {
				
				for(int j=0; j < Col_A; j++) {
					array_mul[i][j] = array_A[i][j] * array_B[i][j];
				}
			}
			
		}
		
		
		catch (InputMismatchException e) {
			System.out.println("정수를 입력해주십시오.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
				a = 1;
		}
		
		
		finally {
			System.out.println("-- A 행렬 --");
			for (int i=0; i < Row_A; i++) {
				for (int j=0; j < Col_A; j++) {
					
					int r = (int)Math.round(Math.random()*10); // 0~10 범위의 랜덤 숫자를 저장
					
					array_A[i][j] = r;
					
					if (r < 10) {
						System.out.print("0" + array_A[i][j] + " ");
					}
					else {
						System.out.print(array_A[i][j] + " ");
					}
				}
				System.out.println();
			}
			
			System.out.println("-- B 행렬 --");
			for (int i=0; i < Row_B; i++) {
				for (int j=0; j < Col_B; j++) {
					
					int r = (int)Math.round(Math.random()*10);
					
					array_B[i][j] = r;
					
					if (r < 10) {
						System.out.print("0" + array_B[i][j] + " ");
					}
					else {
						System.out.print(array_B[i][j] + " ");
					}
				}
				System.out.println();
			}
			
		}
		
		if (Row_A == Row_B && Col_A == Col_B) {
			
				int [][] array_add = new int[Row_A][Col_A];
				int [][] array_sub = new int[Row_A][Col_A];
				int [][] array_mul = new int[Row_A][Col_A];
				
				System.out.println("-- A+B --");
				
			for(int i=0; i < Row_A; i++) {
				
				for(int j=0; j < Col_A; j++) {
					array_add[i][j] = array_A[i][j] + array_B[i][j];
					
					if (array_add[i][j] < 10) {
						System.out.print("0" + array_add[i][j] + " ");
					}
					else {
						System.out.print(array_add[i][j] + " ");
					}
				}
			System.out.println();
		
			}
			
			System.out.println("-- A-B --");
			
			for(int i=0; i < Row_A; i++) {
				
				for(int j=0; j < Col_A; j++) {
					array_sub[i][j] = array_A[i][j] - array_B[i][j];
					
					if (array_sub[i][j] >= 0 && array_sub[i][j] < 10) {
						System.out.print("0" + array_sub[i][j] + " ");
					}
					else {
						System.out.print(array_sub[i][j] + " ");
					}
				}
			System.out.println();
		
			}
			
				System.out.println("-- A*B --");
				
			for(int i=0; i < Row_A; i++) {
				
				for(int j=0; j < Col_A; j++) {
					array_mul[i][j] = array_A[i][j] * array_B[i][j];
					
					if (array_mul[i][j] < 10) {
						System.out.print("0" + array_mul[i][j] + " ");
					}
					else {
						System.out.print(array_mul[i][j] + " ");
				}
			}
			System.out.println();
		
			}
			
		}
		
		
		if (a==1 || Row_A != Row_B || Col_A != Col_B) {
			System.out.println("두 행렬의 크기가 서로 다르므로 계산할 수 없습니다.");
		}

		
		scanner.close();
	}
}
