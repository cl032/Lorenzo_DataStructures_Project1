/**
******************************************************
***  Class Name: Link.
***  Class Author:  Chris Lorenzo
******************************************************
*   This class serves a data object to be used in the
*   LinkList class.
* 
*   Class Inputs:
*   — Integer value to initialize link using one of two
*       constructors.
* 
*   Return Value:
*   — none
* 
******************************************************
*** Date: 12 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
package Lorenzo_Project1_LinkListStack;

/**
 *
 * @author Chris
 */
public class Link 
{
    //Class properties
    public int value;
    public Link nextLink;
    
    //General constructor
    public Link()
    {
        
    }
    
    //Constructor with param value
    public Link(int value)
    {
        this.value = value;
    }
    
}
