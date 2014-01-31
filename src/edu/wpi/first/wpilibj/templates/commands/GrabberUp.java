/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.subsystems.BallGrabber;
/**
 *
 * @author Coach
 */
public class GrabberUp extends CommandBase {
    
    public GrabberUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        BallGrabber.grabberMotor.set(.25);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return BallGrabber.limit1.get();
    }

    // Called once after isFinished returns true
    protected void end() {
        BallGrabber.grabberMotor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
