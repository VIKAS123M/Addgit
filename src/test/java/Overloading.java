
public class Overloading {
	public void runn1(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	public String runn1(float a, float b) {
		float sum = a + b;
		System.out.println(sum);
		String name = "vikas";
		return name;
	}
	public static String name1(String n) {
		String name = n;
		return name;

	}
	public static void runn() {
		System.out.println("overloading!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading og = new Overloading();
		og.runn1(8, 9);
		og.runn1(10.0f, 20.0f);
	}

}


