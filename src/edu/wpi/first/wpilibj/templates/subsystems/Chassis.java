/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;
/**
 *
 * @author Coach
 */
public class Chassis extends Subsystem {
   public static final int victorPortFrontLeft = 1;
   public static final int victorPortBackLeft = 2;
   public static final int victorPortFrontRight = 3;
   public static final int victorPortBackRight = 4;
  
   public static Victor vic1 = new Victor(victorPortFrontLeft);
   public static Victor vic2 = new Victor(victorPortBackLeft);
   public static Victor vic3 = new Victor(victorPortFrontRight);
   public static Victor vic4 = new Victor(victorPortBackRight);
   public static RobotDrive drive = new RobotDrive(vic1, vic2, vic3, vic4);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
