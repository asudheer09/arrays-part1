import java.util.Scanner;

public class CheckANumberIsPrimeNumberOrNot {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("please ente a number");
		
		int n=sc.nextInt();
		
		boolean flag=true;
		
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println(" the given number is a prime number");
		}else {
			System.out.println(" the given number is not a prime number");
		}
		
	
	}

}
