/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.SonicTest;
import edu.wpi.first.wpilibj.AnalogChannel;

/**
 *
 * @author en
 */
public class SensorBase extends Subsystem {
    
public static AnalogChannel sonic = new AnalogChannel(1);



    public void initDefaultCommand() {
        setDefaultCommand(new SonicTest());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}