package Model;

/**
 * Klasse CloseAndLockedState implementiert das Interface Doorstate
 * @author Luca Ausserladscheider
 */
public class ClosedAndLockedState implements DoorState {

    private Door door;

    /**
     * Konstruktor der Klasse ClosedAndLockedState
     * @param door
     */
    public ClosedAndLockedState(Door door) {
        this.door = door;
    }

    /**
     * implementierte Methode openDoor() des Interface DoorState
     */
    @Override
    public void openDoor () {
        System.out.println ("Du kannst die Türe nicht öffnen, weil sie abgeschlossen ist!");
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
     */
    @Override
    public void lockDoor () {
        System.out.println ("Du kannst die Türe nicht absperren, weil sie bereits abgesperrt ist!");
    }

    /**
     * implementierte Methode unlockDoor() des Interface DoorState
     * setzt den akteullen Door Status auf ClosedAndUnlockedState
     */
    @Override
    public void unlockDoor () {
        System.out.println ("Du hast die Türe erfolgreich aufgeschlossen!");
        door.setDoorState ( new ClosedAndUnlockedState (door) );
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
     * gibt die ClosedAndLockedState Klasse als String zuzrück
     */
    @Override
    public String stateStr () {
        return "Abgesperrt und Geschlossen!";
    }

}
