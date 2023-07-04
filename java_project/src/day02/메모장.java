package day02;

import java.util.Scanner;

public class 메모장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=====성적표=====");
			System.out.print("국어> ");
			int kor = sc.nextInt();
			System.out.print("영어> ");
			int eng = sc.nextInt();
			System.out.print("수학> ");
			int mat = sc.nextInt();
			
			int sum = kor+eng+mat;
			int avg = sum/3;
			String grd = " ";
			
			if(avg >= 90) {
				grd = "A";
			} else if(avg >= 80) {
				grd = "B";
			} else if(avg >= 70) {
				grd = "C";
			} else if(avg >= 60) {
				e
			}
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
