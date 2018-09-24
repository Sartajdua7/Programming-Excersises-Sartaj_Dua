package homework;

import java.math.BigInteger;

public class Practice {

	public static void main(String[] args) {
		// i= 1
		//         {192,  19,  1,  8,  3,  192}
/*
long[] x = {2L, 192L, 19L, 1L, 8L, 3L};
for(long r: rotate(x, 2)) {
	System.out.println(r);
}
*/
for(String r: intToString(100)) {
	System.out.println(r);
}

//System.out.println(fibonacci());
}

public static BigInteger fibonacci() {
	BigInteger first = BigInteger.ONE;
	BigInteger second = BigInteger.ONE;
	BigInteger third = null;
	for(int i = 1; i <= 3473-2; i++) {
		third = first.add(second);
		second = third;
		first = second;
	}
return third;
	
}

public static long[] rotate(long[] x, int a) {
	while(a > 0) {
		long temp = x[0];
		for(int i= 0; i < x.length; i++) {
			if(i == x.length-1) {
				x[i] = temp;
			}
			else {
				x[i] = x[i+1];
			}
		}
		a--;
	}
	return x;
}

public static String[] intToString(int x) {
	int total = 0;
	for(int i = 1; i <= x; i++) {
		total += i;
	}
	String[] answer = new String[total];
	int counter = 0;
	int numbers = 1;
	while(counter <= x) {
	for(int i = 1; i <= numbers; i++) {
		String arrayValue = "";
		String sVersion = Integer.toString(i);
		for(int r = 0; r < sVersion.length(); r++) {
			int convertThis = Integer.parseInt(sVersion.substring(r, r+1));
			arrayValue += convert(convertThis);
		}
		answer[counter] = arrayValue;
		counter++;
	}
	numbers++;
	}
return answer;
}
public static String convert(int x) {
	String answer = "";
	switch(x) {
	case 1:
		answer = "ONE";
		break;
	case 2:
		answer = "TWO";
		break;
	case 3:
		answer = "THREE";
		break;
	
	case 4:
		answer = "FOUR";
		break;
	case 5:
		answer = "FIVE";
		break;
	case 6:
		answer = "SIX";
		break;
	case 7:
		answer = "SEVEN";
		break;
	case 8:
		answer = "EIGHT";
		break;
	case 9:
		answer = "NINE";
		break;
}
	return answer;
}
}
