/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author en
 */
public class Goalie extends Subsystem {
    public static final float MOTOR_SPEED = 1.0f;
    public static final int GOAL_MOTOR = 6;
    public static final int LOWER_LIMIT_SWITCH = 13;
    public static final int UPPER_LIMIT_SWITCH = 14;
    
    public static DigitalInput goalUpLimitSwitch;
    public static  DigitalInput goalDownLimitSwitch;
    
    public static Talon goalieMotor;
    
    public Goalie(){
           
        goalieMotor = new Talon(GOAL_MOTOR); 
        
        goalUpLimitSwitch = new DigitalInput(UPPER_LIMIT_SWITCH);
        goalDownLimitSwitch = new DigitalInput(LOWER_LIMIT_SWITCH);
        
        
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    }
    public void GoalieUp(){
    goalieMotor.set(.5);
    }
    public void GoalieDown(){
    goalieMotor.set(-.5);
    
    }
    public void GoalieStop(){
    goalieMotor.set(0);
    
    }
    public boolean atGoalieUpStop(){
        return(goalUpLimitSwitch.get());
    }
    public boolean atGoalieDownStop(){
        return(goalDownLimitSwitch.get());
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}