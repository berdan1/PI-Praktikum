//"Reader" werden importiert um die Eingabe in der Konsole zu ermöglichen
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Kopf der Klasse
public class Aufgabe_1A_3 {
    /** Gruppe 27: Berdan Kaya und Marvin Unkelbach
     *  Das Programm berechnet den Flächeninhalt eines Kreises, dafür liest es den Mittelpunk vom Kreis und einen Aussenpunkt auf und setzt diese in die Formel "radius" in welcher der
     *  Abstand der Punkte erst quadriert und dann miteinander addiert wird, zieht man davon die Wurzel erhält man den Radius. Den Radius nutzen wir in "resultat" um den Kreisflaecheninhalt mit
     *  Pi * r^2 zu berechnen.*/
    
        // main-Methode (standatisierte Methode zum ausführen der Befehle)
        public static void main(String args[]) throws IOException {

        // Attribute werden deklariert
        double radius, mittelpunktX, mittelpunktY, aussenpunktX, aussenpunktY, resultat;

        // Reader zur Eingabe wird erstellt
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nBerechnung für ein Kreis:\n");
        System.out.println("Bitte eingeben:");
        System.out.println(" Mittelpunkt:");
        System.out.print(" X-Koordinate: ");
        mittelpunktX = Integer.parseInt(in.readLine()); //Eingabe wird in "mittelpunktX" gespeichert
        System.out.print(" Y-Koordinate: ");
        mittelpunktY = Integer.parseInt(in.readLine()); //Eingabe wird in "mittelpunktY" gespeichert
        System.out.println(" Aussenpunkt:");
        System.out.print(" X-Koordinate: ");
        aussenpunktX = Integer.parseInt(in.readLine()); //Eingabe wird in "aussenpunktX" gespeichert
        System.out.print(" Y-Koordinate: ");
        aussenpunktY = Integer.parseInt(in.readLine()); //Eingabe wird in "aussenpunkt>" gespeichert

        radius = Math.sqrt(Math.pow(aussenpunktX - mittelpunktX, 2) + Math.pow(aussenpunktY - mittelpunktY, 2)); //Berechnung vom Radius "radius"

        resultat = (double) (Math.PI * (radius * radius)); //Berechnung des Kreisflaecheninhalts 

        System.out.println("\nResultat: " + resultat); //Ausgabe des Kreisflaecheninhalts

    }
}