/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.subsystems.Goalie;

/**
 *
 * @author Developer
 */
public class GoalieDown extends CommandBase {
    
    public GoalieDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        OI.goalie.GoalieDown();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (!OI.goalie.atGoalieDownStop() || !OI.lowerGoalieButton.get());
    }

    // Called once after isFinished returns true
    protected void end() {
        OI.goalie.GoalieStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
