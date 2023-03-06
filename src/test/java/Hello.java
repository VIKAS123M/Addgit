
public class Hello {
	
	static int globalvar;
	
	public void assign() {
		globalvar = 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h = new Hello();
		h.assign();
		System.out.println(globalvar);
	}

}
