
public class Hauptklasse {
	public static Fragenkatalog fragenkatalog = new Fragenkatalog();
	public static String spielername1, spielername2, spielername3;
	private static int punkte51 = 0, puntke52 = 0, punkte53;
	public static GUI_Fragen guiFragen;
	private final static int anzahlSchwierigkeitsgrade = 3;
	private static int spielerzahl = 0;
	public static int getSpielerzahl() {
		return spielerzahl;
	}
	public static void setSpielerzahl(int spielerzahl) {
		Hauptklasse.spielerzahl = spielerzahl;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	public static Fragenkatalog getFragenkatalog() {
		return fragenkatalog;
	}
	public static void setFragenkatalog(Fragenkatalog fragenkatalog) {
		Hauptklasse.fragenkatalog = fragenkatalog;
	}
	public static String getSpielername1() {
		return spielername1;
	}
	public static void setSpielername1(String spielername1) {
		Hauptklasse.spielername1 = spielername1;
	}
	public static String getSpielername2() {
		return spielername2;
	}
	public static void setSpielername2(String spielername2) {
		Hauptklasse.spielername2 = spielername2;
	}
	public static String getSpielername3() {
		return spielername3;
	}
	public static void setSpielername3(String spielername3) {
		Hauptklasse.spielername3 = spielername3;
	}
	public static int getPunkte51() {
		return punkte51;
	}
	public static void setPunkte51(int punkte51) {
		Hauptklasse.punkte51 = punkte51;
	}
	public static int getPuntke52() {
		return puntke52;
	}
	public static void setPuntke52(int puntke52) {
		Hauptklasse.puntke52 = puntke52;
	}
	public static int getPunkte53() {
		return punkte53;
	}
	public static void setPunkte53(int punkte53) {
		Hauptklasse.punkte53 = punkte53;
	}
	public static GUI_Fragen getGuiFragen() {
		return guiFragen;
	}
	public static void setGuiFragen(GUI_Fragen guiFragen) {
		Hauptklasse.guiFragen = guiFragen;
	}
	public static int getAnzahlschwierigkeitsgrade() {
		return anzahlSchwierigkeitsgrade;
	}
	

	
}
