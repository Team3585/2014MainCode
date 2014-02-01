/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.commands.FireAndWait;
/**
 *
 * @author Developer
 */
public class ForkLift extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    

    public static final int MOTOR = 5;
    public static final int LOWER_LIMIT_SWITCH = 1;
    public static final int UPPER_LIMIT_SWITCH = 2;
    public static final int BALL_HIT_LIMIT_SWITCH_1 = 3;
    public static final int BALL_HIT_LIMIT_SWITCH_2 = 4;
    
    public static DigitalInput upperLimitSwitch;
    public static  DigitalInput lowerLimitSwitch;
    public static DigitalInput ballLimitSwitchOne;
    public static DigitalInput ballLimitSwitchTwo;
    
   
    
    public static Talon forkMotor;
    
    private int mode; 
    public final static int AUTOMATIC = 1;
    public static final int MANUAL = 2;

    public ForkLift() {
        forkMotor = new Talon(MOTOR); 
        
        upperLimitSwitch = new DigitalInput(UPPER_LIMIT_SWITCH);
        lowerLimitSwitch = new DigitalInput(LOWER_LIMIT_SWITCH);
        ballLimitSwitchOne = new DigitalInput(BALL_HIT_LIMIT_SWITCH_1);
        ballLimitSwitchTwo = new DigitalInput(BALL_HIT_LIMIT_SWITCH_2);
        mode = MANUAL;
    }
    public void setMode(int mode){
        this.mode = mode;
                
    }
    public int getMode(){
        return(mode);
    }
    public void forkLiftStop()
    {
        forkMotor.set(0);
    }
    public void liftBall()
    {
        forkMotor.set(FireAndWait.MOTOR_SPEED_UP);
    }

    public void lowerForkLift()
    {
        forkMotor.set(FireAndWait.MOTOR_SPEED_DOWN);
    }
    
    public boolean atLowerStop()
    {
        return(lowerLimitSwitch.get());
    }
    
    public boolean atUpperStop()
    {
        return(upperLimitSwitch.get());
    }
    
    public boolean hitByBall()
    {
        return(true);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
