public class makeAnAnimal {

	public static void main(String[] args) {

		Animal[] ani = new Animal[2];
		ani[0] = new IamADog();
		ani[0].setName("Koeterhund");
		ani[1] = new IamACat();
		ani[1].setName("KratzKatz");

		for (int i = 0; i < ani.length; i++) {
			System.out.println(ani[i].getName());
			ani[i].makesSuchNoise("MiWau");
			System.out.println(ani[i].livesInWater("earth"));
			ani[i].hatesTheseAnimals("others");
		}

		if (ani[0] instanceof IamADog) {
			IamADog dog = (IamADog) ani[0];
			dog.FoodInMyBowl("Meat");
			dog.IPrefferHome();
			dog.makeSomeNoise();
		}
	}
}
