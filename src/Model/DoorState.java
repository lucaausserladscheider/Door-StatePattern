package Model;

public interface DoorState {

    void openDoor();
    void closeDoor();
    void lockDoor();
    void unlockDoor();
    void smashDoor();
    String stateStr();

}
