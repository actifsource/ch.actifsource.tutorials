//--------------------------------------------------------------------------
// (C) Copyright Actifsource GmbH  2012-2015
//
// Use or copying of all or any part of the document, except as
// permitted by the License Agreement is prohibited.
//--------------------------------------------------------------------------

// Header files from the environment
#include <limits.h>
/* Begin Protected Region [[EnvironmentInclude]] */
#include <stdio.h>
/* End Protected Region   [[EnvironmentInclude]] */

// Header files from external components
/* Begin Protected Region [[ComponentInclude]] */

/* End Protected Region   [[ComponentInclude]] */

// Header files from own component
#include "Statemachine_CoinMachineStateMachine.h"

// Own header file 


// ----------------------------------------------------------------------------

extern void execState_CoinMachineStateMachine_NormalMode(T_Statemachine_CoinMachineStateMachine* pStatemachineBase, T_Event_CoinMachineStateMachine eEvent);
extern void execState_CoinMachineStateMachine_NormalMode_Locked(T_Statemachine_CoinMachineStateMachine* pStatemachineBase, T_Event_CoinMachineStateMachine eEvent);
extern void execState_CoinMachineStateMachine_NormalMode_Empty(T_Statemachine_CoinMachineStateMachine* pStatemachineBase, T_Event_CoinMachineStateMachine eEvent);
extern void execState_CoinMachineStateMachine_NormalMode_Unlocked(T_Statemachine_CoinMachineStateMachine* pStatemachineBase, T_Event_CoinMachineStateMachine eEvent);
extern void execState_CoinMachineStateMachine_DiagnosticMode(T_Statemachine_CoinMachineStateMachine* pStatemachineBase, T_Event_CoinMachineStateMachine eEvent);
extern void execState_CoinMachineStateMachine_DiagnosticMode_TestLock(T_Statemachine_CoinMachineStateMachine* pStatemachineBase, T_Event_CoinMachineStateMachine eEvent);
extern void execState_CoinMachineStateMachine_DiagnosticMode_TestCoin(T_Statemachine_CoinMachineStateMachine* pStatemachineBase, T_Event_CoinMachineStateMachine eEvent);

// ----------------------------------------------------------------------------

inline void sharedFunction_ligthOff(T_PublicMemberVariable_CoinMachineStateMachine* pPublic,T_PrivateMemberVariable_CoinMachineStateMachine* pPrivate)
{
  /* Begin Protected Region [[7dcb73c4-ee59-11ef-883f-ab05a42d3347,Function]] */
  printf("sharedFunction_ligthOff\n");
  /* End Protected Region   [[7dcb73c4-ee59-11ef-883f-ab05a42d3347,Function]] */
}

// ----------------------------------------------------------------------------
// StateBase CoinMachineStateMachine_NormalMode_Locked
// ----------------------------------------------------------------------------

inline int localGuard_CoinMachineStateMachine_NormalMode_Locked_TO_NormalModeUnlocked(T_PublicMemberVariable_CoinMachineStateMachine* pPublic,T_PrivateMemberVariable_CoinMachineStateMachine* pPrivate)
{
  return (pPrivate->stockItems > 0);
}

// ----------------------------------------------------------------------------

inline void localTransitionFunction_CoinMachineStateMachine_NormalMode_Locked_TO_NormalModeUnlocked_Guard(T_PublicMemberVariable_CoinMachineStateMachine* pPublic,T_PrivateMemberVariable_CoinMachineStateMachine* pPrivate)
{
  /* Begin Protected Region [[a5a9ee89-ee56-11ef-883f-ab05a42d3347,f53601ad-ee56-11ef-883f-ab05a42d3347,TransitionFunction]] */
  printf("localTransitionFunction_CoinMachineStateMachine\n");
  /* End Protected Region   [[a5a9ee89-ee56-11ef-883f-ab05a42d3347,f53601ad-ee56-11ef-883f-ab05a42d3347,TransitionFunction]] */
}

// ----------------------------------------------------------------------------

inline void localTransitionFunction_CoinMachineStateMachine_NormalMode_Empty_TO_NormalModeLocked(T_PublicMemberVariable_CoinMachineStateMachine* pPublic,T_PrivateMemberVariable_CoinMachineStateMachine* pPrivate)
{
  pPrivate->stockItems = INITIAL_STOCK_ITEMS;
}

// ----------------------------------------------------------------------------

inline void localEntryFunction_CoinMachineStateMachine_NormalMode_Unlocked(T_PublicMemberVariable_CoinMachineStateMachine* pPublic,T_PrivateMemberVariable_CoinMachineStateMachine* pPrivate)
{
   = (--pPrivate->stockItems);
}


// ----------------------------------------------------------------------------
// Init Statemachine
// ----------------------------------------------------------------------------

void initStatemachine_CoinMachineStateMachine(T_Statemachine_CoinMachineStateMachine* pStatemachine)
{
  pStatemachine->currentState = 0;
  pStatemachine->historyState_NormalMode = execState_CoinMachineStateMachine_NormalMode_Locked;
  execState_CoinMachineStateMachine_NormalMode_Locked(pStatemachine,CoinMachineStateMachineEvent__Entry);
  execState_CoinMachineStateMachine_NormalMode_Locked(pStatemachine,CoinMachineStateMachineEvent__State);
}

// ----------------------------------------------------------------------------

void execState_CoinMachineStateMachine_NormalMode(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  T_PublicMemberVariable_CoinMachineStateMachine* pPublicMemberVariable = &pStatemachine->publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine* pPrivateMemberVariable = &pStatemachine->privateMemberVariable;
  if (eEvent == CoinMachineStateMachineEvent__Entry)
  {
  }
  else if (eEvent == CoinMachineStateMachineEvent__Exit)
  {
  }
  else if (eEvent == CoinMachineStateMachineEvent_Diagnose)
  {
    pStatemachine->historyState_NormalMode = pStatemachine->currentState;
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode;
    execState_CoinMachineStateMachine_DiagnosticMode_TestLock(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
}

// ----------------------------------------------------------------------------

void execState_CoinMachineStateMachine_NormalMode_Locked(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  T_PublicMemberVariable_CoinMachineStateMachine* pPublicMemberVariable = &pStatemachine->publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine* pPrivateMemberVariable = &pStatemachine->privateMemberVariable;
  if (eEvent == CoinMachineStateMachineEvent__Entry)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_NormalMode_Locked) 
    {
      execState_CoinMachineStateMachine_NormalMode(pStatemachine,CoinMachineStateMachineEvent__Entry);
    }
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Locked;
  }
  else if (eEvent == CoinMachineStateMachineEvent__Exit)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_NormalMode_Locked)
    {
      execState_CoinMachineStateMachine_NormalMode(pStatemachine,CoinMachineStateMachineEvent__Exit);
    }
  }
  else if (eEvent == CoinMachineStateMachineEvent_Coin && localGuard_CoinMachineStateMachine_NormalMode_Locked_TO_NormalModeUnlocked(pPublicMemberVariable,pPrivateMemberVariable))
  {
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Locked;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    localTransitionFunction_CoinMachineStateMachine_NormalMode_Locked_TO_NormalModeUnlocked_Guard(pPublicMemberVariable,pPrivateMemberVariable);
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Unlocked;
    execState_CoinMachineStateMachine_NormalMode_Unlocked(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
  else
  {
    execState_CoinMachineStateMachine_NormalMode(pStatemachine,eEvent);
  }
}

// ----------------------------------------------------------------------------

void execState_CoinMachineStateMachine_NormalMode_Empty(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  T_PublicMemberVariable_CoinMachineStateMachine* pPublicMemberVariable = &pStatemachine->publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine* pPrivateMemberVariable = &pStatemachine->privateMemberVariable;
  if (eEvent == CoinMachineStateMachineEvent__Entry)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_NormalMode_Empty) 
    {
      execState_CoinMachineStateMachine_NormalMode(pStatemachine,CoinMachineStateMachineEvent__Entry);
    }
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Empty;
  }
  else if (eEvent == CoinMachineStateMachineEvent__Exit)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_NormalMode_Empty)
    {
      execState_CoinMachineStateMachine_NormalMode(pStatemachine,CoinMachineStateMachineEvent__Exit);
    }
  }
  else if (eEvent == CoinMachineStateMachineEvent_Refilled)
  {
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Empty;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    localTransitionFunction_CoinMachineStateMachine_NormalMode_Empty_TO_NormalModeLocked(pPublicMemberVariable,pPrivateMemberVariable);
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Locked;
    execState_CoinMachineStateMachine_NormalMode_Locked(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
  else if (eEvent == CoinMachineStateMachineEvent_Coin)
  {
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
  else
  {
    execState_CoinMachineStateMachine_NormalMode(pStatemachine,eEvent);
  }
}

// ----------------------------------------------------------------------------

void execState_CoinMachineStateMachine_NormalMode_Unlocked(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  T_PublicMemberVariable_CoinMachineStateMachine* pPublicMemberVariable = &pStatemachine->publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine* pPrivateMemberVariable = &pStatemachine->privateMemberVariable;
  if (eEvent == CoinMachineStateMachineEvent__Entry)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_NormalMode_Unlocked) 
    {
      execState_CoinMachineStateMachine_NormalMode(pStatemachine,CoinMachineStateMachineEvent__Entry);
    }
    localEntryFunction_CoinMachineStateMachine_NormalMode_Unlocked(pPublicMemberVariable,pPrivateMemberVariable);
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Unlocked;
  }
  else if (eEvent == CoinMachineStateMachineEvent__Exit)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_NormalMode_Unlocked)
    {
      execState_CoinMachineStateMachine_NormalMode(pStatemachine,CoinMachineStateMachineEvent__Exit);
    }
  }
  else if (eEvent == CoinMachineStateMachineEvent_DispenserSignal)
  {
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Unlocked;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Locked;
    execState_CoinMachineStateMachine_NormalMode_Locked(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
  else if (eEvent == CoinMachineStateMachineEvent_DispenserSignal)
  {
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Unlocked;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode_Empty;
    execState_CoinMachineStateMachine_NormalMode_Empty(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
  else
  {
    execState_CoinMachineStateMachine_NormalMode(pStatemachine,eEvent);
  }
}

// ----------------------------------------------------------------------------

void execState_CoinMachineStateMachine_DiagnosticMode(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  T_PublicMemberVariable_CoinMachineStateMachine* pPublicMemberVariable = &pStatemachine->publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine* pPrivateMemberVariable = &pStatemachine->privateMemberVariable;
  if (eEvent == CoinMachineStateMachineEvent__Entry)
  {
    sharedFunction_ligthOff(pPublicMemberVariable,pPrivateMemberVariable);
  }
  else if (eEvent == CoinMachineStateMachineEvent__Exit)
  {
  }
  else if (eEvent == CoinMachineStateMachineEvent_Return)
  {
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    pStatemachine->currentState = execState_CoinMachineStateMachine_NormalMode;
    pStatemachine->historyState_NormalMode(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
}

// ----------------------------------------------------------------------------

void execState_CoinMachineStateMachine_DiagnosticMode_TestLock(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  T_PublicMemberVariable_CoinMachineStateMachine* pPublicMemberVariable = &pStatemachine->publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine* pPrivateMemberVariable = &pStatemachine->privateMemberVariable;
  if (eEvent == CoinMachineStateMachineEvent__Entry)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_DiagnosticMode_TestLock) 
    {
      execState_CoinMachineStateMachine_DiagnosticMode(pStatemachine,CoinMachineStateMachineEvent__Entry);
    }
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode_TestLock;
  }
  else if (eEvent == CoinMachineStateMachineEvent__Exit)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_DiagnosticMode_TestLock)
    {
      execState_CoinMachineStateMachine_DiagnosticMode(pStatemachine,CoinMachineStateMachineEvent__Exit);
    }
  }
  else if (eEvent == CoinMachineStateMachineEvent_Coin)
  {
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode_TestLock;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    sharedFunction_ligthOff(pPublicMemberVariable,pPrivateMemberVariable);
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode_TestCoin;
    execState_CoinMachineStateMachine_DiagnosticMode_TestCoin(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
  else
  {
    execState_CoinMachineStateMachine_DiagnosticMode(pStatemachine,eEvent);
  }
}

// ----------------------------------------------------------------------------

void execState_CoinMachineStateMachine_DiagnosticMode_TestCoin(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  T_PublicMemberVariable_CoinMachineStateMachine* pPublicMemberVariable = &pStatemachine->publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine* pPrivateMemberVariable = &pStatemachine->privateMemberVariable;
  if (eEvent == CoinMachineStateMachineEvent__Entry)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_DiagnosticMode_TestCoin) 
    {
      execState_CoinMachineStateMachine_DiagnosticMode(pStatemachine,CoinMachineStateMachineEvent__Entry);
    }
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode_TestCoin;
  }
  else if (eEvent == CoinMachineStateMachineEvent__Exit)
  {
    if (pStatemachine->currentState != execState_CoinMachineStateMachine_DiagnosticMode_TestCoin)
    {
      execState_CoinMachineStateMachine_DiagnosticMode(pStatemachine,CoinMachineStateMachineEvent__Exit);
    }
  }
  else if (eEvent == CoinMachineStateMachineEvent_DispenserSignal)
  {
    T_StateFunction_CoinMachineStateMachine currentState = pStatemachine->currentState;
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode_TestCoin;
    currentState(pStatemachine,CoinMachineStateMachineEvent__Exit);
    pStatemachine->currentState = execState_CoinMachineStateMachine_DiagnosticMode_TestLock;
    execState_CoinMachineStateMachine_DiagnosticMode_TestLock(pStatemachine,CoinMachineStateMachineEvent__Entry);
    pStatemachine->currentState(pStatemachine,CoinMachineStateMachineEvent__State);
  }
  else
  {
    execState_CoinMachineStateMachine_DiagnosticMode(pStatemachine,eEvent);
  }
}

// ----------------------------------------------------------------------------

void triggerStatemachine_CoinMachineStateMachine(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent)
{
  pStatemachine->currentState(pStatemachine,eEvent);
}


// ----------------------------------------------------------------------------

/* Actifsource ID=[d32dc97e-b5ef-11e1-8a32-8d8f10205acf,47cb2084-ee55-11ef-883f-ab05a42d3347,P8GJpiC8C1RKkSL8tXST4eBx294=] */
