public class Animal {

	private String name = null;

	public void makesSuchNoise(String noise) {
		System.out.println(name + " macht: " + noise);
	}

	public boolean livesInWater(String kindOf) {
		if (kindOf == "earth") {
			return false;
		} else
			return true;
	}

	public void hatesTheseAnimals(String noFanOf) {
		System.out.println("mag diese Tiere nicht: " + noFanOf);
	}

	public void makeSomeNoise() {
		System.out.println("Make some noise ...! "); 
	}

	public void setName(String nameIn) {
		name = nameIn;
	}

	public String getName() {
		return name;
	}
	
	public int simpleCalc(int i, int j){
		int num;
		num = i + j;
		return num;
	}
}
