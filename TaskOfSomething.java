package pl.java.workExperience;

public class TaskOfSomething {

	//rozwi¹zanie rekurencyjne
		public static int FibR(int n) {
			if(n<=2) return n;
			return FibR(n-2)+FibR(n-1);
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println(FibR(10));
		
	}

}
