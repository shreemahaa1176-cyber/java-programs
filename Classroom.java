public class Classroom {

    void class_rules() {
        System.out.println("Maintain silence, Submit homework on time");
    }

    public static void main(String[] args) {

        // Creating 4 objects
        Classroom c1 = new Classroom();
        Classroom c2 = new Classroom();
        Classroom c3 = new Classroom();
        Classroom c4 = new Classroom();

        // Calling method for each classroom
        c1.class_rules();
        c2.class_rules();
        c3.class_rules();
        c4.class_rules();

        // Attendance counts
        int[] attendance = {40, 35, 40, 38, 40};

        // Checking attendance
        for (int count : attendance) {
            if (count == 40) {
                System.out.println("Full Attendance");
            }
        }
    }
}