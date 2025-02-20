#include <avr/io.h>
#include <util/delay.h>
#include "sLampUnit.h"

#define LED_PIN     PB5   // LED connected to PB5 (Arduino Pin 13)
#define BUTTON_PIN  PB4   // Button connected to PB4 (Arduino Pin 12)

void AI_LampUnit_C2_Dark() {
  PORTB &= ~_BV(LED_PIN); // Turn LED OFF
}
void AI_LampUnit_C2_Bright() {
  PORTB |= _BV(LED_PIN);  // Turn LED ON
}
void iMSG_LampUnit() {
  OUT_LampUnit.C2_Dark = AI_LampUnit_C2_Dark;
  OUT_LampUnit.C2_Bright = AI_LampUnit_C2_Bright;
}

int main(void)
{
  if (!fINIT_LampUnit()) {return 1;} // init cip
  // Set LED_PIN as an output
  DDRB |= _BV(LED_PIN);

  // Set BUTTON_PIN as an input and enable internal pull-up resistor
  DDRB &= ~_BV(BUTTON_PIN);  // Configure as input
  PORTB |= _BV(BUTTON_PIN);  // Activate internal pull-up (idle state = HIGH)

  int oldbuttonState = 0;

  while (1) {
	int newButtonState = PINB & _BV(BUTTON_PIN); // read button pin
	TRG_LampUnit.TICK_();
	// ticking time
	if(oldbuttonState!=newButtonState && newButtonState==1) {
		IN_LampUnit.C1_Push();
	}
	if(oldbuttonState!=newButtonState && newButtonState==0) {
		IN_LampUnit.C1_Release();
	}

	oldbuttonState=newButtonState;

	while (TRG_LampUnit.PENDING_.ANY_) {
	  TRG_LampUnit.STEP_();
	}
	_delay_ms(4);
  }

  return 0; // Never reached
}

