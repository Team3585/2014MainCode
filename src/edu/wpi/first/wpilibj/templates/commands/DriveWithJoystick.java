/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.subsystems.Chassis;

/**
 * Drives the chassis around with the joystick.
 * @author Nate "N8" Page
 */
public class DriveWithJoystick extends CommandBase {
    
    public DriveWithJoystick() {
        // Use requires() here to declare subsystem dependencies
        requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Chassis.drive.setMaxOutput(.75);
        Chassis.driveWithJoystick(OI.getStick());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
