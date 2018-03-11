
public class Funkcja {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	public void fun(int a) {
		b = (int) (a * 1.8 + 32.0);
		System.out.println("Wynik wynosi: " +b);
	}
}
