package adapter_structural1;
public class DogAdapter implements ToyDog {
	
	Animal animal;

	public DogAdapter(Animal animal) {
		super();
		this.animal = animal;
	}

	public void furry() {
		animal.makeNoise();
		
	}
	

}
