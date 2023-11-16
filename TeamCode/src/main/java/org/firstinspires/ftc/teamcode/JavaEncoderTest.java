package org.firstinspires.ftc.teamcode;
// import lines were omitted. OnBotJava will add them automatically.

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
public class JavaEncoderTest extends LinearOpMode {
    DcMotorEx motor;

    @Override
    public void runOpMode() {

        motor = hardwareMap.get(DcMotorEx.class, "BackLeft");
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER );
        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("Encoder value", motor.getCurrentPosition());
            telemetry.update();
        }
    }
}
