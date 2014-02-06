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
 * @author Rogue Robots of 4H
 */
public class Dumper extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private static final float MOTOR_SPEED = 1.0f;
    public static final int MOTOR = 7;
    public static final int LIMIT_SWITCH_TOP = 7;
    public static final int LIMIT_SWITCH_BOTTOM = 8;
    
    public static DigitalInput topLimitSwitch;
    public static DigitalInput bottomLimitSwitch;
    
    public static Talon dumperMotor;
    
    public Dumper()
    {
                dumperMotor = new Talon(MOTOR);
                
                topLimitSwitch = new DigitalInput(LIMIT_SWITCH_TOP);
                bottomLimitSwitch = new DigitalInput (LIMIT_SWITCH_BOTTOM);
    }
    public void DumperStop()
    {
        dumperMotor.set(0);
    }
    
    public void DumperUp()
    {
        dumperMotor.set(.5);
    }
    
    public void DumperDown()
    {
        dumperMotor.set(-.5);
    }
    
    public boolean AtUpperStop()
    {
        return(topLimitSwitch.get());
    }
    
    public boolean AtLowerStop()
    {
        return(bottomLimitSwitch.get());   
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
