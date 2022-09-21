package inheritance;

public class Square extends BaseClass{
	
	public void methodSquare() {
		System.out.println("in Square");
	}

	public static void main(String[] args) {
		BaseClass obj1 = new BaseClass();
		Triangle sq = new Triangle();
		Square sq1 = new Square();
		
		/*
		 * sq=sq1; System.out.println(sq.);
		 */
	}
}
