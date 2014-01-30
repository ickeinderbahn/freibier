
public class AnimalDoc extends Animal{

	public void injectMedi(Animal a) {
		a.makeSomeNoise();
	}
	
	public static void main(String[] args) {
		
		Animal[] ani = new Animal[2];
		
		ani[0] = new IamADog();
		ani[1] = new IamACat();
		
		AnimalDoc ad = new AnimalDoc();
		
		for (int i = 0; i < ani.length; i++) {
			ad.injectMedi(ani[i]);
			ani[i].hatesTheseAnimals("other");
		}
	}
}
