package homework;

public class ArrayInBetween {
	public static void main(String[] args) {
		double[] x = {1.0, 3.0, 3.0, 7.0, 42.0, 1337.0, 3473.0, 10000.0};
		
		
		System.out.println(between(x, 7.0, 1338.0));
		//System.out.println(between(x, 7.0, 1338.0));
}
	
	public static int between(double[] x, double a, double b) {
		int firstPointer = 0;
		int secondPointer = x.length-1;
		while(firstPointer <= secondPointer) {
			if(x[firstPointer] <= a) {
				firstPointer++;
			}
			if(x[secondPointer] >= b) {
				secondPointer--;
			}
			if(x[firstPointer] > a && x[secondPointer] < b) {
				return secondPointer-firstPointer+1;
			}
		}
		return -1;
	}
}
