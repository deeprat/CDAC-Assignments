/*
10. Given a positive integer N, check if its palindrome or not. A palindrome number is a number that is same as its reverse.
	For example:
	Number = 32
	Not a palindrome. (Reverse is 23 and not same as 32)
	Number = 545
	A palindrome. (Reverse is 545 and not same as 545)*/

class Main{
	
	public static int reverse(int num){
		int res = 0;
		while(num > 0){
			res = res * 10; 
			res += num % 10;
			num = num / 10;
		}
		return res;
	}

	public static boolean isPalindrome(int num){
		int res = reverse(num);
		return res == num;
	}

	public static void main(String[] args){
		int num = 545; 
		System.out.println(isPalindrome(num));
	}
}
