package Model;

/**
 * Klasse Door, die ein einfaches Tür Object darstellt
 */
public class Door {
    private DoorState doorState;

    /**
     * Konstruktor der Klasse Door
     * setzt eine Instanz in den Anfangszustand ClosedAndLockedState
     */
    public Door() {
        doorState = new ClosedAndLockedState (this);
    }

    /**
     * gibt den aktuellen Status eines Türobjektes zurück
     * @return
     */
    public DoorState getDoorState () {
        return doorState;
    }

    /**
     * setzt den Status der Türe auf den übergebenen Status
     * @param doorState
     */
    public void setDoorState ( DoorState doorState ) {
        this.doorState = doorState;
    }
}
