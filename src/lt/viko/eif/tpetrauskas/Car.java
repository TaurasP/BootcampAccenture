package lt.viko.eif.tpetrauskas;

public class Car extends Vehicle{
    private String direction;
    private int numberOfGears;
    private char currentGear;

    public Car(int maxSpeed, int numberOfGears, char currentGear) {
        super(maxSpeed);
        this.numberOfGears = numberOfGears;
        this.currentGear = currentGear;
    }

    public void steer(String direction) {
        setDirection(direction);
        System.out.println("Car moves " + direction);
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void changeGears(char newGear) {
        setCurrentGear(newGear);
        System.out.println("Currently car is in " + newGear + " gear.");
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(char currentGear) {
        this.currentGear = currentGear;
    }
}
