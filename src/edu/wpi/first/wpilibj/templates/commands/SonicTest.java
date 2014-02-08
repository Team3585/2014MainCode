/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.subsystems.SensorBase;

/**
 *
 * @author en
 */
public class SonicTest extends CommandBase {
    
    private static int SONIC_RANGE = 12;
    public SonicTest() {
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (SensorBase.sonic.getVoltage() < SONIC_RANGE) {
            System.out.println("Ultrasonic: AtRange:"+SensorBase.sonic.getVoltage()*9.766);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return OI.stick2.getRawButton(4);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
