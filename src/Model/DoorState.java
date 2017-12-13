package Model;

/**
 * Das Interface DoorState, welches von den einzelnen State Klassen imploementiert wird
 */
public interface DoorState {

    /**
     * Die Methode openDoor() wird zur Verfügung gestellt
     */
    void openDoor();

    /**
     * Die Methode closeDoor() wird zur Verfügung gestellt
     */
    void closeDoor();

    /**
     * Die Methode lockDoor() wird zur Verfügung gestellt
     */
    void lockDoor();

    /**
     * Die Methode unlockDoor() wird zur Verfügung gestellt
     */
    void unlockDoor();

    /**
     * Die Methode smashDoor() wird zur Verfügung gestellt
     */
    void smashDoor();

    /**
     * Die Methode stateStr() wird zur Verfügung gestellt
     */
    String stateStr();

}
