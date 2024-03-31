package week4;

public class TV {
	
	String brand;
	int year;
	int inch;
	
	public TV(String b, int y, int i) {
		brand = b;
		year = y;
		inch = i;
	}

	public static void main(String[]args) {

		TV myTV = new TV("LG", 2017, 32);
		System.out.println(myTV.brand + "에서 만든 " + myTV.year + "년형 " + myTV.inch + "인치 TV");
	}
}
