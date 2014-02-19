package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author N8
 * 
 * The Hole class prevents a joystick from sending data if it is under a
 * certain threshold.  This allows for the robot to drive perfectly sideways or
 * forwards, and also keeps the motors from running at all when the joystick
 * isn't being operated.  To use the Hole class, just create an instance like
 * so:
 * singularity = new Hole(joystick,
 *                        xThreshold,
 *                        yThreshold,
 *                        zThreshold,
 *                        twistThreshold)
 * then wherever you happen to call joystick.getX() or joystick.getY()
 * (or Z or twist), call singularity.getX() or singularity.getY()
 * (or Z or twist).  NB: If the value is -equal- to the threshold, it will
 * return the value, not 0.
 */
public class Hole {
    
    Joystick joystick;
    double xThreshold = 0.0, yThreshold = 0.0, zThreshold = 0.0,
           twistThreshold = 0.0;
    
    /**
     * Create the hole.
     * 
     * @param joystick The joystick to use for value fetching.
     * @param xThreshold The minimum x value that will escape the hole.
     * @param yThreshold The minimum y value that will escape the hole.
     * @param zThreshold The minimum z value that will escape the hole.
     * @param twistThreshold The minimum twist that will escape the hole.
     */
    public Hole(Joystick joystick,
                double xThreshold,
                double yThreshold,
                double zThreshold,
                double twistThreshold)
    {
        this.joystick = joystick;
        this.xThreshold = xThreshold;
        this.yThreshold = yThreshold;
    }
    
    /**
     * An internal function to limit values, used to avoid repetitive code.
     * 
     * @param value The value to be limited
     * @param threshold The minimum value that can escape the hole.
     * @return The limited value.
     */
    private double limitValue(double value, double threshold)
    {
        if (value >= threshold || -value >= threshold)
        {
            return value;
        }
        else
        {
            return 0.0;
        }
    }
    
    /**
     * Get the x value of the joystick as evaluated by the hole.
     * @return The x value of the joystick or 0.0.
     */
    public double getX()
    {
        return limitValue(joystick.getX(), xThreshold);
    }
    
    /**
     * Get the y value of the joystick as evaluated by the hole.
     * @return The y value of the joystick or 0.0.
     */
    public double getY()
    {
        return limitValue(joystick.getY(), yThreshold);
    }
    
    /**
     * Get the z value of the joystick as evaluated by the hole.
     * @return The z value of the joystick or 0.0.
     */
    public double getZ()
    {
        return limitValue(joystick.getZ(), zThreshold);
    }
    
   /**
     * Get the z value of the joystick as evaluated by the hole.
     * @return The z value of the joystick or 0.0.
     */
    public double getTwist()
    {
        return limitValue(joystick.getTwist(), twistThreshold);
    }
}
