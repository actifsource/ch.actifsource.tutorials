/*********************************************************************
	SYSTEM Lamp_CipSystem
	IMPLEMENTATION LampImplementation
	Header File for CIP SHELL sLampUnit
	Filename: sLampUnit.h
	generated by CIP Tool(R)
	
	activated code options:
		C code
		use channel interface
			naming option: use default prefix
		'unsigned long' for delays
*********************************************************************/

#if !defined(_sLampUnit_h_)
	#define _sLampUnit_h_
/* Code Option Constants */

#if defined(_EINPUT__)
	#undef _EINPUT__
#endif 

#if defined(_PENDING__)
	#undef _PENDING__
#endif 

/* Channel Enumerations */

#if !defined(_eCHAN__)
	#define _eCHAN__

	enum eCHAN_
		{C_Button = 1, C_Lamp = 2};

#endif // _eCHAN__

/*********************************************************************
	CODE  GENERATION  FEATURE
	This global message enumeration can be used 
	for implementation purposes.
*********************************************************************/

enum eMSG_LampUnit
	{F_C1_Push_ = 1, F_C1_Release_ = 2, F_C2_Bright_ = 3, F_C2_Dark_ = 4};

/********************************************************************/

#if !defined(_eMSG_Button_)
	#define _eMSG_Button_

	enum eMSG_Button
		{C1_Push = 1, C1_Release = 2};

#endif // _eMSG_Button_

#if !defined(_eMSG_Lamp_)
	#define _eMSG_Lamp_

	enum eMSG_Lamp
		{C2_Bright = 1, C2_Dark = 2};

#endif // _eMSG_Lamp_

/* Input Interface Type */

struct tIN_
{
	void (*Button) (enum eMSG_Button);
};

/* Output Interface Type */

struct tOUT_
{
	void (*Lamp) (enum eMSG_Lamp);
};


/* Trigger Interface Type */

struct tTRG_
{
	void (*TICK_) (void);		/* increment CIP MACHINE time */
	void (*STEP_) (void);		/*  trigger CIP MACHINE transition */
	void (*CHAIN_) (void);		/* trigger pending chain CIP MACHINE transition */
	void (*TIMEUP_) (void);		/* trigger pending timeup CIP MACHINE transition */
	void (*READ_) (void);		/* trigger CIP MACHINE to read from internal message buffer */
	void (*AUTO_) (void);		/* trigger pending auto CIP MACHINE transition */
};

/* External Interface Declarations */

extern struct tIN_ IN_;		/* Input Channel Interface defined in sLampUnit.c */
extern struct tOUT_ OUT_;		/* Output Channel Interface defined in sLampUnit.c */
extern struct tTRG_ TRG_;		/* Trigger Interface defined in sLampUnit.c */

/* Unit Initialization Function, defined in mLampUnit.c
	called by User to initialize CIP Machine
		returning 1 if successful
		returning 0 if failed */

int fINIT_(void);

/* User defined Initialization Function for CIP Shell Interface Initialization 
	called by Unit Initialization Function */

void iCHAN_(void);

#endif // _sLampUnit_h_

/*********************************************************************
	End of CIP UNIT Header File for CIP SHELL sLampUnit
*********************************************************************/
/* Actifsource ID=[b7934a9b-259a-11e1-ae2f-a14f3e396de6,dc0ccb3f-eeb2-11ef-a3fc-b5c521c52e06,bc124dc7-eea7-11ef-a3fc-b5c521c52e06,ba697f7b-2723-11e1-b14b-53cb3f44a5b8,dc109bd3-eeb2-11ef-a3fc-b5c521c52e06,dc149378-eeb2-11ef-a3fc-b5c521c52e06,zEX7QIyOMb2Wg/m8TlaGOwpVox8=] */
