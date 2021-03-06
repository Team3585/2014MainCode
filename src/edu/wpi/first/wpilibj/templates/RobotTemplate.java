/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.templates.subsystems.Chassis;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Command teleopDriveCommand;
    
    

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        teleopDriveCommand = new DriveWithJoystick();

        // Initialize all subsystems
        CommandBase.init();
    }

    public void teleopInit() {
        teleopDriveCommand.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        if (!(isEnabled() && isOperatorControl()))
        {
            teleopDriveCommand.cancel();
        }
        else
        {
            Scheduler.getInstance().run();
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        
        LiveWindow.run();
    }

    public void autonomousInit() {
     /*   
        Chassis.drive.drive(.5,0);
        Timer.delay(4);
        Chassis.drive.drive(0,0);
        Timer.delay(1);
        OI.dumper.DumperDown();
        Timer.delay(5);
        Chassis.drive.drive(-.5,0);
      */
  }
  
}