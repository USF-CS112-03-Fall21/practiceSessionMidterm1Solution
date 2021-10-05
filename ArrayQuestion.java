import java.util.*;

public class ArrayQuestion {

	public static int[] sumElems (int[] arr, int num) {
		int[] result = new int[2];
		// FILL IN CODE	
		int sum1 = 0;
		int sum2 = 0;
		for (int a: arr) {
			if (a > num)
				sum1 += a;
			else
				sum2 += a;	
		}
		result[0] = sum1;
		result[1] = sum2;

		return result;
	}



	public static void main(String[] args) {
		int[] arr = {10, 3, 8, 5, 7, 2, 1};
		int[] res = sumElems(arr, 6);
		System.out.println(res[0] + " " + res[1]);

		
	}

}