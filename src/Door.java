public class Door {
    private DoorState doorState;

    public Door() {
        doorState = new ClosedAndLockedState (this);
    }

    public DoorState getDoorState () {
        return doorState;
    }

    public void setDoorState ( DoorState doorState ) {
        this.doorState = doorState;
    }
}
