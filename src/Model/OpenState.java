package Model;

/**
 * Klasse OpenState implementiert das Interface Doorstate
 * @author Luca Ausserladscheider
 */
public class OpenState implements DoorState {

    private Door door;

    /**
     * Konstruktor der Klasse OpenState
     * @param door
     */
    public OpenState(Door door) {
        this.door = door;
    }

    /**
     * implementierte Methode openDoor() des Interface DoorState
     */
    @Override
    public void openDoor () {
        System.out.println ("Du kannst die Türe nicht öffnen, da sie bereits offen ist");
    }

    /**
     * implementierte Methode closeDoor() des Interface DoorState
     * setzt den akteullen Door Status auf ClosedAndUnlockedStates
     */
    @Override
    public void closeDoor () {
        System.out.println ("Du hast die Türe erfolgreich geschlossen!");
        door.setDoorState ( new ClosedAndUnlockedState (door) );
    }

    /**
     * implementierte Methode lockDoor() des Interface DoorState
     */
    @Override
    public void lockDoor () {
        System.out.println ("Du kannst die Türe nicht absperren, weil sie offen ist!");
    }

    /**
     * implementierte Methode unlockDoor() des Interface DoorState
     */
    @Override
    public void unlockDoor () {
        System.out.println ("Du kannst die Türe nicht aufsperren, weil sie gerade offen ist!");
    }

    /**
     * implementierte Methode smashDoor() des Interface DoorState
     * setzt den aktuellen Door Status auf SmashedState
     */
    @Override
    public void smashDoor () {
        System.out.println ("Du hast eine offene Türe eigetreten!");
        door.setDoorState ( new SmashedState (door) );
    }

    /**
     * implementierte Methode stateStr() des Interface DoorState
     * gibt die OpenState Klasse als String zuzrück
     */
    @Override
    public String stateStr () {
        return "Offen!";
    }
}
