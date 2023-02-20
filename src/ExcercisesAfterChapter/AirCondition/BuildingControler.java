package ExcercisesAfterChapter.AirCondition;

/**
 * Created by BIURO22 on 2023-02-19
 */
public class BuildingControler {

    private final int NO_OF_ROOMS_IN_BULIDING = 4;


    public void printTempInBuilding(Room[] rooms) {
        for (Room room : rooms) {
            System.out.println("Temperature in room " + room.getName() + " :" + room.getCurrentTemp());
        }
    }

    public boolean isTemperatureInBuildingCorrect(Room[] rooms) {
        for (Room room : rooms) {
            if (room.getCurrentTemp() <= room.getTargetTemp()) {
                return true;
            }
        }
        return false;
    }

    public void cooling(Room[] rooms) {
        for(Room room : rooms) {
            if(room.getCurrentTemp() > room.getTargetTemp()) {
                room.startCooling();
            }
        }
    }


    public void mainTemperatureControlTool(Room[] rooms) throws InterruptedException {
        do {
            printTempInBuilding(rooms);
            cooling(rooms);
            Thread.sleep(1000);
        } while (isTemperatureInBuildingCorrect(rooms));
    }


    public int getNO_OF_ROOMS_IN_BULIDING() {
        return NO_OF_ROOMS_IN_BULIDING;
    }
}
