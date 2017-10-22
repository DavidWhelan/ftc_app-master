

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name="Teleop", group="Tech Hogs")

public class Teleop extends OpMode
{
    RobotHardware robot = new RobotHardware();
    Drive drive = new Drive(robot);

    @Override
    public void init()
    {
        robot.init_hardware(hardwareMap);
    }


    @Override
    public void init_loop()
    {

    }


    @Override
    public void start()
    {

    }


    @Override
    public void loop()
    {
        /////////////////////////////////////////////////////////////

        double left_X = gamepad1.left_stick_x;
        double left_Y = gamepad1.left_stick_y;

        robot.front_left.setPower(left_Y + left_X);
        robot.back_left.setPower(left_Y + left_X);
        robot.front_right.setPower(left_Y - left_X);
        robot.back_right.setPower(left_Y - left_X);

        /////////////////////////////////////////////////////////////
    }


    @Override
    public void stop()
    {
        drive.stop();
    }

}
