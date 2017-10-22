package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by David on 10/22/2017.
 */

public class RobotHardware
{
    public DcMotor
            front_left = null,
            front_right = null,
            back_left = null,
            back_right = null;

    HardwareMap hwmap;

    public RobotHardware()
    {

    }

    public void init_hardware(HardwareMap ahwmap)
    {
        hwmap = ahwmap;

        front_left = hwmap.dcMotor.get("frontLeft");
        back_left = hwmap.dcMotor.get("backLeft");
        front_right = hwmap.dcMotor.get("frontRight");
        back_right = hwmap.dcMotor.get("backRight");

        front_right.setDirection(DcMotorSimple.Direction.REVERSE);
        back_right.setDirection(DcMotorSimple.Direction.REVERSE);

        front_left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        back_left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        front_right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        back_right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

}
