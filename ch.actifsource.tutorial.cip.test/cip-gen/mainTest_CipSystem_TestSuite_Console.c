/*********************************************************************
  SYSTEM Test_CipSystem
  IMPLEMENTATION LampImplementation
  Error Header File for CIP MACHINE mLampUnit
  Filename: mainTest_CipSystem_TestSuite_Console.c
  generated by CIP Tool(R)
  
  activated code options:
  	C code
  	use channel interface
  		naming option: use default prefix
  	'unsigned long' for delays
*********************************************************************/

/* Begin Protected Region [[include]] */

/* End Protected Region   [[include]] */
#include "mainTest_CipSystem_TestSuite_Console.h"

#include <stdio.h>
#include <string.h>

#define VAR (*var_)

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
  eEventMessage_Step,
  eEventMessage_TimeUp,
  eEventMessage_Chain,
  eEventMessage_Read,
  eEventMessage_Auto,
  eEventMessage_Button_Push,
  eEventMessage_Button_Release,
  eEventMessageCount
} T_EEventMessage; 

/** Enum for all action messages of this system. */
typedef enum EActionMessage
{
  eActionContextError = 0,
  eActionFullBufferWarning,
  eActionBufferError,
  eActionPulseSelectionError,
  eActionMessageSelectionError,
  eActionInputError,
  eActionMessage_Lamp_Bright,
  eActionMessage_Lamp_Dark,
  eActionMessageCount
} T_EActionMessage; 

/** Enum for all test case. */
typedef enum ETestCase
{
  eTestCase_LampOnOff
} T_ETestCase;

/* Checked output message */
const int checkedOutputMessage_LampOnOff[eActionMessageCount] = {1, 1, 1, 1, 1, 1, 1, 1};

/** Typedef of all Event data. */
typedef union UEventData
{
  int tick;
} T_UEventData;




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

/** System Tick. */
int s_nSystemTick = 0;


/* Active Test Case */
T_ETestCase activeTestCase;

/**
 * Returns the current animation mode.
 */
T_EAnimationMode Main_getAnimationMode(void)
{
  return g_eAnimationMode;
}

/**
 * Checked output message
 */
char isCheckedOutputMessage(T_EActionMessage i_eActionMessage)
{
  switch (activeTestCase)
  {
     case eTestCase_LampOnOff:
       return checkedOutputMessage_LampOnOff[i_eActionMessage];
     default:
       return 0;
     break;
  }
  return 1;
}

/**
 *  Translates the given action message enum to string.
 *  @param i_eActionMessage The message type to translate.
 *  @return The translated action message or 0 if enum not found.
 */
const char* const translateActionMessage(T_EActionMessage i_eActionMessage)
{
  switch (i_eActionMessage)
  {
    case eActionMessage_Lamp_Bright:
      return "Lamp.Bright";
    break;
    case eActionMessage_Lamp_Dark:
      return "Lamp.Dark";
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
    case eActionMessage_Lamp_Bright:
      return 1;
    break;
    case eActionMessage_Lamp_Dark:
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
    case eActionMessage_Lamp_Bright:
      return 1;
    break;
    case eActionMessage_Lamp_Dark:
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
int assertMessageAction(T_RecordedActionMessage sRecordedActionMessage, const char* const i_pcTestEventGuid, const char* const i_pcActionMessageGuid, const char* const i_testCaseName, int checkData)
{
  if (g_nExpectedActionMessageCount >= g_nRecordedActionMessageCount) 
  {
    if (g_eAnimationMode == eAnimationMode_Runner) {
       printf("6fe21579-eeba-11ef-a3fc-b5c521c52e06.asr: Failure\n");
       printf("TestCase: %s\n", i_testCaseName);
    }
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: -\n");
    return 0;
  }
  T_RecordedActionMessage sActionMessage = g_eRecordedActionMessage[g_nExpectedActionMessageCount++];
  if (sActionMessage.actionMessage != sRecordedActionMessage.actionMessage)
  {
    if (g_eAnimationMode == eAnimationMode_Runner) {
       printf("6fe21579-eeba-11ef-a3fc-b5c521c52e06.asr: Failure\n");
       printf("TestCase: %s\n", i_testCaseName);
    }
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: ActionMessage #%i = %s\n", g_nExpectedActionMessageCount, translateActionMessage(sActionMessage.actionMessage));
    return 0;
  }
  if (!equalsActionMessageIndex(sActionMessage, sRecordedActionMessage)) 
  {
    if (g_eAnimationMode == eAnimationMode_Runner) {
       printf("6fe21579-eeba-11ef-a3fc-b5c521c52e06.asr: Failure\n");
       printf("TestCase: %s\n", i_testCaseName);
    }
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage index not equals #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: ActionMessage index not equals #%i = %s\n", g_nExpectedActionMessageCount, translateActionMessage(sActionMessage.actionMessage));
    return 0;
  }
  if (!checkData) return 1;
  if (!equalsActionMessageData(sActionMessage, sRecordedActionMessage)) 
  {
    if (g_eAnimationMode == eAnimationMode_Runner) {
       printf("6fe21579-eeba-11ef-a3fc-b5c521c52e06.asr: Failure\n");
       printf("TestCase: %s\n", i_testCaseName);
    }
    printf("    ASSERTION FAILED: %s\n",i_pcTestEventGuid);
    printf("    > Expected: ActionMessage data not equals #%i = %s %s\n", g_nExpectedActionMessageCount, translateActionMessage(sRecordedActionMessage.actionMessage), i_pcActionMessageGuid);
    printf("    > Recorded: ActionMessage data not equals #%i = %s\n", g_nExpectedActionMessageCount, translateActionMessage(sActionMessage.actionMessage));
    return 0;
  }
  return 1;
}

/**
 *  Asserts and resets the message action count variable.
 *  @param i_pcTestEventGuid The guid of the test event.
 *  @return 1 if recoreded and expected message action counts are equal. 0 if not.
 */
int assertMessageActionCount(const char* const i_pcTestEventGuid, const char* const i_testCaseName)
{
  int bEqualMessageActionCount = g_nExpectedActionMessageCount == g_nRecordedActionMessageCount;
  if (!bEqualMessageActionCount)
  {
    if (g_eAnimationMode == eAnimationMode_Runner) {
       printf("6fe21579-eeba-11ef-a3fc-b5c521c52e06.asr: Failure\n");
       printf("TestCase: %s\n", i_testCaseName);
    }
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
 *  Function forward.
 */
void sendTickEvent(int i_nTickCount, int i_bAutoTimeup);
void sendStepEvent();
void sendChainEvent();
void sendAutoEvent();
void sendTimeupEvent();
void sendReadEvent();

/** 
 *  Sends the message event to the cip system.
 *  @param i_eEventMessage The message type to send.
 *  @param i_bAutoStep Automatically calls STEP_ if 1. Calls STEP_ for all pending events if code option enable_PENDING_Information set.
 *  @return 1 if ok. 0 if failed.
 */
int sendMessageEvent(T_EEventMessage i_eEventMessage, int i_bAutoStep, int i_bAutoTimeup, T_UEventData *eventData )
{
  switch (i_eEventMessage)
  {
    case eEventMessage_Tick:
      sendTickEvent(eventData->tick, i_bAutoTimeup);
    break;
    case eEventMessage_Step:
      sendStepEvent();
    break;
    case eEventMessage_TimeUp:
      sendTimeupEvent();
    break;
    case eEventMessage_Chain:
      sendChainEvent();
    break;
    case eEventMessage_Read:
      sendReadEvent();
    break;
    case eEventMessage_Auto:
      sendAutoEvent();
    break;
    case eEventMessage_Button_Push:
      if (g_eTraceMode == eTrace_Enable) {printf(" EventMessage: Button.Push  \n");}
      IN_.Button(C1_Push);
    break;
    case eEventMessage_Button_Release:
      if (g_eTraceMode == eTrace_Enable) {printf(" EventMessage: Button.Release  \n");}
      IN_.Button(C1_Release);
    break;
    default:
      return 0;
    break;
  }
  {
    if (g_eTraceMode == eTrace_Enable) {printf(" STEP_\n");}
    int maxStepCount = 0;
    for (maxStepCount=0;maxStepCount<i_bAutoStep;maxStepCount++) 
    {
      TRG_.STEP_();
    }
  }
  return 1;
}

/** 
 *  Sends the tick event to the cip system.
 *  @param i_nTickCount The number of ticks.
 *  @param i_bAutoTimeup Calls TIMEUP_ after each tick if set.
 */
void sendTickEvent(int i_nTickCount, int i_bAutoTimeup)
{
  int nTickCount;
  int nAutoCount;
  if (g_eTraceMode == eTrace_Enable) {printf(" START TICK_ #%i\n",s_nSystemTick);}  
  for (nTickCount=0;nTickCount<i_nTickCount;++nTickCount)
  {
    s_nSystemTick++;
    TRG_.TICK_(); 
    for(nAutoCount=0;nAutoCount<i_bAutoTimeup;nAutoCount++)  
    {
      TRG_.TIMEUP_();
    }
  }
  if (g_eTraceMode == eTrace_Enable) {printf(" END TICK_ #%i\n",s_nSystemTick);}
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
 *  Lamp.Bright action message callback (Action Initiation).
 */
void AI__C2_Bright()
{
  if (g_eTraceMode == eTrace_Enable) {printf("   ActionMessage: Lamp.Bright \n\n");}
  if (g_eAnimationMode == eAnimationMode_Regressive || g_eAnimationMode == eAnimationMode_Runner) {
    T_RecordedActionMessage sRecorded;
    sRecorded.actionMessage = eActionMessage_Lamp_Bright;
    if (!isCheckedOutputMessage(sRecorded.actionMessage)) return;
    recordMessageAction(sRecorded);
  }
}

/** 
 *  Lamp.Dark action message callback (Action Initiation).
 */
void AI__C2_Dark()
{
  if (g_eTraceMode == eTrace_Enable) {printf("   ActionMessage: Lamp.Dark \n\n");}
  if (g_eAnimationMode == eAnimationMode_Regressive || g_eAnimationMode == eAnimationMode_Runner) {
    T_RecordedActionMessage sRecorded;
    sRecorded.actionMessage = eActionMessage_Lamp_Dark;
    if (!isCheckedOutputMessage(sRecorded.actionMessage)) return;
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
  case C2_Bright:
      AI__C2_Bright();
    break;
  case C2_Dark:
      AI__C2_Dark();
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
  T_UEventData data;
  T_RecordedActionMessage sRecorded;
  
  if (mainTestCase) 
  {
    printf(">>> TestCase LampOnOff [102386f2-eec0-11ef-a617-b322549a527e]\n");
    s_nSystemTick = 0;
    g_nRecordedActionMessageCount = 0;
    g_nExpectedActionMessageCount = 0;
    if (!fINIT_()) 
    {
      printf("\nInitialization failed\n"); 
      return 0;
    }
  }
  
  activeTestCase = eTestCase_LampOnOff;
  sendMessageEvent(eEventMessage_Button_Push, 1, 1, &data);
  sRecorded.actionMessage = eActionMessage_Lamp_Bright;
  if (!assertMessageAction(sRecorded,"TestEvent Button.Push [5a502d84-eec0-11ef-a617-b322549a527e]","[6a290773-eec0-11ef-a617-b322549a527e]", "LampOnOff" ,0)) {return 0;}
  if (!assertMessageActionCount("TestEvent Button.Push [5a502d84-eec0-11ef-a617-b322549a527e]", "LampOnOff")) {return 0;}
  
  sendMessageEvent(eEventMessage_Button_Release, 1, 1, &data);
  if (!assertMessageActionCount("TestEvent Button.Release [ec7d7b0f-eec1-11ef-a617-b322549a527e]", "LampOnOff")) {return 0;}
  
  data.tick = 3;
  sendMessageEvent(eEventMessage_Tick, 1, 1, &data);
  sRecorded.actionMessage = eActionMessage_Lamp_Dark;
  if (!assertMessageAction(sRecorded,"TestEvent TICK_[3] [741cb8f3-eec2-11ef-a617-b322549a527e]","[854bfb13-eec2-11ef-a617-b322549a527e]", "LampOnOff" ,0)) {return 0;}
  if (!assertMessageActionCount("TestEvent TICK_[3] [741cb8f3-eec2-11ef-a617-b322549a527e]", "LampOnOff")) {return 0;}
  

  return 1;
}

/** 
 *  Write string to file.
 */
void printToFile(FILE *fp, const char* s) 
{
  if (fp == NULL) return;
  fprintf(fp, s);
}

/** 
 *  Regressive animation, controlled by test cases. 
 *  @return The number of failed test cases.
 */
int regressiveAnimation()
{
  printf("TESTING: CipTestSuite Test_CipTestSuite [6fe21579-eeba-11ef-a3fc-b5c521c52e06]\n\n"); 
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
 *  C/C++ Unit gtest, controlled by test cases. 
 *  @return The number of failed test cases.
 */
int runnerAnimation(FILE *fp)
{
  int nSuceededTestCases = 0;
  int nFailedTestCases = 0;
  g_eAnimationMode = eAnimationMode_Runner;
	  
  printf("[==========] Running 1 test from 1 test case.\n");
  printf("[----------] Global test environment set-up.\n");
  printf("[----------] 1 test from Test_CipTestSuite\n");
   
  printToFile(fp, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n");
  printToFile(fp, "<testsuite name=\"Test_CipTestSuite\">\n");
      	  
  /* LampOnOff */
  g_eTraceMode = eTrace_Disable;
  printf("[ RUN      ] Test_CipTestSuite.LampOnOff\n");
  if (testCase_LampOnOff(1)) {
  	++nSuceededTestCases;
  	printf("[       OK ] Test_CipTestSuite.LampOnOff (%i ms)\n",s_nSystemTick);
  	printToFile(fp, "    <testcase name=\"LampOnOff\" status=\"run\" />\n");
  } else {
  	++nFailedTestCases;
	printf("[  FAILED  ] Test_CipTestSuite.LampOnOff (%i ms)\n",s_nSystemTick);
	printToFile(fp, "    <testcase name=\"LampOnOff\" status=\"run\">\n");
	printToFile(fp, "        <failure><![CDATA[Failure testcase: 102386f2-eec0-11ef-a617-b322549a527e]]></failure>\n");
	printToFile(fp, "    </testcase>\n");
  }
	
  printToFile(fp, "</testsuite>");
  
  printf("[----------] 1 test from Test_CipTestSuite (0 ms total)\n");
  printf("\n> SUMMARY: %i Test Case(s) Executed.\n",nSuceededTestCases+nFailedTestCases); 
  if (nFailedTestCases) {
  	printf("> WARNING: %i Test Case(s) Failed.\n",nFailedTestCases);
  }
  printf("[----------] Global test environment tear-down\n");
  printf("[==========] 1 test from 1 test case ran. (0 ms total)\n");
  return nFailedTestCases;
}

/** 
 *  Manual animation, controlled by keyboard input. 
 *  @return 0 if exited normally. 1 otherwise.
 */
int manualAnimation()
{
  T_UEventData data;
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
    printf("Enter 0 (Tick  & TimeUp)\n");
    printf("Enter 1 (Step)\n");
    printf("Enter 2 (TimeUp)\n");
    printf("Enter 3 (Chain)\n");
    printf("Enter 4 (Read)\n");
    printf("Enter 5 (Auto)\n");
    printf("Enter  %i (Button: Push)\n",eEventMessage_Button_Push);
    printf("Enter  %i (Button: Release)\n",eEventMessage_Button_Release);
    printf("------------------------------------\n");

    T_EEventMessage eEventMessage;
    scanf("%i", (int*)&eEventMessage);
    if (eEventMessage == eEventMessage_Quit) {break;}
    else if (eEventMessage == eEventMessage_Tick) {
        data.tick = 1;
        sendMessageEvent(eEventMessage_Tick, 1, 1, &data);
    }
    else if (!sendMessageEvent(eEventMessage, 1, 1, &data)) {printf("\n Invalid Input: %i\n\n",eEventMessage);}
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
  printf(" - runner [optional filename]: C/C++ Unit gtest.\n");
}

/**
 *  Main program for animation.
 *  @param @argc The number of arguments passed to the program.
 *  @param @argv The arguments passed to the program.
 *  @return 0 if exited normally. 1 otherwise.
 */
int main(int argc, char *argv[]) 
{
  int ret;
  if (argc == 1) 
  {
    displayInfoText(argv[0]);
    return 1;
  }

  if (strcmp(argv[1],"manual")==0) 
  {
    ret = manualAnimation()?1:0;
    return ret;
  }
  if (strcmp(argv[1],"regressive")==0) 
  {
    ret = regressiveAnimation()?1:0;
    return ret;
  }
  if (strcmp(argv[1],"runner")==0) 
  {
    FILE *fp = NULL;
    if (argc >= 2) {
        fp = fopen(argv[2], "w+");
    }
    ret = runnerAnimation(fp)?1:0;
    if (fp != NULL) {
        fclose(fp);
    }
    return ret;
  }
  displayInfoText(argv[0]);
  return 1;
}

/* Actifsource ID=[bc0af8c6-407d-11e2-9941-ff65f3a86106,6fe21579-eeba-11ef-a3fc-b5c521c52e06,h2W3e6N65Kapz4Vc/enDvPJffhM=] */
