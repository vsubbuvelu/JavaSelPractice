package generics;

public class Printer {
	
	public static void main(String[] args) {
		
		//Use Generic Class
		PrintInteger<Integer> p = new PrintInteger<>(12);
		p.printInteger();
		
		//Call Generic Method
		p.print("string",12);
		
		PrintInteger<String> p1 = new PrintInteger<>("hi there");
		p1.printInteger();
		Cat cat = new Cat("cat");
		Animal an = new Animal("animal");
		GenericsInExtends<Cat> g = new GenericsInExtends<Cat>(cat);
		
		g.printAnimalmakeNoise();
		
	
		
	}

}
