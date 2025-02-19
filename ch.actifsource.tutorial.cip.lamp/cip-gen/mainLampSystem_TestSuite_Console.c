/*********************************************************************
  SYSTEM LampSystem
  IMPLEMENTATION LampImplementation
  Error Header File for CIP MACHINE mLampUnit
  Filename: mainLampSystem_TestSuite_Console.c
  generated by CIP Tool(R)
  
  activated code options:
  	C code
  	use channel interface
  		naming option: use default prefix
  	'unsigned long' for delays
*********************************************************************/

// Begin Protected Region [[include]]

// End Protected Region   [[include]]
#include "sLampUnit.h"
#include "eLampUnit.h"
#include <stdio.h>
#include <string.h>

#define VAR (*var_)

/** Enum to specify the animation mode. */
typedef enum EAnimationMode
{
  eAnimationMode_Undefined,
  eAnimationMode_Manual,
  eAnimationMode_Regressive
} T_EAnimationMode;

/** Enum to specify the trace mode. */
typedef enum ETraceMode
{
  eTrace_Disable,
  eTrace_Enable
} T_ETraceMode;

/** Enum variable to specify the animation mode. */
T_EAnimationMode g_eAnimationMode = eAnimationMode_Undefined;

/** Enum variable to specify the trace mode. */
T_ETraceMode g_eTraceMode = eTrace_Disable;

/** Enum for all event messages of this system. */
typedef enum EEventMessage
{
  eEventMessage_Quit = -1,
  eEventMessage_Tick = 0,
  eEventMessage_Button_Push = 1,
  eEventMessage_Button_Release
} T_EEventMessage; 

/** Enum for all action messages of this system. */
typedef enum EActionMessage
{
  eActionMessage_Lamp_Dark,
  eActionMessage_Lamp_Bright,
  eActionMessageCount
} T_EActionMessage; 





/** Recorded action message of this system. */
typedef struct SRecordedActionMessage
{
  T_EActionMessage actionMessage;
} T_RecordedActionMessage;

/** Maximum action messages which can be recorded per event message for automatic animation. */
enum {g_nMaxRecordedActionMessageCount = 100};

/** The number of recorded action messages. */
int g_nRecordedActionMessageCount = 0;

/** The number of expected action messages. */
int g_nExpectedActionMessageCount = 0;

/** An array which contains the recorded action messages. */
T_RecordedActionMessage g_eRecordedActionMessage[g_nMaxRecordedActionMessageCount];

/**
 *  Translates the given action message enum to string.
 *  @param i_eActionMessage The message type to translate.
 *  @return The translated action message or 0 if enum not found.
 */
const char* const translateActionMessage(T_EActionMessage i_eActionMessage)
{
  switch (i_eActionMessage)
  {
    case eActionMessage_Lamp_Dark:
      return "Lamp.Dark";
    break;
    case eActionMessage_Lamp_Bright:
      return "Lamp.Bright";
    break;
    case eActionMessageCount:
      return 0;
    break;
    default:
      return 0;
    break;
  }
  return 0;
}

/**
 *  Check if the Action message has equals data.
 *  @param i_eActionMessage The message type to translate.
 *  @return The action message is equals 1 or 0 if not.
 */
char equalsActionMessageData(T_RecordedActionMessage sActionMessage, T_RecordedActionMessage sRecordedActionMessage)
{
  switch (sRecordedActionMessage.actionMessage)
  {
    case eActionMessage_Lamp_Dark:
      return 1;
    break;
    case eActionMessage_Lamp_Bright:
      return 1;
    break;
    case eActionMessageCount:
      return 1;
    break;
    default:
      return 1;
    break;
  }
  return 1;
}

/**
 *  Check if the Action message has equals index.
 *  @param i_eActionMessage The message type to translate.
 *  @return The action message is equals 1 or 0 if not.
 */
char equalsActionMessageIndex(T_RecordedActionMessage sActionMessage, T_RecordedActionMessage sRecordedActionMessage)
{
  switch (sRecordedActionMessage.actionMessage)
  {
    case eActionMessage_Lamp_Dark:
      return 1;
    break;
    case eActionMessage_Lamp_Bright:
      return 1;
    break;
    case eActionMessageCount:
      return 1;
    break;
    default:
      return 1;
    break;
  }
  return 1;
}

/**
 *  Records the message action from the cip system.
 *  @param i_eActionMessage The message type to record.
 */
void recordMessageAction(T_RecordedActionMessage sRecordedActionMessage)
{
  if (g_nRecordedActionMessageCount>=g_nMaxRecordedActionMessageCount) {return;}
  g_eRecordedActionMessage[g_nRecordedActionMessageCount++] = sRecordedActionMessage;
}

/**
 *  Asserts the message action from the cip system.
 *  @param i_eActionMessage The action message type to compare.
 *  @param i_pcTestEventGuid The guid of the test event.
 *  @param i_pcActionMessageGuid The guid of the action message to compare.
 *  @return 1 if recoreded and expected message actions are equal. 0 if not.
 *  @warning Previously record message actions with recordMessageAction()
 */
int assertMessageAction(T_RecordedActionMessage sRecordedActionMessage, const char* const i_pcTestEventGuid, const char* const i_pcActionMessageGuid)
{
  if (g_nExpectedActionMessageCount >= g_nRecordedActionMessageCount) 
  {
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: -\n");
    return 0;
  }
  T_RecordedActionMessage sActionMessage = g_eRecordedActionMessage[g_nExpectedActionMessageCount++];
  if (sActionMessage.actionMessage != sRecordedActionMessage.actionMessage)
  {
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: ActionMessage #%i = %s\n", g_nExpectedActionMessageCount, translateActionMessage(sActionMessage.actionMessage));
    return 0;
  }
  else if (!equalsActionMessageData(sActionMessage, sRecordedActionMessage)) 
  {
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage data not equals #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: ActionMessage data not equals #%i = %s\n", g_nExpectedActionMessageCount, translateActionMessage(sActionMessage.actionMessage));
    return 0;
  }
  else if (!equalsActionMessageIndex(sActionMessage, sRecordedActionMessage)) 
  {
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage index not equals #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: ActionMessage index not equals #%i = %s\n", g_nExpectedActionMessageCount, translateActionMessage(sActionMessage.actionMessage));
    return 0;
  }
  return 1;
}

/**
 *  Asserts and resets the message action count variable.
 *  @param i_pcTestEventGuid The guid of the test event.
 *  @return 1 if recoreded and expected message action counts are equal. 0 if not.
 */
int assertMessageActionCount(const char* const i_pcTestEventGuid)
{
  int bEqualMessageActionCount = g_nExpectedActionMessageCount == g_nRecordedActionMessageCount;
  if (!bEqualMessageActionCount)
  {
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: -\n");
    for (;g_nExpectedActionMessageCount<g_nRecordedActionMessageCount;++g_nExpectedActionMessageCount)
    {
      printf("    > Recorded: ActionMessage #%i = %s\n", g_nExpectedActionMessageCount+1,translateActionMessage(g_eRecordedActionMessage[g_nExpectedActionMessageCount].actionMessage));
    }
  }
  g_nRecordedActionMessageCount = 0;
  g_nExpectedActionMessageCount = 0;
  return bEqualMessageActionCount;
}

/** 
 *  Sends the message event to the cip system.
 *  @param i_eEventMessage The message type to send.
 *  @param i_bAutoStep Automatically calls STEP_ if 1. Calls STEP_ for all pending events if code option enable_PENDING_Information set.
 *  @return 1 if ok. 0 if failed.
 */
int sendMessageEvent(T_EEventMessage i_eEventMessage, int i_bAutoStep )
{
  switch (i_eEventMessage)
  {
    case eEventMessage_Button_Push:
      if (g_eTraceMode == eTrace_Enable) {printf(" EventMessage: Push  \n");}
      IN_.Button(C1_Push);
    break;
    case eEventMessage_Button_Release:
      if (g_eTraceMode == eTrace_Enable) {printf(" EventMessage: Release  \n");}
      IN_.Button(C1_Release);
    break;
    default:
      return 0;
    break;
  }
  if (i_bAutoStep)
  {
    if (g_eTraceMode == eTrace_Enable) {printf(" STEP_\n");}
    TRG_.STEP_();
  }
  return 1;
}

/**
 *  Timeup Function forward.
 */
void sendTimeupEvent();

/** 
 *  Sends the tick event to the cip system.
 *  @param i_nTickCount The number of ticks.
 *  @param i_bAutoTimeup Calls TIMEUP_ after each tick if set.
 */
void sendTickEvent(int i_nTickCount, int i_bAutoTimeup)
{
  static int s_nSystemTick = 0;
  int nTickCount;
  for (nTickCount=0;nTickCount<i_nTickCount;++nTickCount)
  {
    if (g_eTraceMode == eTrace_Enable) {printf(" TICK_ #%i\n",++s_nSystemTick);}
    TRG_.TICK_(); 
    if (i_bAutoTimeup) {sendTimeupEvent();}
  }
}

/** 
 *  Sends the step event to the cip system.
 */
void sendStepEvent()
{
  if (g_eTraceMode == eTrace_Enable) {printf(" STEP_\n");}
  TRG_.STEP_();
}

/** 
 *  Sends the chain event to the cip system.
 */
void sendChainEvent()
{
  if (g_eTraceMode == eTrace_Enable) {printf(" CHAIN_\n");}
  TRG_.CHAIN_(); 
}

/** 
 *  Sends the timeup event to the cip system.
 */
void sendTimeupEvent()
{
  if (g_eTraceMode == eTrace_Enable) {printf(" TIMEUP_\n");}
  TRG_.TIMEUP_(); 
}

/** 
 *  Sends the read event to the cip system.
 */
void sendReadEvent()
{
  if (g_eTraceMode == eTrace_Enable) {printf(" READ_\n");}
  TRG_.READ_(); 
}

/** 
 *  Sends the auto event to the cip system.
 */
void sendAutoEvent()
{
  if (g_eTraceMode == eTrace_Enable) {printf(" AUTO_\n");}
  TRG_.AUTO_(); 
}

/** 
 *  Lamp.Dark action message callback (Action Initiation).
 */
void AI__C2_Dark()
{
  if (g_eTraceMode == eTrace_Enable) {printf("   ActionMessage: Lamp.Dark \n\n");}
  if (g_eAnimationMode == eAnimationMode_Regressive) {
    T_RecordedActionMessage sRecorded;
    sRecorded.actionMessage = eActionMessage_Lamp_Dark;
    recordMessageAction(sRecorded);
  }
}

/** 
 *  Lamp.Bright action message callback (Action Initiation).
 */
void AI__C2_Bright()
{
  if (g_eTraceMode == eTrace_Enable) {printf("   ActionMessage: Lamp.Bright \n\n");}
  if (g_eAnimationMode == eAnimationMode_Regressive) {
    T_RecordedActionMessage sRecorded;
    sRecorded.actionMessage = eActionMessage_Lamp_Bright;
    recordMessageAction(sRecorded);
  }
}

/**
* AI_Lamp
*/
void AI_Lamp (enum eMSG_Lamp name_)
{
  switch(name_)
  {
  case C2_Dark:
      AI__C2_Dark();
    break;
  case C2_Bright:
      AI__C2_Bright();
    break;
  default: 
    break;
  }
}


/** 
 *  Shell Initialization Function. 
 */
void iCHAN_()
{
  OUT_.Lamp = AI_Lamp;
  /* Input error */
}

/** Forward TestCase LampOnOff */
int testCase_LampOnOff(int mainTestCase);

/** 
 *  TestCase LampOnOff
 *  mainTestCase 1 if main test case, 0 if sub test case.
 *  @return 1 if test case ok. 0 if test case failed.
 */
int testCase_LampOnOff(int mainTestCase)
{
  T_RecordedActionMessage sRecorded;
  
  if (mainTestCase) 
  {
    printf(">>> TestCase LampOnOff [da121cbd-613f-11e2-8c6f-0d0126f0c0ea]\n");
    if (!fINIT_()) 
    {
      printf("\nInitialization failed\n"); 
      return 0;
    }
  }
  sendMessageEvent(eEventMessage_Button_Push,1 );
  sRecorded.actionMessage = eActionMessage_Lamp_Bright;
  if (!assertMessageAction(sRecorded,"TestEvent Button_Push [1a3ea3e8-6140-11e2-8c6f-0d0126f0c0ea]","[2409f610-6140-11e2-8c6f-0d0126f0c0ea]")) {return 0;}
  if (!assertMessageActionCount("TestEvent Button_Push [1a3ea3e8-6140-11e2-8c6f-0d0126f0c0ea]")) {return 0;}
  
  sendMessageEvent(eEventMessage_Button_Release,1 );
  if (!assertMessageActionCount("TestEvent Button_Release [895b76fb-6140-11e2-8c6f-0d0126f0c0ea]")) {return 0;}
  
  sendTickEvent(3,1);
  sRecorded.actionMessage = eActionMessage_Lamp_Dark;
  if (!assertMessageAction(sRecorded,"TestEvent TICK_ [bde35657-6140-11e2-8c6f-0d0126f0c0ea]","[d12aa3f2-6140-11e2-8c6f-0d0126f0c0ea]")) {return 0;}
  if (!assertMessageActionCount("TestEvent TICK_ [bde35657-6140-11e2-8c6f-0d0126f0c0ea]")) {return 0;}
  
  return 1;
}

/** 
 *  Regressive animation, controlled by test cases. 
 *  @return The number of failed test cases.
 */
int regressiveAnimation()
{
  printf("TESTING: CipTestSuite LampSystem_TestSuite [bc63b134-613f-11e2-8c6f-0d0126f0c0ea]\n\n"); 
  g_eAnimationMode = eAnimationMode_Regressive;
  int nSuceededTestCases = 0;
  int nFailedTestCases = 0;
  g_eTraceMode = eTrace_Disable;
  if (testCase_LampOnOff(1)) {++nSuceededTestCases;} else {++nFailedTestCases;}
  printf("\n> SUMMARY: %i Test Case(s) Executed.\n",nSuceededTestCases+nFailedTestCases); 
  if (nFailedTestCases) {printf("> WARNING: %i Test Case(s) Failed.\n",nFailedTestCases);} 
  return nFailedTestCases;
}

/** 
 *  Manual animation, controlled by keyboard input. 
 *  @return 0 if exited normally. 1 otherwise.
 */
int manualAnimation()
{
  g_eAnimationMode = eAnimationMode_Manual;
  g_eTraceMode = eTrace_Enable;
  
  if (!fINIT_()) 
  {
    printf("\nInitialization failed\n");
    return 1;
  }
  
  while (1) 
  {
    printf("------------------------------------\n");
    printf("Enter -1 (Quit)\n");
    printf("Enter  0 (TICK_ & TIMEUP_)\n");
    printf("Enter  %i (Button: Push)\n",eEventMessage_Button_Push);
    printf("Enter  %i (Button: Release)\n",eEventMessage_Button_Release);
    printf("------------------------------------\n");

    T_EEventMessage eEventMessage;
    scanf("%i", (int*)&eEventMessage);
    if (eEventMessage == eEventMessage_Quit) {break;}
    else if (eEventMessage == eEventMessage_Tick) {sendTickEvent(1,1);}
    else if (!sendMessageEvent(eEventMessage, 1)) {printf("\n Invalid Input: %i\n\n",eEventMessage);}
  }
  return 0;
}

/** 
 *  Displays an info text for this program.
 *  @param i_pcProgramName The name of the program file.
 */
void displayInfoText(char* i_pcProgramName)
{
  printf("Usage: %s [option]\n",i_pcProgramName);
  printf(" [option]\n");
  printf(" - manual:     Manual animation, controlled by keyboard input.\n");
  printf(" - regressive: Regressive animation, controlled by test cases.\n");
}

/**
 *  Main program for animation.
 *  @param @argc The number of arguments passed to the program.
 *  @param @argv The arguments passed to the program.
 *  @return 0 if exited normally. 1 otherwise.
 */
int main(int argc, char *argv[]) 
{
  if (argc == 1) 
  {
    displayInfoText(argv[0]);
    return 1;
  }
  if (strcmp(argv[1],"manual")==0) {return manualAnimation()?1:0;}
  if (strcmp(argv[1],"regressive")==0) {return regressiveAnimation()?1:0;}
  displayInfoText(argv[0]);
  return 1;
}

// Actifsource ID=[bc0af8c6-407d-11e2-9941-ff65f3a86106,bc63b134-613f-11e2-8c6f-0d0126f0c0ea,XdrDsYWCuI1u0Em0vldiARj5gco=]
