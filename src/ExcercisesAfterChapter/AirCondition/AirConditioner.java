package ExcercisesAfterChapter.AirCondition;

/**
 * Created by BIURO22 on 2023-02-15
 */
public abstract class AirConditioner {

    protected double efficiency;

    public AirConditioner(double efficiency) {
        this.efficiency = efficiency;
    }


    protected double calculateCoolingEfficiency(double area) {
        return efficiency / area;
    }


    protected double coolingDown(double currentTemp, double coolingEfficiency) {
        return currentTemp -= coolingEfficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }
}
