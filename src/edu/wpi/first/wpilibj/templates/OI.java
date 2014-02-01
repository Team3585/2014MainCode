
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.templates.subsystems.ForkLift;
import edu.wpi.first.wpilibj.templates.subsystems.Dumper;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.subsystems.Goalie;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public static final int JOYSTICK_PORT_1 = 2;
    
    private static Joystick driveStick = null;
    public static Joystick stick2 = new Joystick(2);
    public static JoystickButton raiseForkLiftButton = new JoystickButton(stick2,1);
    public static JoystickButton lowerForkLiftButton = new JoystickButton(stick2,2);
    public static JoystickButton raiseDumperButton = new JoystickButton(stick2,3);
    public static JoystickButton lowerDumperButton = new JoystickButton(stick2,4);
    public static JoystickButton raiseGoalieButton = new JoystickButton(stick2,5);
    public static JoystickButton lowerGoalieButton = new JoystickButton(stick2,6);
    public static Goalie goalie = new Goalie();
    public static ForkLift forkLift = new ForkLift();
    public static Dumper dumper = new Dumper();
    public static Joystick getStick() {
        if (driveStick == null) {
            driveStick = new Joystick(JOYSTICK_PORT_1);
        }
        
        return driveStick;
        raiseForkLiftButton.whenPressed(new UpperForkLift());
    }
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

