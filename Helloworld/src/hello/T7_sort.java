package hello;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T7_sort {

	public static void main(String[] args) {

		
//		어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 
//
//		6을 예로 들면
//
//		6 ÷ 1 = 6 … 0
//		6 ÷ 2 = 3 … 0
//		6 ÷ 3 = 2 … 0
//		6 ÷ 4 = 1 … 2
//		6 ÷ 5 = 1 … 1
//		6 ÷ 6 = 1 … 0
//		그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
//
//		두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
//		첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자연수 N >> ");
		int N=scan.nextInt();
		System.out.print("자연수 K >> ");
		int K=scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				list.add(i);
			}
		}
		
		if(list.size()>=K) {
			System.out.println(list.get(K-1));
		}else {
			System.out.println(0);
		}
		
		System.out.println(list);
		
	}
}
