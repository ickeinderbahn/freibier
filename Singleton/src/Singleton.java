public class Singleton {
 
  // Eine (versteckte) Klassenvariable vom Typ der eigenen Klasse
  private static Singleton instance;
  // Verhindere die Erzeugung des Objektes �ber andere Methoden
  private Singleton () {}
  // Eine Zugriffsmethode auf Klassenebene, welches dir '''einmal''' ein konkretes 
  // Objekt erzeugt und dieses zur�ckliefert.
  public static Singleton getInstance () {
    if (Singleton.instance == null) {
      Singleton.instance = new Singleton ();
    }
    return Singleton.instance;
  }
}