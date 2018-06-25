package pl.java.workExperience;

import java.awt.Color;

public class TaskOfSomething {
	

	//rozwi¹zanie rekurencyjne
		public static int FibR(int n) {
			if(n<2) return n;
			return FibR(n-1)+FibR(n-2);
			}
		
	//rozwi¹zanie iteracyjne
		
		public static int FibI(int n) {
			int tmp = 0, tmp1 = 1;
			int fib = 1;
			for(int i = 2; i<=n;i++) {
				fib = tmp + tmp1;
				tmp = tmp1;
				tmp1 = fib;
			}
			return fib;
		}
	
		
	public static void main(String[] args) {
//		TaskOfSomethingGUI gui = new TaskOfSomethingGUI();
//		int n = gui.getNumber();
//	
//		System.out.println(FibR(n)+"\n"+FibI(n));
		new TaskOfSomethingGUI(); // test Frame
		
	}

}
