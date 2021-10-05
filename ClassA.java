public class ClassA {
	
	private int x;
	
	public ClassA(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
	
	public void func() {
		int x;
		x = 1;
	}
	
	public static int compute(int n) {
		int sum = 0;
		for (int k = 0; k < n; k++) {
			for (int l = n; l > 0; l--) {
					sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ClassA object  = new ClassA(0);
		object.func();
		System.out.println(object.getX());	
		System.out.println(compute(3));
	}
	

}