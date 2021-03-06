package org.usfirst.frc.team852.robot.data;

public enum DataType {
    CameraGear("Camera gear"),
    LeftLidar("Left lidar"),
    RightLidar("Right lidar"),
    FrontLidar("Front lidar"),
    RearLidar("Rear lidar"),
    Heading("Heading");

    private final String updateMsg;
    private final String alreadyReadMsg;

    DataType(String msg) {
        this.updateMsg = String.format("Updated %s data", msg.toLowerCase());
        this.alreadyReadMsg = String.format("%s data already read", msg);
    }

    public String getUpdateMsg() {
        return this.updateMsg;
    }

    public String getAlreadyReadMsg() {
        return this.alreadyReadMsg;
    }
}
