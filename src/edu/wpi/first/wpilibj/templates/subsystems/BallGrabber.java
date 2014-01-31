/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
/**
 *
 * @author Coach
 */
public class BallGrabber extends Subsystem {
    public static Talon grabberMotor = new Talon(2,3);
    public static DigitalInput limit1 = new DigitalInput(2,1);
    public static DigitalInput limit2 = new DigitalInput(2,2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
