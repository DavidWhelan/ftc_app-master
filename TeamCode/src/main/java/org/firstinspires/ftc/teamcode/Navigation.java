package org.firstinspires.ftc.teamcode;

/**
 * Created by David on 10/1/2017.
 */

public class Navigation
{
    private int units_per_point = 12;
    private int encoder_ticks_per_inch;

    private double calculate_distance(double x1, double y1, double x2, double y2)
    {
        double change_in_x = Math.abs(x2-x1);
        double change_in_y = Math.abs(y2-y1);
        double distance = Math.sqrt((change_in_x*change_in_x)+(change_in_y*change_in_y));
        distance = distance * units_per_point;
        return distance;
    }

    private double calculate_heading(double x1, double y1, double x2, double y2)
    {
        double x_distance = x2-x1;
        double y_distance = y2-y1;
        if(x_distance == 0)
        {
            return 0;
        }
        else if(y_distance == 0)
        {
            if(x_distance < 0)
            {
                return -90;
            }
            else
            {
                return 90;
            }
        }
        else if(y_distance < 0)
        {
            double heading = Math.atan(y_distance/x_distance) * -1;
            return heading + 90*(y_distance/Math.abs(y_distance));
        }
        return Math.atan(y_distance/x_distance);
    }

}
