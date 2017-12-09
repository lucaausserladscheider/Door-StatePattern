import java.util.Scanner;

public class InputManager {

    private Door door;

    public InputManager ( Door door ) {
        this.door = door;
    }

    public void start () {
        Scanner in = new Scanner ( System.in );

        while (true) {
            System.out.println ( "Türe ..." );
            String input = in.next ();
            if (input.equals ( "close" )) {
                door.getDoorState ().closeDoor ();
            } else if (input.equals ( "lock" )) {
                door.getDoorState ().lockDoor ();
            } else if (input.equals ( "unlock" )) {
                door.getDoorState ().unlockDoor ();
            } else if (input.equals ( "open" )) {
                door.getDoorState ().openDoor ();
            } else if (input.equals ( "smash" )) {
                door.getDoorState ().smashDoor ();
            }
        }
    }
}
