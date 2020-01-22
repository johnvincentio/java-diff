
package io.johnvincent.diff.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class AppfileActionListener implements ActionListener {
	private Appfile m_appfile;
	public AppfileActionListener (Appfile appfile) {
		m_appfile = appfile;
	}
	public void actionPerformed (ActionEvent e) {
		System.out.println(">>> actionPerformed");
		Object source = e.getSource();
		if (source instanceof JTextField) {
			System.out.println("JTextField");
			JTextField jt = (JTextField) e.getSource();
			String data = jt.getText();
			m_appfile.handlePastedData (data);
		}
		System.out.println("<<< actionPerformed");
	}
}
