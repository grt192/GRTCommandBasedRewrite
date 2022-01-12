package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

public class JetsonConnection {

    public static String TABLE_NAME = "jetson";
    private NetworkTable table;

    public JetsonConnection() {
        table = NetworkTableInstance.getDefault().getTable(TABLE_NAME);
    }

    /**
     * Runs periodically in a Thread. Put print lines in here or whatever else you
     * want.
     */
    public void periodic() {

        System.out.println("test: " + getString("test"));
        System.out.println("test exists? " + hasKey("test"));
        System.out.println("xCentroid: " + getDouble("xCentroid"));
        System.out.println("yCentroid: " + getDouble("yCentroid"));
        System.out.println("pitchAngle: " + getDouble("pitchAngles"));
        System.out.println("yawAngle: " + getDouble("yawAngle"));

    }

    public boolean hasKey(String key) {
        return table.getEntry(key).exists();
    }

    public String getString(String key) {
        return table.getEntry(key).getString("hi");
    }

    public double getDouble(String key) {
        System.out.println("/" + TABLE_NAME + "/" + key + " = " + table.getEntry(key).getDouble(0));
        return table.getEntry(key).getDouble(0);
    }

    public double[] getDoubleArray(String key) {
        Number[] numArr = table.getEntry(key).getNumberArray(new Number[0]);

        double[] arr = new double[0];
        for (int i = 0; i < numArr.length; i++) {
            arr[i] = numArr[i].doubleValue();
        }
        return arr;
    }

}
