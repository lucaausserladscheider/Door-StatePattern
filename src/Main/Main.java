package Main;

import Model.Door;
import View.InputManager;

/**
 * Main Klasse, die ein Door Object, und ein InputManager Objekt erzeugt
 */
public class Main {

    /**
     * main() Methode, die ein Door Object, und ein InputManager Objekt erzeugt
     * @param args
     */
    public static void main ( String[] args ) {
        Door door = new Door ();
        InputManager im = new InputManager ( door );
        im.start ();
    }
}

