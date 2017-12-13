package Model;

/**
 * Klasse CloseAndUnlockedState implementiert das Interface Doorstate
 * @author Luca Ausserladscheider
 */
public class ClosedAndUnlockedState implements DoorState {
    private Door door;

    /**
     * Konstruktor der Klasse ClosedAndUnlockedState
     * @param door
     */
    public ClosedAndUnlockedState(Door door) {
        this.door = door;
    }

    @Override
    public void openDoor () {
        System.out.println ("Du hast die Türe erfolgreich geöffnet!");
        door.setDoorState ( new OpenState (door) );
    }

    /**
     * implementierte Methode closeDoor() des Interface DoorState
     */
    @Override
    public void closeDoor () {
        System.out.println ("Du kannst die Türe nicht schließen, weil sie bereits geschlossen ist!");
    }

    /**
     * implementierte Methode lockDoor() des Interface DoorState
     * setzt den akteullen Door Status auf ClosedAndLockedState
     */
    @Override
    public void lockDoor () {
        System.out.println ("Du hast die Türe erfolgreich abgeschlossen");
        door.setDoorState ( new ClosedAndLockedState(door) );
    }

    /**
     * implementierte Methode unlockDoor() des Interface DoorState
     */
    @Override
    public void unlockDoor () {
        System.out.println ("Du kannst die Türe nicht aufsperen, weil sie bereits aufgeschlossen ist!");

    }

    /**
     * implementierte Methode smashDoor() des Interface DoorState
     * setzt den aktuellen Door Status auf SmashedState
     */
    @Override
    public void smashDoor () {
        System.out.println ("Du hast erfolgreich die Türe eingetreten!");
        door.setDoorState ( new SmashedState (door) );
    }

    /**
     * implementierte Methode stateStr() des Interface DoorState
     * gibt die ClosedAndUnlockedKlasse als String zuzrück
     */
    @Override
    public String stateStr () {
        return "Aufgesperrt und Geschlossen!";
    }

}
