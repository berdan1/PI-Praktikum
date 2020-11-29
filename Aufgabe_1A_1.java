import java.io.*;
//Kopf der Klasse
public class Aufgabe_1A_1 {  
    /** Gruppe 27: Berdan Kaya und Marvin Unkelbach
    *   Das Programm berechnet den Flächeninhalt eines Vierecks im Koordinatensystem, dafür liest es 4 Eingaben ein, welche dann im Integer "resultat" in die Formel
        für den Flächeninhalt eines Vierecks eingesetzt werden. Das Ergebnis wird in "resultat" gespeichert und gibt den Flächeninhalt des Vierecks an */
    
        // main-Methode (standatisierte Methode zum ausführen der Befehle
        public static void main(String args[]) throws IOException {    
        
        // Attribute werden deklariert
        int linksObenX, linksObenY, rechtsUntenX, rechtsUntenY, resultat;
        
        // Reader zur Eingabe wird erstellt
        BufferedReader in       = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nBerechnung für ein Rechteck:\n");
        System.out.println("Bitte eingeben:");
        System.out.println(" Linke obere Ecke:");
        System.out.print("  X-Koordinate: ");
        linksObenX = Integer.parseInt(in.readLine()); //Eingabe wird in "linksObenX" gespeichert
        System.out.print("  Y-Koordinate: ");
        linksObenY = Integer.parseInt(in.readLine()); //Eingabe wird in "linksObenY" gespeichert
        System.out.println(" Rechte untere Ecke:");
        System.out.print("  X-Koordinate: ");
        rechtsUntenX = Integer.parseInt(in.readLine()); //Eingabe wird in "rechtsUntenX" gespeichert
        System.out.print("  Y-Koordinate: ");
        rechtsUntenY = Integer.parseInt(in.readLine()); //Eingabe wird in "rechtsUntenY" gespeichert
        resultat = (rechtsUntenX-linksObenX)*(linksObenY-rechtsUntenY); //Eingaben werden in "resultat" zur Berechnung des Vierecks genutzt
        System.out.println("\nResultat: "+resultat);  //Ausgabe des berechneten Flaecheninhalts
        
     }
}