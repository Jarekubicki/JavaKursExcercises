package ExcercisesAfterChapter.AirCondition;

/**
 * Created by BIURO22 on 2023-02-15
 */
public class Room {

    private String name;
    private double area;
    private AirConditioner airConditioner;
    private double currentTemp;
    private double targetTemp;
    double coolingRate;


    public Room(String name, double area, AirConditioner airConditioner, double currentTemp,
                double targetTemp) {
        this.name = name;
        this.area = area;
        this.airConditioner = airConditioner;
        this.currentTemp = currentTemp;
        this.targetTemp = targetTemp;
        this.coolingRate = airConditioner.efficiency / area;
    }


    public void startCooling() {
        currentTemp = airConditioner.coolingDown(currentTemp, coolingRate);
    }

    public void stopCooling() {
        System.out.println("Air Conditioning off in room " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public double getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(double targetTemp) {
        this.targetTemp = targetTemp;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }
}
