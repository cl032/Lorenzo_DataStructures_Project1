/**
******************************************************
***  Class Name: Lorenzo_Project1_LinkListStack.
***  Class Author:  Chris Lorenzo
******************************************************
* This class allows the user to input up to ten numbers
* to verify stack push and pop operations.  It provides
* visual feedback to ensure the stack performs as
* intended.
******************************************************
*** Date: 12 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
package Lorenzo_Project1_LinkListStack;

import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class LinkListStack extends javax.swing.JFrame {

    /**
     * Creates new form LinkListStack
     */
    public LinkListStack() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtInputValue = new javax.swing.JTextField();
        btnPushLink = new javax.swing.JButton();
        btnPopLink = new javax.swing.JButton();
        lblErrMsg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCountVar = new javax.swing.JLabel();
        lblLinkListString = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTopAfterPop = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTopB4Pop = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Link List Stack");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel1.setText("Link List Stack");

        jLabel2.setText("Please enter an Integer to place on the Stack:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("The Stack:");

        txtInputValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInputValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInputValueKeyPressed(evt);
            }
        });

        btnPushLink.setText("Push");
        btnPushLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushLinkActionPerformed(evt);
            }
        });

        btnPopLink.setText("Pop");
        btnPopLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopLinkActionPerformed(evt);
            }
        });

        lblErrMsg.setFont(new java.awt.Font("Courier", 1, 13)); // NOI18N
        lblErrMsg.setForeground(new java.awt.Color(255, 0, 51));
        lblErrMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrMsg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Input Count:");

        lblCountVar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountVar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblLinkListString.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLinkListString.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Top Value Before Pop:");

        lblTopAfterPop.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Top Value Atfer Pop:");

        lblTopB4Pop.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Created by : Chris Lorenzo");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel8.setText("Left (stack bottom) - to - Right (stack top)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInputValue, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPushLink, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTopB4Pop, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTopAfterPop, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnPopLink, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblLinkListString, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8))
                                .addComponent(lblErrMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCountVar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCountVar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInputValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPushLink))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(lblLinkListString, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTopB4Pop, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addComponent(lblTopAfterPop, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnPopLink)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
******************************************************
***  Method Name: btnPushLinkActionPerformed.
***  Method Author:  Chris Lorenzo
******************************************************
*   This method is responsible for taking the input value
*   from the user, converting that value into an Integer and
*   calling the LinkList class PUSH method using the input 
*   value as the methods parameter value.  If input values 
*   are correct, GUI labels will be update using this method 
*   to keep track of the stack elements and the their values.
* 
*   Method Inputs:
*   — ActionEvent
*   Return Value:
*   — None
* 
******************************************************
*** Date: 12 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/ 
    
    private void btnPushLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushLinkActionPerformed
        // TODO add your handling code here:
        
       /// *** PUSH *** /// 
        
       lblErrMsg.setText("");       //Clear any previous err msgs
            try
            {                
                String input = txtInputValue.getText();             //Placed user input in string var
                int num = Integer.parseInt(input);                  //Convert var to int and throw error is not
                myList.push(num);                                   //Push num on stack
                linkArray.add(num);
                linkCount++;                                        //Increment to keep track of links and prevent overflow
                lblCountVar.setText(Integer.toString(linkCount));   //Update GUI counter
                listPreview += input + ", ";                        //Update string var that holds formatted link int values
                lblLinkListString.setText(listPreview);             //Place updated str var into label for visual GUI feedback  
                txtInputValue.setText("");                          //Clear inputbox
                txtInputValue.requestFocus();                       //Return cursor focus to inputbox
            }
            catch (NumberFormatException e)
            {
                lblErrMsg.setText("Invalid Input, Please Enter an Integer.");   //Respond to null and Non integer number inputs
            }    

    }//GEN-LAST:event_btnPushLinkActionPerformed

/**
******************************************************
***  Method Name: btnPopLinkActionPerformed.
***  Method Author:  Chris Lorenzo
******************************************************
*   This method is responsible for calling the LinkList's
*   pop method to remove the last link placed on the stack.
*   This method also cycles through the linkArray in order 
*   to update the GUI label, while removing the last link 
*   value in the stack.  This method will inform the user
*   of NULL values when all links have been popped.
* 
*   Method Inputs:
*   — ActionEvent
*   Return Value:
*   — None
* 
******************************************************
*** Date: 12 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/     
    
    private void btnPopLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopLinkActionPerformed
        // TODO add your handling code here:
        
        /// **** POP **** ///
        String[] strArray = listPreview.split(", ");    //Split values list into array
        lblErrMsg.setText("");                          //Clear the previous error message
        lblLinkListString.setText("");                  //Clear the existing stack report
        listPreview = "";                               //Clear the string var that holds the list of links
        String list = "";                               //Intialize str var to hold updated values list after pop
        
        for(int i=0;i<linkCount-1;i++)
        {
            list += strArray[i] + ", ";
        }

        listPreview = list;                 //Populate var with updated list for use in the next pop or push 
        lblLinkListString.setText(list);    //Print list to GUI for user to verify

        //Check to make sure links 
        //exist before poping
        if(linkCount > 0)
            try
            {
                if(myList.top.nextLink != null) //Check for more than one link
                {
                    lblTopB4Pop.setText(Integer.toString(myList.top.value));    //Top value before pop placed in label to confirm correct action was taken
                    myList.pop();                                               //Pop the link
                    linkCount--;                                                //Decrement the counter to keep track of links
                    lblTopAfterPop.setText(Integer.toString(myList.top.value)); //Top value after pop placed in label to confirm correct action was taken
                    lblCountVar.setText(Integer.toString(linkCount));           //Update GUI counter
                }
                else if((myList.top != null) && (myList.top.nextLink == null))  //Check to see if the program is at the LAST link
                {
                    lastNum = myList.top.value;                         //Capture last link value before it's popped for later feedback to GUI label
                    myList.pop();                                       //Pop the last link
                    linkCount--;                                        //Decrement the counter to keep track of links
                    lblTopB4Pop.setText(Integer.toString(lastNum));     //Get the last number before the last pop to place in GUI label to show correct action was taken
                    lblTopAfterPop.setText("NULL");                     //Set top to NULL because lasy link was popped
                    lblCountVar.setText(Integer.toString(linkCount));   //Update GUI counter
                }
            }
            catch (Exception e)
            {
                lblErrMsg.setText("Error, please try again.");          //Catch all errors and prompt to retry
            }
        else
            {
                lblTopB4Pop.setText("");                                //Clear values to indicate no links left
                lblTopAfterPop.setText("");                             //Clear values to indicate no links left
                lblErrMsg.setText("Stack Clear, No More Links");        //Inform user stack is clear
                lblLinkListString.setText(listPreview = "");            //Clear values to indicate no links left
            }
        
    }//GEN-LAST:event_btnPopLinkActionPerformed

/**
******************************************************
***  Method Name: txtInputValueKeyPressed.
***  Method Author:  Chris Lorenzo
******************************************************
*   This method responds to the keyboard enter button
*   and executes all code as if the user clicked the pop
*   button
* 
*   Method Inputs:
*   — ActionEvent
*   Return Value:
*   — None
* 
******************************************************
*** Date: 12 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/ 
    
    private void txtInputValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputValueKeyPressed
        // TODO add your handling code here:
        
        //repsond to ENTER button to perform all code in push operation
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            btnPushLink.doClick();
        }
    }//GEN-LAST:event_txtInputValueKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LinkListStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinkListStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinkListStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkListStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LinkListStack().setVisible(true);
        });
    }

    LinkList myList = new LinkList();               //New LinkList to hold and manage links
    ArrayList<Integer> linkArray = new ArrayList<>();
    private int linkCount = 0;                      //To keep track of links to prevent under and overflow
    String listPreview = "";                        //To accumulate and format to String, the integers entered into the stack
    int lastNum;                                    //To catch and hold the last value of the Link variable before it's set to NULL,
                                                    //... cont.  It is used for demonstrate the program status.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPopLink;
    private javax.swing.JButton btnPushLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCountVar;
    private javax.swing.JLabel lblErrMsg;
    private javax.swing.JLabel lblLinkListString;
    private javax.swing.JLabel lblTopAfterPop;
    private javax.swing.JLabel lblTopB4Pop;
    private javax.swing.JTextField txtInputValue;
    // End of variables declaration//GEN-END:variables
}
