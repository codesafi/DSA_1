import java.util.Scanner;

public class first_N_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("sum of first "+n+" numbers : "+n_natural_number(n));

	}

	private static int n_natural_number(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		int sum = n_natural_number(n-1);
		
		return n + sum;
	}

}
