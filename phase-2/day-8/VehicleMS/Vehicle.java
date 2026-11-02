public class Vehicle
{
    private String vehicleNumber;
    private String passingFrom;
    private String ownerName;
    private String model;
    private String color;
    
    public String getVehicleNumber() {
    return vehicleNumber;
}

public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
}

public String getPassingFrom() {
    return passingFrom;
}

public void setPassingFrom(String passingFrom) {
    this.passingFrom = passingFrom;
}

public String getOwnerName() {
    return ownerName;
}

public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
}
public void setModel(String model)
{
    this.model=model;
}
public  String getModel()
{
    return this.model;
}
public void setColor(String color)
{
    this.color=color;
}
public String getColor()
{
    return this.color;
}
}