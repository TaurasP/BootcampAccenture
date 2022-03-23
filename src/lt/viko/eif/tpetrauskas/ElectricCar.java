package lt.viko.eif.tpetrauskas;

public class ElectricCar extends Car{
    private String manufacturer;
    private String model;
    private int electricRange;

    public ElectricCar(int maxSpeed, char numberOfGears, char currentGear, String manufacturer, String model, int electricRange) {
        super(maxSpeed, numberOfGears, currentGear);
        this.manufacturer = manufacturer;
        this.model = model;
        this.electricRange = electricRange;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getElectricRange() {
        return electricRange;
    }

    public void setElectricRange(int electricRange) {
        this.electricRange = electricRange;
    }
}
