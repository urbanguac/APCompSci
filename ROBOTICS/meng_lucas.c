#pragma config(Hubs,  S1, HTMotor,  HTMotor,  HTMotor,  HTMotor)
#pragma config(Hubs,  S2, HTServo,  none,     none,     none)
#pragma config(Sensor, S1,     ,               sensorI2CMuxController)
#pragma config(Sensor, S2,     Gyro,           sensorI2CMuxController)
#pragma config(Sensor, S3,     Sonar,          sensorSONAR)
#pragma config(Sensor, S4,     Accel,          sensorI2CHiTechnicAccel)
#pragma config(Motor,  mtr_S1_C1_1,     backright,     tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C1_2,     backleft,      tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C2_1,     emptymotor,    tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C2_2,     collector,     tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C3_1,     frontright,    tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C3_2,     frontleft,     tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C4_1,     liftRight,    tmotorTetrix, openLoop)
#pragma config(Motor,  mtr_S1_C4_2,     liftLeft,    tmotorTetrix, openLoop)
#pragma config(Servo,  srvo_S2_C1_1,    scoreA,               tServoStandard)
#pragma config(Servo,  srvo_S2_C1_2,    scoreB,               tServoStandard)
#pragma config(Servo,  srvo_S2_C1_3,    rollingBack,          tServoStandard)
#pragma config(Servo,  srvo_S2_C1_4,    rollingSide,          tServoStandard)
#pragma config(Servo,  srvo_S2_C1_5,    servo5,               tServoNone)
#pragma config(Servo,  srvo_S2_C1_6,    servo6,               tServoNone)
//*!!Code automatically generated by 'ROBOTC' configuration wizard




void initializeRobot()
{
	for(int i = 0; i < 100; i++){//Sensor
		initial += SensorValue[S4];
		wait10Msec(1);
	}
	initial = initial / 100;//Sensor

	servo[scoreA]=0;
	servo[scoreB]=0;
	servo[rollingBack] = 180;
	servo[rollingSide] = 180; //rolling goal clamps are open

	return;
}


task main()
{




}
