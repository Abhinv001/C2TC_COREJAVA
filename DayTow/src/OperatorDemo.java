
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=10;
		System.out.println(a+ " "+b);
		//String d=2+"4";
		//int i=2+4;
		//String e ="2"+"4";
		//System.out.println(d);
		//System.out.println(i);
		//System.out.println(e);
		
		++a;
		int d=++a +b + a--;
		System.out.println(d);
		int x = c++ + a + b--;
		System.out.println("x=" + x);
		
		
		// ternary operator
		c= (10==c) ? 1:0;
		System.out.println(c);
	}

}
