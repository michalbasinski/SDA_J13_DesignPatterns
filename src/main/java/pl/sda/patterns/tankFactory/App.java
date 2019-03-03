package pl.sda.patterns.tankFactory;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<Requirements, Object> requirementsForTank = new HashMap<>();
        requirementsForTank.put(Requirements.CALIBER, 125);
        requirementsForTank.put(Requirements.SPEED, 50);
        requirementsForTank.put(Requirements.OPERATIONAL_RANGE,200);
        requirementsForTank.put(Requirements.ARMOR, 500);

        TankFactory factory = new TankFactory();
        Tank tank = factory.produce(requirementsForTank);

        if (tank != null){
            System.out.println("Wyprodukowano " + tank.getClass());
        } else {
            System.out.println("Żaden czołg nie spełnia wymagań");
        }
    }
}
