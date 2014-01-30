public class IamADog extends Animal implements ImNotWild {

	public void hatesTheseAnimals() {
		System.out.println("mag keine Katzen ...");
	}

	public void makeSomeNoise() {
		System.out.println("Raff Wuff Klaefff Knurrr!!");
	}

	@Override
	public void IPrefferHome() {
		System.out.println("I'm lazy and like it warm!");
	}

	@Override
	public void FoodInMyBowl(String food) {
		System.out.println("Put some " + food + " in my bowl, pronto!");
	}

}
