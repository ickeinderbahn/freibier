
public class ExceptionExercise {
	
	public void showText(Object myObj) throws MyException {
		myObj.equals(myObj);
		if (myObj instanceof String) {
			System.out.println("Objekt ist ein String: " + myObj);
		}
		else throw new MyException();
	}
	
	public void CastAround(Object myObjCastFrom, Object myObjectCastTo) throws MyException {
		myObjCastFrom = (int) myObjectCastTo;
	}
	
		public static void main(String[] args) {
		ExceptionExercise ee = new ExceptionExercise();
		int objIn = 10;
		try {
			ee.showText(objIn);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ObjInStr = "Radl da.";
		try {
			ee.showText(ObjInStr);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Double myObjCastFrom = null;
		String myObjectCastTo = "Radl";
		
		try {
			ee.CastAround(myObjCastFrom, myObjectCastTo);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		String ObjInStr2 = null;
		try {
			ee.showText(ObjInStr2);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
