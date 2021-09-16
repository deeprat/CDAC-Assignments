/* 
	4. Find sum of all numbers between two positive integers N and M, including N and M.
	For example:
	N = 3
	M = 7
	Sum = 25 (3 + 4 + 5 + 6 + 7)
 *
 * */

class Main{
	
	public static int findSumRange(int n, int m){
		if(n > m) return -1;
		int result = 0;
		for(int i = n; i <= m; i++){
			result += i;
		}
		return result;
	}

	public static void main(String[] args){
		int n = 3; 
		int m = 7; 
		int result = findSumRange(n, m);
		System.out.println(result);
	}
}
