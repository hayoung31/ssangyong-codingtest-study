
import java.util.*;
import java.io.*;

  public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int[9]; // 아홉명의 난쟁이니까 9로 배열의 크기지정
		int sum = 0;
		int fake1 = 0;
		int fake2 = 0;
		
		for(int i=0; i<arr.length; i++) {// 배열의 수만큼 돌려서 배열의 모든 합을 구한다
			arr[i]=Integer.parseInt(br.readLine());
			sum += arr[i];
		}// 모든 배열의 합을 구한다
		Arrays.sort(arr);// 배열을 오름차순으로 정렬
		 
		//배열을 배열의 수만큼 돌리면서 두수가 빠지면 합이 되는 순간에 for문을 중지
		//그때의 수를 fake1,fake2에 각각저장
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					fake1 = arr[i];
					fake2 = arr[j];
					break;
				}
			}
		}
		//배열을 수만큼 돌리면서 fake1 과 fake2 같은 수가 나오면 그 수를 보여주는 for문
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == fake1 || arr[i] == fake2)
			continue;// 수를 찾아낼때만 cotinue를 지나서 그 수를 출력 같지않으면 다시 for을 돌림
			
			System.out.println(arr[i]);
		}
	
	}//end of main()-----------------

}
