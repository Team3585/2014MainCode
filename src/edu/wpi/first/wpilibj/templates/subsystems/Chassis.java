package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;

/**
 * Defines the Chassis class, which defines the chassis of the robot.
 * @author Nate "N8" Page
 */
public class Chassis extends Subsystem {
    
    public static final int VICTOR_PORT_1 = 1;
    public static final int VICTOR_PORT_2 = 2;
    public static final int VICTOR_PORT_3 = 3;
    public static final int VICTOR_PORT_4 = 4;
    public static final int VICTOR_PORT_5 = 1;
    public static final int VICTOR_PORT_6 = 3;
    public static final int VICTOR_PORT_7 = 5;
    public static final int VICTOR_PORT_8 = 7;

    
    public static final Victor victor1 = new Victor(VICTOR_PORT_1);    
    public static final Victor victor2 = new Victor(VICTOR_PORT_2);    
    public static final Victor victor3 = new Victor(VICTOR_PORT_3);    
    public static final Victor victor4 = new Victor(VICTOR_PORT_4);
 //   public static Victor victor5 = new Victor(VICTOR_PORT_5);    
 //   public static Victor victor6 = new Victor(VICTOR_PORT_6);    
 //   public static Victor victor7 = new Victor(VICTOR_PORT_7);    
 //   public static Victor victor8 = new Victor(VICTOR_PORT_8);
    public static RobotDrive drive = new RobotDrive(victor1, victor2, victor3, victor4);
   // public static RobotDrive drive2 = new RobotDrive(victor1, victor2, victor3, victor4);

    
    public static RobotDrive getDrive() {
        if (drive == null)
        {
            drive = new RobotDrive(victor1, victor2, victor3, victor4);
        }
        return drive;
    }
    
 
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
         setDefaultCommand(new DriveWithJoystick());
                 
    }
    
    public static void driveWithJoystick(Joystick driveStick) {
//          drive.mecanumDrive_Polar(
//                driveStick.getZ(),
//                driveStick.getX(),
//                driveStick.getY()
//                );
        drive.mecanumDrive_Cartesian(
                OI.joyThresh.getX(),
                OI.joyThresh.getZ(),
                OI.joyThresh.getY(),
                0
                );
                
    }
}