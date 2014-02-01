/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.DigitalInput;

import edu.wpi.first.wpilibj.Talon;
/**
 *
 * @author Developer
 */
public class ForkLift extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private static final float MOTOR_SPEED = 1.0f;
    public static final int MOTOR = 5;
    public static final int LOWER_LIMIT_SWITCH = 1;
    public static final int UPPER_LIMIT_SWITCH = 2;
    public static final int BALL_HIT_LIMIT_SWITCH_1 = 3;
    public static final int BALL_HIT_LIMIT_SWITCH_2 = 4;
    
    private DigitalInput upperLimitSwitch;
    private DigitalInput lowerLimitSwitch;
    private DigitalInput ballLimitSwitchOne;
    private DigitalInput ballLimitSwitchTwo;
    
    private Talon pwm;
    
    public ForkLift()
    {
        pwm = new Talon(MOTOR); 
        
        upperLimitSwitch = new DigitalInput(UPPER_LIMIT_SWITCH);
        lowerLimitSwitch = new DigitalInput(LOWER_LIMIT_SWITCH);
        ballLimitSwitchOne = new DigitalInput(BALL_HIT_LIMIT_SWITCH_1);
        ballLimitSwitchTwo = new DigitalInput(BALL_HIT_LIMIT_SWITCH_2);
    }
    
    public void liftBall()
    {
    
    }

    public void lowerForkLift()
    {
        
    }
    
    public boolean atLowerStop()
    {
        
    }
    
    public boolean atUpperStop()
    {
        
    }
    
    public boolean hitByBall()
    {
        
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
