package homework;

public class DeiverseArray {

	public static void main(String[] args) {

		}
	public static int arraySum(int[] arr) 
	{
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
	public static int[] rowSums(int[][] arr2D) {
		int total = 0;
		int[] x = new int[arr2D.length];
		for(int i = 0; i < arr2D.length; i++) {
			total = arraySum(arr2D[i]);
			x[i] = total;
		}
		return x;
	}
	public static boolean isDiverse(int[][] arr2D) {
		int[] x = rowSums(arr2D);
		for(int i = 0; i < x.length; i++) {
			for(int r = i+1; r < x.length; r++) {
				if(x[i] == x[r]) {
					return false;
				}
			}
		}
		return true;
	}
}
