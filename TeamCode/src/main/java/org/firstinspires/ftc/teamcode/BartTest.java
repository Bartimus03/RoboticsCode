package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name="BartTest", group = "Teleop")
public class BartTest extends OpMode {

DcMotor frontLeft;
DcMotor frontRight;
DcMotor backLeft;
DcMotor backRight;
DcMotor intakeFront;

double yStick;
double xStick;
double rightStickX;

//test compile

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
        frontLeft.setPower(xStick - yStick - rightStickX);
        frontRight.setPower(yStick - xStick - rightStickX);
        backLeft.setPower(xStick - yStick - rightStickX);
        backRight.setPower(yStick - xStick - rightStickX);
        
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


    }

}
