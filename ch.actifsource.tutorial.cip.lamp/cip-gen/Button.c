/*******************************************************************
        SYSTEM LampSystem
        Module for PROCESS Button
        Filename: Button.c
        generated by CIP Tool(R)

        activated code options:
        	C code
        	use channel interface
        		naming option: use default prefix
        	'unsigned long' for delays
*********************************************************************/

/* Include Files */

#include "mLampUnit.h"

/* Process Macro Definitions */

#define EXCEPTION return;
#define SELF status_Button.write_access_
#define STATUS (pStatus_Button->read_access_)
#define TIME time_

/* Process Enumerations */

enum eMODES_Button
	{normal = 1};

enum eSTATES_Button
	{Pushed = 1, Released};


/* External Declarations */

extern unsigned long time_;
extern struct tCHNOUT_mLampUnit CHNOUT_mLampUnit;
int fPULSE_Lamp (enum eOUTPLS_ name_);

/* Global Declarations */

union tSTATUS_Button status_Button;
const union tSTATUS_Button *pStatus_Button = &status_Button;

/* Function Prototypes */

void fICHAN_Button (enum eMSG_Button name_);
void fINIT_Button (void);

/* Input Channel Functions */

void fICHAN_Button(enum eMSG_Button name_)
{
	switch(name_)
	{
		/* MESSAGE Push of INPORT ButtonPort */
	case C1_Push:
		switch(status_Button.read_access_.STATE)
		{
		case Released:
		 	status_Button.write_access_.STATE = Pushed;
		 	fPULSE_Lamp (O1_On);
			break;
		default:
			return;
		}		
		break;
		/* MESSAGE Release of INPORT ButtonPort */
	case C1_Release:
		switch(status_Button.read_access_.STATE)
		{
		case Pushed:
		 	status_Button.write_access_.STATE = Released;
		 	fPULSE_Lamp (O1_Off);
			break;
		default:
			return;
		}		
		break;
	default:
		return;
	}
	return;
}
		
/* Process Initialization Function */

void fINIT_Button (void)
{
	status_Button.write_access_.STATE = Released;
}		

/*********************************************************************
	End of Module for PROCESS Button
*********************************************************************/
// Actifsource ID=[e9267837-2596-11e1-ae2f-a14f3e396de6,0e3da843-613c-11e2-8c6f-0d0126f0c0ea,16966e79-613e-11e2-8c6f-0d0126f0c0ea,ba697f7b-2723-11e1-b14b-53cb3f44a5b8,16997bbd-613e-11e2-8c6f-0d0126f0c0ea,326cf6fd-613c-11e2-8c6f-0d0126f0c0ea,3e2fd4a4-613c-11e2-8c6f-0d0126f0c0ea,xS4+thq+yMA4kVPLHbhexYNjio8=]
