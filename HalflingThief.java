/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 9
 */

public class HalflingThief
{
  private StealingMethod method;	// Data Member stores method for implementation of steal()

  public HalflingThief (StealingMethod method)	// Constructor initializes StealingMethod
  {
	  this.method = method;
  }
  
  public void changeMethod (StealingMethod method)	// Changes StealingMethod
  {
	  this.method = method;
  }
  
  public void steal ()	// Executes steal() according to StealingMethod Object
  {
	  method.steal();
  }
}
