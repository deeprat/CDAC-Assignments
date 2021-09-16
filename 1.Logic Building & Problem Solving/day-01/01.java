/*
 * 1. Given a positive integer N, find all factors of N.
	For example:
	N = 12
	Factors = 1 2 3 4 6 12
	N = 5
	Factors = 1 5
*/

import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		int n = 12;
		ArrayList<Integer> factor = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			if(n%i == 0){
				factor.add(i);
			}
		}
		System.out.println(factor);
	}
}
