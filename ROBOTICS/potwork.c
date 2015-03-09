#pragma config(Sensor, S4,     proto,          sensorI2CCustom9V)
//*!!Code automatically generated by 'ROBOTC' configuration wizard               !!*//

#include "hitechnic-superpro.h"
#include "hitechnic-protoboard.h"
//global variable
float digiInput;
//global variable
task main()
{
HTSPBsetupIO(proto, 0x3F);
	double x = 0;
		while(true){
			digiInput = HTSPBreadIO(proto, 0x01);
			x = HTSPBreadADC(proto,1,8); //(device,analog pin,bit width(whatever that is))
			x = x * 1.415;
			nxtDisplayString(3,"%d",x);
			wait10Msec(2);
    	eraseDisplay();

    	string dir = "east";
    	if (x < 90)
    		dir = "north";
   		else if ( x < 180 && x >= 90)
     		dir = "east";
   		else if ( x > 180 && x <= 270)
     		dir = "south";
   		else
     		dir = "west";
     	nxtDisplayString(4,"%s",dir);
	}
}
