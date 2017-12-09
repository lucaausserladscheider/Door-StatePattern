public class OpenState implements DoorState {

    private Door door;

    public OpenState(Door door) {
        this.door = door;
    }

    @Override
    public void openDoor () {
        System.out.println ("Du kannst die Türe nicht öffnen, da sie bereits offen ist");
    }

    @Override
    public void closeDoor () {
        System.out.println ("Du hast die Türe erfolgreich geschlossen!");
        door.setDoorState ( new ClosedAndUnlockedState (door) );
    }

    @Override
    public void lockDoor () {
        System.out.println ("Du kannst die Türe nicht absperren, weil sie offen ist!");
    }

    @Override
    public void unlockDoor () {
        System.out.println ("Du kannst die Türe nicht aufsperren, weil sie gerade offen ist!");
    }
    @Override
    public void smashDoor () {
        System.out.println ("Du hast eine offene Türe eigetreten!");
        door.setDoorState ( new SmashedState (door) );
    }
}
