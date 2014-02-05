/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;

/**
 *
 * @author Developer
 */
public class UpperForkLift extends CommandBase {
    
    public static final float MOTOR_UP_SPEED = .5f;

    
    public UpperForkLift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       OI.forkLift.liftBall(MOTOR_UP_SPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (OI.forkLift.atUpperStop() || !OI.raiseForkLiftButton.get());
    }

    // Called once after isFinished returns true
    protected void end() {
        OI.forkLift.forkLiftStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
