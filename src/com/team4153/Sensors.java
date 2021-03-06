package com.team4153;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public abstract class Sensors {

    private static Joystick joystick;
    private static Button triggerButton;
    private static Button gyroReset;
    private static Gyro gyro;

    public Sensors() {
        
    }
    
    public static Joystick getJoystick() {
        if(joystick == null){
            joystick = new Joystick(RobotMap.JOYSTICK_PORT);
        }
        return joystick;
    }

    public static Button getTriggerButton() {
        if(triggerButton == null){
            triggerButton = new JoystickButton(joystick, RobotMap.JSBUTTON_TRIGGER);
        }
        return triggerButton;
    }
    
    public static Button getGyroResetButton() {
        if(gyroReset == null){
            gyroReset = new JoystickButton(joystick,RobotMap.JSBUTTON_GYRO_RESET);
        }
        return gyroReset;
    }
    
    public static Gyro getGyro() {
        if(gyro == null){
            gyro = new Gyro(RobotMap.GYRO_CHANNEL);
        }
        return gyro;
    }
}
