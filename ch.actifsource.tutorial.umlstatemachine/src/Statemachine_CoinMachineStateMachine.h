//--------------------------------------------------------------------------
// (C) Copyright Actifsource GmbH  2012-2015
//
// Use or copying of all or any part of the document, except as
// permitted by the License Agreement is prohibited.
//--------------------------------------------------------------------------

#ifndef Statemachine_CoinMachineStateMachine_H_
#define Statemachine_CoinMachineStateMachine_H_

// Header files from the environment

// Header files from external components

// Header files from own component

// Type and Forward declarations

/** Events for StatemachineBase CoinMachineStateMachine. */
typedef enum Event_CoinMachineStateMachine
{
  CoinMachineStateMachineEvent__Entry = -3,
  CoinMachineStateMachineEvent__State = -2,
  CoinMachineStateMachineEvent__Exit = -1, 
  CoinMachineStateMachineEvent_Coin,
  CoinMachineStateMachineEvent_DispenserSignal,
  CoinMachineStateMachineEvent_Refilled,
  CoinMachineStateMachineEvent_Diagnose,
  CoinMachineStateMachineEvent_Return,
  CoinMachineStateMachineEvent__NrOfState
} T_Event_CoinMachineStateMachine;

typedef struct PublicMemberVariable_CoinMachineStateMachine
{
} T_PublicMemberVariable_CoinMachineStateMachine; 

typedef struct PrivateMemberVariable_CoinMachineStateMachine
{
  int stockItems;
} T_PrivateMemberVariable_CoinMachineStateMachine; 

/** Forwarding data structure for StatemachineBase CoinMachineStateMachine. */
typedef struct Statemachine_CoinMachineStateMachine T_Statemachine_CoinMachineStateMachine;

typedef void (*T_StateFunction_CoinMachineStateMachine)(T_Statemachine_CoinMachineStateMachine*, T_Event_CoinMachineStateMachine);

/** Data structure for StatemachineBase CoinMachineStateMachine. */
typedef struct Statemachine_CoinMachineStateMachine
{
  T_StateFunction_CoinMachineStateMachine currentState;
  T_StateFunction_CoinMachineStateMachine historyState_NormalMode;
  T_PublicMemberVariable_CoinMachineStateMachine publicMemberVariable;
  T_PrivateMemberVariable_CoinMachineStateMachine privateMemberVariable;
} T_Statemachine_CoinMachineStateMachine;

/**
 *  Initializes the state machine.
 *  @param pStatemachineBase The statemachine to initialize.
 */
extern void initStatemachine_CoinMachineStateMachine(T_Statemachine_CoinMachineStateMachine* pStatemachine);

/**
 *  Triggers the state machine.
 *  @param pStatemachineBase The statemachine to trigger.
 *  @param eEvent The trigger event.
 */
extern void triggerStatemachine_CoinMachineStateMachine(T_Statemachine_CoinMachineStateMachine* pStatemachine, T_Event_CoinMachineStateMachine eEvent);

#endif

/* Actifsource ID=[b2480177-b5ef-11e1-8a32-8d8f10205acf,47cb2084-ee55-11ef-883f-ab05a42d3347,bAsCVwReC3SPTiUQnVW1cnXHyu0=] */
