public class SmashedState implements DoorState {
    private Door door;

    public SmashedState(Door door) {
        this.door = door;
    }

    @Override
    public void openDoor () {
        System.out.println ("Du kannst keine zertrümmerte Türe öffnen!");
    }

    @Override
    public void closeDoor () {
        System.out.println ("Du kannst keine zertrümmerte Türe schließen!");
    }

    @Override
    public void lockDoor () {
        System.out.println ("Du kannst keine zertümmerte Türe absperren!");
    }

    @Override
    public void unlockDoor () {
        System.out.println ("Du kannst keine zertrümmerte Türe aufsperren!");
    }
    @Override
    public void smashDoor () {
        System.out.println ("Die Türe ist bereits eingetreten!");
    }
}
