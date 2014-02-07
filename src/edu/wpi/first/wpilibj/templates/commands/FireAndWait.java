/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.subsystems.ForkLift;
/**
 *
 * @author en
 */
public class FireAndWait extends CommandBase {
    public static final float MOTOR_SPEED_DOWN = -.4f;
    public static final float MOTOR_SPEED_UP = .15f;
    private final int DOWN_MODE = 1;
    private final int WAIT_MODE = 2;
    private final int UP_MODE = 3;
    private final int NULL_MODE = 0;
    private int mode;
    
    public FireAndWait() {
        requires(OI.forkLift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        mode = DOWN_MODE;
        OI.forkLift.setMode(ForkLift.AUTOMATIC);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        System.out.println("LS:"+OI.forkLift.hitByBall());
        if (OI.forkLift.getMode() == ForkLift.MANUAL)
            return;
        switch(mode){
            case DOWN_MODE:
                
                if(OI.forkLift.atLowerStop()){
                    OI.forkLift.forkLiftStop();
                    mode = WAIT_MODE;
                } else {
                    OI.forkLift.lowerForkLift(MOTOR_SPEED_DOWN);
                }
                
            break;
            case WAIT_MODE:
                
                 if(OI.forkLift.hitByBall()) {
                     mode = UP_MODE;
                 }
                
            break;
            case UP_MODE:
                
                if(OI.forkLift.atUpperStop())
                {
                    OI.forkLift.forkLiftStop();
                    mode = NULL_MODE;
                    OI.forkLift.setMode(ForkLift.MANUAL);
                    
                    
                }
                else {
                    OI.forkLift.liftBall(MOTOR_SPEED_UP);
                }
                
            break;        
        }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (mode == NULL_MODE) {
            return true;
        }
        if (OI.forkLift.getMode() == ForkLift.MANUAL) {
            return true;
        }
        return OI.stick2.getRawButton(8);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}