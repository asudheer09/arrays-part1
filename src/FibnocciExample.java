
public class FibnocciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 1 2 3 5 
		
		
		int f=0,f1=1,f2;
		
		System.out.print(f+" ");
		System.out.print(f1+" ");
		
		for(int i=0;i<=10;i++) {
			f2=f+f1;//1
			System.out.print(f2+" ");
			f=f1;//1
			f1=f2;//1
		}
		
		

	}

}
