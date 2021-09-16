/*2. Given a positive integer N, find its reverse.
	For example:
	N = 534
	Reverse = 435
	N = 5
	Reverse = 5
 *
 * */

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

	public static void main(String[] args){
		int num = 5; 
		int rev = reverse(num);
		System.out.println(rev);
	}
}
