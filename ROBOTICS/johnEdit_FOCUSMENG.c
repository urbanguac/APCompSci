//JOHN EDIT

bool pinIsOn[] = {false, false}
bool pinWasOn[] = {false, false}
int stepCounter = 0;

task checkPins () {
	if (pinWasOn[0] && !pinIsOn[0])
	{
		stepCounter++;
		pinWasOn[0] = false;
		performStep(stepCounter);
	}
	if (pinIsOn[0])
	{
		pinWasOn[0] = true;
	}
}

void performStep(int step) {
	switch (step) {
		case 1: break;
		case 2: break;
	}
}

task main()
{
	StartTask(checkPins);
}
