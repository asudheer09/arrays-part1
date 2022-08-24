import java.util.Scanner;

public class EvenOrOddNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please enter a number ");
		
		int n=sc.nextInt();
		
		for(int i=0;i<=20;i++) {
			
			if(i%2==0) {
				System.out.println("even number "+i);
			}else {
				System.out.println("odd number "+i);
			}
			
		}
		
		
	}

}
