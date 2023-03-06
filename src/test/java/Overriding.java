
public class Overriding extends Overloading {
	public static void runn() {
		System.out.println("Overriding!");
	}
	public static String name1(String n) {
		return "hi"+n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading or = new Overriding();
		Overriding os = (Overriding)or;
		or.runn();
		String s = or.name1("vikas");
		or.name1(s);
		

	}

}

