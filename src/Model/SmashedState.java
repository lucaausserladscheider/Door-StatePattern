package Model;

/**
 * Klasse SmashedState implementiert das Interface Doorstate
 * @author Luca Ausserladscheider
 */
public class SmashedState implements DoorState {
    private Door door;

    /**
     * Konstruktor der Klasse SmashedState
     * @param door
     */
    public SmashedState(Door door) {
        this.door = door;
    }

    /**
     * implementierte Methode openDoor() des Interface DoorState
     */
    @Override
    public void openDoor () {
        System.out.println ("Du kannst keine zertrümmerte Türe öffnen!");
    }

    /**
     * implementierte Methode closeDoor() des Interface DoorState
     */
    @Override
    public void closeDoor () {
        System.out.println ("Du kannst keine zertrümmerte Türe schließen!");
    }

    /**
     * implementierte Methode lockDoor() des Interface DoorState
     */
    @Override
    public void lockDoor () {
        System.out.println ("Du kannst keine zertümmerte Türe absperren!");
    }

    /**
     * implementierte Methode unlockDoor() des Interface DoorState
     */
    @Override
    public void unlockDoor () {
        System.out.println ("Du kannst keine zertrümmerte Türe aufsperren!");
    }

    /**
     * implementierte Methode smashDoor() des Interface DoorState
     */
    @Override
    public void smashDoor () {
        System.out.println ("Die Türe ist bereits eingetreten!");
    }

    /**
     * implementierte Methode stateStr() des Interface DoorState
     * gibt die SmashedState Klasse als String zuzrück
     */
    @Override
    public String stateStr () {
        return "Zerstört!";
    }

}
