public class Bike extends Vehicle {
    private int engineCC;
    private boolean hasGear;
    private String bikeType;
public int getEngineCC() {
    return engineCC;
}

public void setEngineCC(int engineCC) {
    this.engineCC = engineCC;
}

public boolean isHasGear() {
    return hasGear;
}

public void setHasGear(boolean hasGear) {
    this.hasGear = hasGear;
}

public String getBikeType() {
    return bikeType;
}

public void setBikeType(String bikeType) {
    this.bikeType = bikeType;
}
}