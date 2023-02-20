package ExcercisesAfterChapter.AirCondition;

/**
 * Created by BIURO22 on 2023-02-16
 */
public class ProAirConditioner extends AirConditioner {


    public ProAirConditioner() {
        super(2);
    }

    @Override
    protected double calculateCoolingEfficiency(double roomArea) {
        return super.calculateCoolingEfficiency(roomArea);
    }


    @Override
    protected double coolingDown(double roomTempInside, double coolingEfficiency) {
        return super.coolingDown(roomTempInside, coolingEfficiency);
    }

}

