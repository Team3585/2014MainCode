/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.BALL_HIT_LIMIT_SWITCH_1;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.BALL_HIT_LIMIT_SWITCH_2;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.LOWER_LIMIT_SWITCH;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.MOTOR;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.UPPER_LIMIT_SWITCH;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.ballLimitSwitchOne;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.ballLimitSwitchTwo;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.forkMotor;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.lowerLimitSwitch;
import static edu.wpi.first.wpilibj.templates.subsystems.ForkLift.upperLimitSwitch;

/**
 *
 * @author en
 */
public class Goalie extends Subsystem {
    public static final float MOTOR_SPEED = 1.0f;
    public static final int GOAL_MOTOR = 6;
    public static final int LOWER_LIMIT_SWITCH = 5;
    public static final int UPPER_LIMIT_SWITCH = 6;
    
    public static DigitalInput goalUpLimitSwitch;
    public static  DigitalInput goalDownLimitSwitch;
    
    public static Talon goalieMotor;
    
    public Goalie(){
           
        goalieMotor = new Talon(GOAL_MOTOR); 
        
        goalUpLimitSwitch = new DigitalInput(UPPER_LIMIT_SWITCH);
        goalDownLimitSwitch = new DigitalInput(LOWER_LIMIT_SWITCH);
        ballLimitSwitchOne = new DigitalInput(BALL_HIT_LIMIT_SWITCH_1);
        ballLimitSwitchTwo = new DigitalInput(BALL_HIT_LIMIT_SWITCH_2);
        
        
    
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