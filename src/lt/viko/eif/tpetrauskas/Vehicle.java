package lt.viko.eif.tpetrauskas;

public class Vehicle {
    private int currentSpeed;
    private int maxSpeed;
    private final int MIN_SPEED = 0;

    public Vehicle(int maxSpeed) {
        this.currentSpeed = MIN_SPEED;
        this.maxSpeed = maxSpeed;
    }

    public void increaseSpeed(int speed) {
        if(getCurrentSpeed() + speed <= maxSpeed) {
            setCurrentSpeed(getCurrentSpeed() + speed);
            System.out.println("Your current speed is " + getCurrentSpeed() + "km/h.");
            if(getCurrentSpeed() + speed == maxSpeed) {
                System.out.println("You have reached your car's top speed " + getMaxSpeed() + "km/h.");
            }
        } else {
            setCurrentSpeed(getMaxSpeed());
            System.out.println("You have already reached your car's top speed " + getMaxSpeed() + "km/h.");
        }
    }

    public void decreaseSpeed(int speed) {
        if(getCurrentSpeed() - speed >= 0) {
            setCurrentSpeed(getCurrentSpeed() - speed);
            System.out.println("Your current speed is " + getCurrentSpeed() + "km/h.");
            if(getCurrentSpeed() - speed == 0) {
                System.out.println("Your car has stopped.");
            }
        } else {
            System.out.println("Your car has stopped.");
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMIN_SPEED() {
        return MIN_SPEED;
    }
}
