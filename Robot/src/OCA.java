public class OCA {

	OCA() {
	}

	public OCA(int a) {
	}

	public void finalize() {
	}

	public void init() {
	}

	public void init(int a) {
	}

	{
		System.out.println("Initializer block");
	}

	public static void main(String[] args) {
		int a = 10;
		long b = 20;
		short c = 30;
		System.out.println(b++ + 5);
	}
}
