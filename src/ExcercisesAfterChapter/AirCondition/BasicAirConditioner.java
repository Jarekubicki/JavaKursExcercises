package ExcercisesAfterChapter.AirCondition;

/**
 * Created by BIURO22 on 2023-02-15
 */
public class BasicAirConditioner extends AirConditioner {

    public BasicAirConditioner() {
        super(1);
    }

    public double calculateCoolingEfficiency(double area) {
        return efficiency / area;
    }

    @Override
    public double coolingDown(double roomTempInside, double coolingEfficiency) {
        return super.coolingDown(roomTempInside, coolingEfficiency);
    }

}
