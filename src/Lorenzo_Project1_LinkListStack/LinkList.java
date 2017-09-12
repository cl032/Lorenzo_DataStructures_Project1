/**
******************************************************
***  Class Name: LinkList.
***  Class Author:  Chris Lorenzo
******************************************************
*   This class provides a structure for the main GUI
*   class (LinkListStack) to accept and remove links
*   of the Link class.
* 
*   Class Inputs:
*   — Integer Link value to perform the push method
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
public class LinkList 
{
    public Link top = null;                 //Property Initialization
    
    public void push(int linkVal)           //Method to perform the POP operation
    {
        if(top == null)                     //If LinkList has no link with values
        {                                   //... make the incoming value the value
            top = new Link();               //... for the top link.
            top.value = linkVal;            //... and set its nextlink value to null.
            top.nextLink = null;
        }
        else
        {
            add(linkVal, top);              //Otherwise, call private add method to add link to existing list
        }
    }
    
    
    private void add(int linkVal, Link myLink)      //add link to existing list passing Integer Value and latest link added
    {
        Link temp = new Link(linkVal);              //Create new link to temp hold values while rearranging list pointers
        temp.nextLink = myLink;                     //Place the existing top value to next value
        top = temp;                                 //Place the new incoming value at the top of the list
    }

    
    public void pop()                       //remove the last link placed on stack
    {
        if(top != null)                     //Verify a link exist before acting
        {
            Link temp = new Link();         //Create new link to hold temp values while rearranging list pointers
            temp = top;                     //Place currect top value in temp
            top = temp.nextLink;            //remove the current top value by placing the next top value as the current top value
        }
        else if(top == null)                //if top is null, nextLink must be null to, so clear the nextLink value.
        {
            top.nextLink = null;
        }
    }

}
