package java15;

public abstract sealed interface Car permits BMW, Audi {
	abstract void makeNoise();

}

record BMW(int price) implements Car{
	
}

record Audi(int price, String model) implements Car {
	
}
