package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name="BartTest")
public class BartTest extends OpMode {

DcMotor frontLeft;
DcMotor frontRight;
DcMotor backLeft;
DcMotor backRight;
DcMotor intakeFront;

double yStick;
double xStick;
double rightStickX;

    //Initialize
    @Override
    public void init(){
        frontLeft = hardwareMap.dcMotor.get("LFront");
        frontRight = hardwareMap.dcMotor.get("RFront");
        backLeft = hardwareMap.dcMotor.get("LBack");
        backRight = hardwareMap.dcMotor.get("RBack");
        intakeFront = hardwareMap.dcMotor.get("DoThisTomorrowwwwwwwwwwwwwwwwwwwwwwwwwww")
    }

    //Start Press
    @Override
    public void start() {

    }

    //Loop
    @Override
    public void loop() {
        xStick = gamepad1.left_stick_x;
        yStick = gamepad1.left_stick_y;
        rightStickX = gamepad1.right_stick_x;

        //Left Stick Drive
        frontLeft.setPower(xStick - yStick);
        frontRight.setPower(yStick - xStick);
        backLeft.setPower(xStick - yStick);
        backRight.setPower(yStick - xStick);

        //Right Stick Drive
        frontLeft.setPower(-rightStickX);
        frontRight.setPower(-rightStickX);
        backLeft.setPower(-rightStickX);
        backRight.setPower(-rightStickX);



        //Front Intake
        if (gamepad1.x) {
            intakeFront.setPower(-1);
        }

        if (gamepad1.y) {
            intakeFront.setPower(0);
        }
    }

    //Stop
    @Override
    public void stop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);

    }

}
