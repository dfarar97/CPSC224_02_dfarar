/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ica4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
   This class demonstrates how to use an ImageIcon
   and a JLabel to display an image.
*/



public class ICA4 extends JFrame
{
   private JPanel imagePanel;     // To hold the label
   private JPanel buttonPanel;
   private JLabel DiceimageLabel;     // To show an image
   private JLabel DiceimageLabel2;     // To show an image
   private JButton rollDiceButton;        // To get an image

   ImageIcon die1 = new ImageIcon("Die1.png");
   ImageIcon die2 = new ImageIcon("Die2.png");
   ImageIcon die3 = new ImageIcon("Die3.png");
   ImageIcon die4 = new ImageIcon("Die4.png");
   ImageIcon die5 = new ImageIcon("Die5.png");
   ImageIcon die6 = new ImageIcon("Die6.png");
   /**
      Constructor
   */

   public ICA4()
   {
      // Set the title.
      setTitle("My Dice");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager.
      setLayout(new BorderLayout());

      // Build the panels.
      buildImagePanel();
      buildButtonPanel();

      // Add the panels to the content pane.
      add(imagePanel, BorderLayout.NORTH);
      //add(imagePanel2, BorderLayout.WEST);
      add(buttonPanel, BorderLayout.SOUTH);
//      add(dicePanel, BorderLayout.EAST);
//      add(dicePanel2, BorderLayout.WEST);
      
      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildImagePanel method adds a label to a panel.
   */

   private void buildImagePanel()
   {
      // Create a panel.
      imagePanel = new JPanel();
      imagePanel.setLayout(new GridLayout(1, 2));
//      imagePanel2 = new JPanel();
      // Create a label.
      DiceimageLabel = new JLabel();
      DiceimageLabel2 = new JLabel();
      
      // Add the label to the panel.
      
      imagePanel.add(DiceimageLabel);
      imagePanel.add(DiceimageLabel2);
//      imagePanel2.add(DiceimageLabel2);
//      dicePanel.add(DiceimageLabel);
//      dicePanel2.add(DiceimageLabel2);
   }

   /**
      The buildButtonPanel method adds a button
      to a panel.
   */

   private void buildButtonPanel()
   {
//      Random rand = new Random();
//      int randomRollValue = 0;

      buttonPanel = new JPanel();
//      randomRollValue = rand.nextInt(6) + 1;
//      if(randomRollValue == 1) {
//          DiceimageLabel.setIcon(die1);   
//      } else if(randomRollValue == 2) {
//          DiceimageLabel.setIcon(die2);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel.setIcon(die3);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel.setIcon(die4);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel.setIcon(die5);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel.setIcon(die6);  
//      }
//      
//      randomRollValue = rand.nextInt(6) + 1;
//      if(randomRollValue == 1) {
//          DiceimageLabel2.setIcon(die1);   
//      } else if(randomRollValue == 2) {
//          DiceimageLabel2.setIcon(die2);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel2.setIcon(die3);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel2.setIcon(die4);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel2.setIcon(die5);  
//      } else if(randomRollValue == 2) {
//          DiceimageLabel2.setIcon(die6);  
//      }
      // Get the smiley face image.
     

      // Create a button.
      rollDiceButton = new JButton("Roll Dice");
////      button.setIcon(DieImage);
//
//      // Register an action listener with the button.
      rollDiceButton.addActionListener(new ButtonListener());

      // Add the button to the panel.
      buttonPanel.add(rollDiceButton);
   }

   /**
      Private inner class that handles the event when
      the user clicks the button.
   */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Read the image file into an ImageIcon object.
        Random rand = new Random();
        int randomRollValue = 0;
        int randomRollValue2 = 0;
         // Display the image in the label.
         randomRollValue = rand.nextInt(6) + 1;
        if(randomRollValue == 1) {
            DiceimageLabel.setIcon(die1);   
        } else if(randomRollValue == 2) {
            DiceimageLabel.setIcon(die2);  
        } else if(randomRollValue == 3) {
            DiceimageLabel.setIcon(die3);  
        } else if(randomRollValue == 4) {
            DiceimageLabel.setIcon(die4);  
        } else if(randomRollValue == 5) {
            DiceimageLabel.setIcon(die5);  
        } else if(randomRollValue == 6) {
            DiceimageLabel.setIcon(die6);  
        }

        randomRollValue2 = rand.nextInt(6) + 1;
        if(randomRollValue2 == 1) {
            DiceimageLabel2.setIcon(die1);   
        } else if(randomRollValue2 == 2) {
            DiceimageLabel2.setIcon(die2);  
        } else if(randomRollValue2 == 3) {
            DiceimageLabel2.setIcon(die3);  
        } else if(randomRollValue2 == 4) {
            DiceimageLabel2.setIcon(die4);  
        } else if(randomRollValue2 == 5) {
            DiceimageLabel2.setIcon(die5);  
        } else if(randomRollValue2 == 6) {
            DiceimageLabel2.setIcon(die6);  
        }
         // Remove the text from the label.
         DiceimageLabel.setText(null);
         DiceimageLabel2.setText(null);
         // Pack the frame again to accomodate the 


         pack();
      }
   }
   
   /**
      The main method creates an instance of the
      MyCatImage class which causes it to display
      its window.
   */
   public static void main(String[] args)
   {
      new ICA4();
   }
}
