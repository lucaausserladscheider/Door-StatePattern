public class ClosedAndUnlockedState implements DoorState {
    private Door door;

    public ClosedAndUnlockedState(Door door) {
        this.door = door;
    }

    @Override
    public void openDoor () {
        System.out.println ("Du hast die Türe erfolgreich geöffnet!");
        door.setDoorState ( new OpenState (door) );
    }

    @Override
    public void closeDoor () {
        System.out.println ("Du kannst die Türe nicht schließen, weil sie bereits geschlossen ist!");
    }

    @Override
    public void lockDoor () {
        System.out.println ("Du hast die Türe erfolgreich abgeschlossen");
        door.setDoorState ( new ClosedAndLockedState(door) );
    }

    @Override
    public void unlockDoor () {
        System.out.println ("Du kannst die Türe nicht aufsperen, weil sie bereits aufgeschlossen ist!");

    }
    @Override
    public void smashDoor () {
        System.out.println ("Du hast erfolgreich die Türe eingetreten!");
        door.setDoorState ( new SmashedState (door) );
    }
}
