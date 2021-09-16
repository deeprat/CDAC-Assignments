/*3. Find first N terms of a Fibonacci Series. In Fibonacci series the next term is the sum of the previous two terms.
	First two terms of the series are 1 and 1. Hence, the series with 6 terms would be
	1 1 2 3 5 8
 *
 * */


class Main{
	public static Integer[] fib(int n){
		if(n < 2) return null;
		Integer[] res = new Integer[n];
		res[0] = 1;
		res[1] = 1; 
		for(int i = 2; i < n; i++){
			res[i] = res[i-1] + res[i-2];
		}
		return res;
	} 

	public static void main(String[] args){
		int n = 6; 
		Integer[] res = fib(n); 
		for(Integer each  : res){
			System.out.print(each + " ");
		}
	}
}

