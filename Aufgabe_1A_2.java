import java.io.*;
//Kopf der Klasse
public class Aufgabe_1A_2 {  
    /** Gruppe 27: Berdan Kaya und Marvin Unkelbach
     *  Das Programm berechnet den Flächeninhalt eines Kreises, dafür liest es den Radius ein und setzt ihn in den typen double "radius", dieser "radius" wird dann in die Formel in
        "resultat" eingesetzt und quadriert und mit Pi multipliziert. Das Resultat ist der Flächeninhalt eines Kreises */
        
        // main-Methode (standatisierte Methode zum ausführen der Befehle
        public static void main(String args[]) throws IOException {    //Kopf der Klasse
        
        // Attribute werden deklariert
        double radius, resultat;
        
        // Reader zur Eingabe wird erstellt
        BufferedReader in       = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nBerechnung für einen Kreis:\n");
        System.out.println("Bitte eingeben:");
        System.out.println(" Radius:");
//        System.out.print("  X-Koordinate: ");
        radius = Integer.parseInt(in.readLine()); //Eingabe wird in "radius" gespeichert
//        System.out.print("  Y-Koordinate: ");
//        linksObenY = Integer.parseInt(in.readLine());
//        System.out.println(" Rechte untere Ecke:");
//        System.out.print("  X-Koordinate: ");
//        rechtsUntenX = Integer.parseInt(in.readLine());
//        System.out.print("  Y-Koordinate: ");
//        rechtsUntenY = Integer.parseInt(in.readLine());
        resultat = Math.PI * (radius * radius); //Eingabe "radius" wird in resultat zur Berechnung des Flaecheninhalts genutzt
        System.out.println("\nResultat: "+resultat);  //Ausgabe des berechneten Kreisflaecheninhalts
        
     }
}