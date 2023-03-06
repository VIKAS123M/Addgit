
public class Lreturn {
	String s;
	public void sum() {
	
		int total = 10 + 20;
		s = "Hello";
	}
	
	public void takesum() {
		String s1 = s;
		System.out.println(s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lreturn l = new Lreturn();
		l.takesum();
	}

}
