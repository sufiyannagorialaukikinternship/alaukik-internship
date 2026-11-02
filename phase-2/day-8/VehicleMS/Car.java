public class Car extends Vehicle {
    private int numberOfDoors;
    private int seatingCapacity;
    private String fuelType;
public int getNumberOfDoors() {
    return numberOfDoors;
}

public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
}

public int getSeatingCapacity() {
    return seatingCapacity;
}

public void setSeatingCapacity(int seatingCapacity) {
    this.seatingCapacity = seatingCapacity;
}

public String getFuelType() {
    return fuelType;
}

public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
}
}