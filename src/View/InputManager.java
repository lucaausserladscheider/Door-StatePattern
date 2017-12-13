package View;

import java.util.Scanner;

import Model.Door;

/**
 * Die Klasse InputManager handelt die Consolen Eingaben und gibt den StartScreen aus
 * @author Luca Ausserladscheider
 */
public class InputManager {

    private Door door;

    /**
     * Konstruktor der Klasse InputManager, nimmt ein aktuelles Türobject entgegen
     * @param door
     */
    public InputManager ( Door door ) {
        this.door = door;
    }

    /**
     * start() implementiert ein Scanner Objekt für die Konsolen Eingaben
     * prüft die Eingaben und entscheidet was zu tun ist
     * */
    public void start () {
        Scanner in = new Scanner ( System.in );
        startView ();
        while (true) {
            System.out.println ( "Türe ..." );
            String input = in.next ();
            if (input.equals ( "schließen" )) {
                door.getDoorState ().closeDoor ();
            } else if (input.equals ( "absperren" )) {
                door.getDoorState ().lockDoor ();
            } else if (input.equals ( "aufsperren" )) {
                door.getDoorState ().unlockDoor ();
            } else if (input.equals ( "öffnen" )) {
                door.getDoorState ().openDoor ();
            } else if (input.equals ( "zerstören" )) {
                door.getDoorState ().smashDoor ();
            } else {
                System.out.println ( "Bitte bekannten Befehl eingeben!" );
            }
            System.out.println ( "****************************************************************" );
            System.out.println ("Der akteulle Zustand der Türe ist: " + door.getDoorState ().stateStr ());
        }
    }

    /**
     * gibt auf der Konsole die Start Ausgabe aus
     */
    public void startView () {
        System.out.println ( "******************************************************************" );
        System.out.println ( "Du stehst vor einer Türe!" );
        System.out.println ( "Du kannst die Türe mit folgenden Befehlen steuern:" );
        System.out.println ( "öffnen, aufsperren, absperren, schließen und zerstören" );
        System.out.println ("Der akteulle Zustand der Türe ist: " + door.getDoorState ().stateStr ());
        System.out.println ( "Viel Spaß!" );
        System.out.println ( "*****************************************************************" );

    }
}
