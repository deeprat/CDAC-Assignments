/*
7. Find the sum of all digit of a positive integer.
	For example:
	Number = 3245
	Sum of digits = 14 (3 + 2 + 4 + 5)
*/

class Main{
	
	public static int findSumOfDigits(int num){
		int sum = 0; 
		while(num > 0){
			sum += num % 10; 
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args){
		int num = 3245; 
		System.out.println(findSumOfDigits(num));
	}
}
