public class ClosedAndLockedState implements DoorState {

    private Door door;

    public ClosedAndLockedState(Door door) {
        this.door = door;
    }
    @Override
    public void openDoor () {
        System.out.println ("Du kannst die Türe nicht öffnen, weil sie abgeschlossen ist!");
    }

    @Override
    public void closeDoor () {
        System.out.println ("Du kannst die Türe nicht schließen, weil sie bereits geschlossen ist!");
    }

    @Override
    public void lockDoor () {
        System.out.println ("Du kannst die Türe nicht absperren, weil sie bereits abgesperrt ist!");
    }

    @Override
    public void unlockDoor () {
        System.out.println ("Du hast die Türe erfolgreich aufgeschlossen!");
        door.setDoorState ( new ClosedAndUnlockedState (door) );
    }

    @Override
    public void smashDoor () {
        System.out.println ("Du hast erfolgreich die Türe eingetreten!");
        door.setDoorState ( new SmashedState (door) );
    }
}
