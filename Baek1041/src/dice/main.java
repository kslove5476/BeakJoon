package dice;
import java.util.Scanner;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        long d = scan.nextInt();
	        long[] inputdice = new long[6];
	        long[] result = new long[3];
	        for(int i=0; i<6; i++){
	        	inputdice[i] = scan.nextInt();
	        }

	        long sum =0;
	        if(d == 1){
	            Arrays.sort(inputdice);
	            for(int i=0; i<5; i++)
	                sum+= inputdice[i];
	        }else{
	            result[0] = Math.min(inputdice[0],inputdice[5]);
	            result[1] = Math.min(inputdice[1], inputdice[4]);
	            result[2] = Math.min(inputdice[2], inputdice[3]);
	            Arrays.sort(result);
	            long a3 = 4*(result[0] + result[1] + result[2]);
	            long a2 = (4*(d-1) + 4*(d-2)) * (result[0]+result[1]);
	            long a1 = (4*(d-1)*(d-2) + (d-2)*(d-2)) *result[0];

	            sum= a3+a2+a1;
	        }
	        System.out.println(sum);
	}

}
