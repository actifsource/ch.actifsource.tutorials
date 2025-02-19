#include "arduino.h"
#include "sLampSystemUnit.h"

int buttonPin = 2;    // button connected to digital pin 2
int lampPin =  13;    // lamp connected to digital pin 13

void AI_LampSystemUnit_C2_Dark()   {digitalWrite(lampPin, LOW);}
void AI_LampSystemUnit_C2_Bright() {digitalWrite(lampPin, HIGH);}

void iMSG_LampSystemUnit()
{
  OUT_LampSystemUnit.C2_Dark   = AI_LampSystemUnit_C2_Dark;
  OUT_LampSystemUnit.C2_Bright = AI_LampSystemUnit_C2_Bright;
}

int main()
{
  if (!fINIT_LampSystemUnit()) {return 1;}       // init cip
  init();                                        // init arduino
  pinMode(buttonPin, INPUT);                     // init button pin
  pinMode(lampPin, OUTPUT);                      // init lamp pin

  int oldbuttonState = 0;
  while (1)
  {
    int newButtonState = digitalRead(buttonPin); // read button pin
    TRG_LampSystemUnit.TICK_();                  // ticking time
    if (oldbuttonState!=newButtonState && newButtonState==1) {IN_LampSystemUnit.C1_Press();}
    if (oldbuttonState!=newButtonState && newButtonState==0) {IN_LampSystemUnit.C1_Release();}
    oldbuttonState=newButtonState;
    while (TRG_LampSystemUnit.PENDING_.ANY_) {TRG_LampSystemUnit.STEP_();}
    delay(3);
  }
  return 0;
}
