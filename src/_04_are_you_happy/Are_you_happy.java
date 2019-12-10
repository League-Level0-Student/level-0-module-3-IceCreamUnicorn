package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
public static void main(String[] args) {
	String yowassup = JOptionPane.showInputDialog("Are y0U hApPy? yes or no. PLEASE ENTER LOWERCASE OR IT WON'T WORK.");
	if(yowassup.equals("yes")) 
	{
		JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing.");
	}
	else
	{
		String hihi = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if(hihi.equals("yes")) 
		{
			JOptionPane.showMessageDialog(null, "Change Something.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
		
	}
}


