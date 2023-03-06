
public class Outer {
	private static int value = 20;
	public static int s = 15;
	public static int temp = 10;
	public static class Nested{
		private void display() {
			System.out.println(temp + s + value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Nested inner = new Outer.Nested();
		inner.display();
	}

}
