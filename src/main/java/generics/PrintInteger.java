package generics;

//Generic Class
public class PrintInteger <T> {
	T thingToPrint;
	PrintInteger(T thingToPrint){
		this.thingToPrint = thingToPrint;
	}
	
	public void printInteger() {
		System.out.println(thingToPrint);
	}
	//Generic Methods
	public <T,V> void print(T thingToPrint,V number) {
		System.out.println(thingToPrint+""+number);
	}
}
