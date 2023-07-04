package day06;

public class 복습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a = {12, 3, 4, 5, 34};
//		
//		for(int i=0; i<a.length; i++) {
//			if(i == a.length-1) {
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.print(a[i]+", ");
//		}

//		int[] b = new int[10];
////		b[3] = 5;
//		// b배열에 1~10까지 값을 넣으시오
//		for (int i = 0; i <= b.length; i++) {
//			b[i] = i+1;
//		}

//		int[] c = { 1, 4, 5, 6, 7 }; // 23
//		// c배열의 합 출력
//		int sum = 0;
//		for (int i = 0; i < c.length; i++) {
//			sum += c[i];
//		}
//		System.out.println(sum);

//		int[] d = { 1, 4, 5, 6, 7 };
//		// d[0]에 모든 값 누적 : 23
//		for (int i = 1; i < d.length; i++) {
//			d[0] += d[i];
//		} 
//			System.out.println(d[0]);
//
//		

		int[] e = { 1, 4, 5, 6, 7 };
		// 한 칸 씩 앞당기기
		// e = {4, 5, 6, 7, 1};
		int s = e[0];
		for (int i = 1; i < e.length; i++) {

			e[i - 1] = e[i];
			if (i == e.length - 1) {
				e[i] = s;
			}
		}
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		System.out.println(e[3]);
		System.out.println(e[4]);
	}

}
