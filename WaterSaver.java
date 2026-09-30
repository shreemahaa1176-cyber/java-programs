public class WaterSaver {

    void tips() {
        System.out.println("Turn off tap while brushing, Reuse water");
    }

    public static void main(String[] args) {

        // Creating 5 objects
        WaterSaver w1 = new WaterSaver();
        WaterSaver w2 = new WaterSaver();
        WaterSaver w3 = new WaterSaver();
        WaterSaver w4 = new WaterSaver();
        WaterSaver w5 = new WaterSaver();

        // Calling method for each object
        w1.tips();
        w2.tips();
        w3.tips();
        w4.tips();
        w5.tips();

        // Bucket water level
        int waterLevel = 5;

        // Reduce water by 1 litre until it reaches 0
        while (waterLevel > 0) {
            waterLevel--;
        }

        System.out.println("Bucket Empty");
    }
}