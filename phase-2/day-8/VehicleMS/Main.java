public class Main
{
    public static void main(String gg[])
    {
    Bike b=new Bike();
    b.setVehicleNumber("MP 09 1244");
    b.setPassingFrom("Indore");
    b.setOwnerName("Sufiyan Nagori");
    b.setModel("2026");
    b.setColor("blue");
    b.setEngineCC(150);
    b.setHasGear(true);
    b.setBikeType("sport bike");
System.out.println("********************Bike*********************");
System.out.println("Vehicle Number :"+b.getVehicleNumber());
System.out.println("Passing From :"+b.getPassingFrom());
System.out.println("Owner Name :"+b.getOwnerName());
System.out.println("Model :"+b.getModel());
System.out.println("Color :"+b.getColor());
System.out.println("Engine CC:"+b.getEngineCC());
System.out.println("Is Gear Exists :"+b.isHasGear());
System.out.println("Bike Type :"+b.getBikeType());



Car c=new Car();
    c.setVehicleNumber("MP 09 11122");
    c.setPassingFrom("Ujjain");
    c.setOwnerName("Sufiyan Nagori");
    c.setModel("2026");
    c.setColor("black");
    c.setNumberOfDoors(4);
    c.setSeatingCapacity(4);
    c.setFuelType("patrol");

System.out.println("********************Car*********************");

System.out.println("Vehicle Number :"+c.getVehicleNumber());
System.out.println("Passing From :"+c.getPassingFrom());
System.out.println("Owner Name :"+c.getOwnerName());
System.out.println("Model :"+c.getModel());
System.out.println("Color :"+c.getColor());
System.out.println("Number Of Doors :"+c.getNumberOfDoors());
System.out.println("Sitting capacity  :"+c.getSeatingCapacity());
System.out.println("Fuel Type :"+c.getFuelType());

System.out.println("********************Truck*********************");


Truck t=new Truck();
    t.setVehicleNumber("MP 09 1353");
    t.setPassingFrom("Rajasthan");
    t.setOwnerName("Sufiyan Nagori");
    t.setModel("2026");
    t.setColor("Yellow");
    t.setTruckType("container truck");
    t.setLoadCapacity(20.5);
    t.setNumberOfWheels(16);



System.out.println("Vehicle Number :"+t.getVehicleNumber());
System.out.println("Passing From :"+t.getPassingFrom());
System.out.println("Owner Name :"+t.getOwnerName());
System.out.println("Model :"+t.getModel());
System.out.println("Color :"+t.getColor());
System.out.println("Truck type :"+t.getTruckType());
System.out.println("Load Capacity  :"+t.getLoadCapacity());
System.out.println("Number Of Wheels :"+t.getNumberOfWheels());

    }
}