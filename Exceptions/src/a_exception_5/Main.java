package a_exception_5;

import java.io.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		String e_mail;
		e_mail = JOptionPane.showInputDialog("Enter your email");
		try {
			checkEmail(e_mail);
		}catch(Exception e) {
			System.out.println("The email address is not correct");
			e.printStackTrace();
		}
	}
	
	static void checkEmail(String mail) throws WrongMail {
		int at = 0;
		boolean dot = true;
		
		if (mail.length() <= 3) {
			//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			//throw new EOFException();
			throw new WrongMail("The Email is very short");
		}
		else {
			for (int i=0; i<mail.length(); i++) {
				if (mail.charAt(i) == '@')
					at++;
				if (mail.charAt(0) == '.' || mail.charAt(mail.length()-1) == '.')
					dot = false;
			}
			if (at == 1 && dot == true)
				System.out.println("Correct email");
			else
				System.out.println("The email address is not correct");
		}
	}
}
