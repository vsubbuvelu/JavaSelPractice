package generics;

public class GenericsInExtends <T extends Cat> {
	
	T thingsToPrint;
	public GenericsInExtends(T thingsToPrint) {
		this.thingsToPrint = thingsToPrint;
	}
	
	public void printAnimalmakeNoise() {
		thingsToPrint.makeNoise1();
	}

}
