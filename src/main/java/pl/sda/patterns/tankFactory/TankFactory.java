package pl.sda.patterns.tankFactory;

import java.util.Map;

public class TankFactory {

    public Tank produce(Map<Requirements, Object> requirements) {
        Integer caliber = (Integer) requirements.get(Requirements.CALIBER);
        Integer speed = (Integer) requirements.get(Requirements.SPEED);
        Integer armor = (Integer) requirements.get(Requirements.ARMOR);
        Integer operationalRange = (Integer) requirements.get(Requirements.OPERATIONAL_RANGE);

        if (caliber == 120 && armor < 700 && operationalRange <= 200 && speed <= 50) {
            return new AbramsM1A4();
        }
        if (caliber == 105 && armor < 700 && operationalRange <= 200 && speed <= 50) {
            return new Leopard2A6();
        }
        if (caliber == 125 && armor < 700 && operationalRange <= 200 && speed <= 50) {
            return new T72M();
        }
        return null;
    }
}
