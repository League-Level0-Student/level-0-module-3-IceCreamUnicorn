
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 31st";
		String dadsBirthday = "December 26th";
		String myBirthday   = "February 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String watbdayuwant = JOptionPane.showInputDialog("WHICH BIRTHDAY DO YOU WANT");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, watbdayuwant);
		// 4. if user asked for "mom"
		if(watbdayuwant.equals("mom")) 
		{
			JOptionPane.showMessageDialog(null,"May 31st");
		}
		if(watbdayuwant.equals("dad")) 
		{
			JOptionPane.showMessageDialog(null,"December 26th");
		}
		if(watbdayuwant.equals("me")) 
		{
			JOptionPane.showMessageDialog(null,"February 5th");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Sorry, I don't remember that person's birthday!");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
