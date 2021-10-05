public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = c1;
		Circle c3 = new Circle (10);
		c1 = c3;

		System.out.print(c1.getRadius() + " ");
		System.out.print(c2.getRadius() + " ");
		System.out.println(c3.getRadius());
    
 	}
}