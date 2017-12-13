package Main;

import Model.Door;
import View.InputManager;

public class Main {
    public static void main ( String[] args ) {
        Door door = new Door ();
        InputManager im = new InputManager ( door );
        im.start ();
    }
}

