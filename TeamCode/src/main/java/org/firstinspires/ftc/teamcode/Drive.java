package org.firstinspires.ftc.teamcode;

/**
 * Created by David on 10/22/2017.
 */

public class Drive
{
    RobotHardware robot;

    public Drive(RobotHardware robot)
    {
        this.robot = robot;
    }

    public void stop()
    {
        robot.front_left.setPower(0);
        robot.front_right.setPower(0);
        robot.back_right.setPower(0);
        robot.back_left.setPower(0);
    }
}
