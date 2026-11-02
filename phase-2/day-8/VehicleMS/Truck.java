public class Truck extends Vehicle {
    private double loadCapacity;
    private int numberOfWheels;
    private String truckType;
    
    public void setLoadCapacity(double loadCapacity)
    {
        this.loadCapacity=loadCapacity;
    }
    public double getLoadCapacity()
    {
        return this.loadCapacity;
    }
    public void setNumberOfWheels(int numberOfWheels)
    {
        this.numberOfWheels=numberOfWheels;
    }
    public int getNumberOfWheels()
    {
        return this.numberOfWheels;
    }
    public void setTruckType(String truckType)
    {
     this.truckType=truckType;
    }
    public String getTruckType()
    {
        return this.truckType;
    }
    }