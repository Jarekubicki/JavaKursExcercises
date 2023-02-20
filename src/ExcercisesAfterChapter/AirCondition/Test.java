package ExcercisesAfterChapter.AirCondition;

/**
 * Created by BIURO22 on 2023-02-16
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        AirConditioner basicAirConditioner = new BasicAirConditioner();
        AirConditioner proAirConditioner = new ProAirConditioner();
        BuildingControler buildingControler = new BuildingControler();

        Room[] rooms = new Room[buildingControler.getNO_OF_ROOMS_IN_BULIDING()];

        rooms[0] = new Room("room 1", 20, basicAirConditioner, 30.3, 26);;
        rooms[1] = new Room("room 2", 32, basicAirConditioner, 24, 25);
        rooms[2] = new Room("room 3", 14, basicAirConditioner, 26, 25);
        rooms[3] = new Room("room 4", 22, proAirConditioner, 25, 24);

        buildingControler.mainTemperatureControlTool(rooms);

    }
}
