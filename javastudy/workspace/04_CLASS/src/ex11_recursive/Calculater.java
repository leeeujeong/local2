package ex11_recursive;

public class Calculater {

// 팩토리얼(factorial)
// 계승값
// 5! = 5 * 4 * 3 * 2 * 1	5! = 5 * 4!  
// 4! = 4 * 3 * 2 * 1	    4! = 4 * 3!
// 3! = 3 * 2 * 1           3! = 3 * 2!
// 2! = 2 * 1               2! = 2 * 1!
// 1! = 1                   
// 0! = 1   -> 프로그래밍상 1로  확인함..!
	public int factorial(int n) {
		if (n == 0) {
			return 1;

		}
	     return n * factorial(n-1);
	 
	}

}
