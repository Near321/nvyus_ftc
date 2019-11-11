
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorController;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="MakeServoMove", group="Autonomous")
public class MakeServoMove extends LinearOpMode {
    //DcMotor leftDrive;
    //DcMotor rightDrive;
    //DcMotor back_leftDrive;
    //DcMotor back_rightDrive;
    Servo dad_right;
    Servo dad_left;

    @Override
    public void runOpMode() throws InterruptedException {
        dad_right = hardwareMap.servo.get("dad_right");
        dad_left = hardwareMap.servo.get("dad_left");
        // reset encoder count kept by left motor.




        // wait for start button.

        waitForStart();


        dad_right(180);
        dad_left(180);

        telemetry.addData("Mode", "running");
        telemetry.update();



        //all public void drive code is here!
        dad_right(180);
        dad_left(180);
       // while (opModeIsActive() && leftDrive.isBusy()) {
            //telemetry.addData("encoder-fwd", leftDrive.getCurrentPosition() + "  busy=" + leftDrive.isBusy());
            telemetry.update();
            idle();
        }

    public void dad_right(double postion) {

        double servoPosition = 0.0;

        dad_right.setPosition(servoPosition);

        //dad_right.setPosition(0);

    }
    public void dad_left(double postion) {

        double servoPosition = 0.0;

        dad_left.setPosition(servoPosition);

        //dad_left.setPosition(0);

    }
}
