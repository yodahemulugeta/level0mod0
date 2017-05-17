package org.jointheleague.level_0.everything_is_awsome;

import javax.swing.JOptionPane;

public class everythingisawesome {
public static void main(String[] args) {
	String fav=JOptionPane.showInputDialog("what do you like?");
	JOptionPane.showMessageDialog(null,fav + " are awesome!");
	
	String be=JOptionPane.showInputDialog("inter a noun");
	String bi=JOptionPane.showInputDialog("inter a verb");
    String ya=JOptionPane.showInputDialog("inter an adjective");
    String bu=JOptionPane.showInputDialog("inter noun");
    String aa=JOptionPane.showInputDialog("inter verb");
    JOptionPane.showMessageDialog(null,"The " + be + "  is " + bi + " " + ya + " "+ bu + " with " + aa);
	
	
}



}
