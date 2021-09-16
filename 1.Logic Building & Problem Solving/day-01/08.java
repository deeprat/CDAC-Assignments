/*
8. Find the sum of all digit of a integer (both positive and negative).
	For example:
	Number = -3245
	Sum of digits = 14 (3 + 2 + 4 + 5)
	Number = 12
	Sum of digits = 3 (1 + 2)
*/

class Main{
	
	
	public static int findAbsVal(int num){
		return (num < 0) ? -num : num;
	}

	public static int findSumOfDigits(int num){
		int sum = 0; 
		num = findAbsVal(num);
		while(num > 0){
			sum += num % 10; 
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args){
		int num = -3245; 
		System.out.println(findSumOfDigits(num));
	}
}
