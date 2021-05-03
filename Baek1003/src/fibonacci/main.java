package fibonacci;

import java.util.Scanner;

public class main{
 
	static Integer[][] fi = new Integer[41][2];
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		fi[0][0] = 1;	// if N=0, number of call 0
		fi[0][1] = 0;	// if N=0, number of call 1
		fi[1][0] = 0;	// if N=1, number of call 0
		fi[1][1] = 1;	// if N=1, number of call 1
		
		int I = in.nextInt();
        
		while(I --> 0){
			int N = in.nextInt();
			fib(N);
			System.out.println(fi[N][0] + " " + fi[N][1]);
		
		}
		in.close();	
	}
	
	static Integer[] fib(int N) {
		//About N. If there's no number of call 0, 1(Unnavigating values.)
		if(fi[N][0] == null || fi[N][1] == null) {
			// Recursive the number of 0 calls and 1 calls for each N.
			fi[N][0] = fib(N - 1)[0] + fib(N - 2)[0];
			fi[N][1] = fib(N - 1)[1] + fib(N - 2)[1];
		}
		// About N. the number 0 and 1. [N] Returns, containing [N][0] and [N][1].
		return fi[N];
 
	}
 
}
