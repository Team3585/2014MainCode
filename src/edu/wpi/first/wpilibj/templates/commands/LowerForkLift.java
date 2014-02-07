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
public class LowerForkLift extends CommandBase {
    
    public static final float MOTOR_DOWN_SPEED = -.4f;
    
    public LowerForkLift() {
        super("LowerForkLift");
        // Use requires() here to declare subsystem dependencies
   //     requires(OI.forkLift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        OI.forkLift.lowerForkLift(MOTOR_DOWN_SPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return(OI.forkLift.atLowerStop() || !OI.lowerForkLiftButton.get());
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
