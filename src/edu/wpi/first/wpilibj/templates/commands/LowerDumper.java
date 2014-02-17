/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;

/**
 *
 * @author en
 */
public class LowerDumper extends CommandBase {
    
    public LowerDumper() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        OI.dumper.DumperDown();
        System.out.println("DumperDown");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (!OI.dumper.AtLowerStop() || !OI.lowerDumperButton.get());
        //return (!OI.lowerDumperButton.get());
    }

    // Called once after isFinished returns true
    protected void end() {
        OI.dumper.DumperStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}