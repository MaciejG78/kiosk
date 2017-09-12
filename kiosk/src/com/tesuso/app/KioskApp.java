package com.tesuso.app;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class KioskApp { 
	public static void main(String[] args){
		
		final Browser browser = new Browser();
		
		
		JButton googleButton = new JButton("Google");
		googleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				browser.loadURL("https://www.google.pl");
			}
		});
		
		JButton interiaButton = new JButton("Interia");
		interiaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				browser.loadURL("www.interia.pl");
			}
		});
		
		JPanel actionPanel = new JPanel();
		actionPanel.add(googleButton);
		actionPanel.add(interiaButton);
				
		JFrame frame = new JFrame();
		frame.add(actionPanel, BorderLayout.WEST);
		frame.add(new BrowserView(browser), BorderLayout.CENTER);
		frame.setUndecorated(true);
		frame.setAlwaysOnTop(true);
		
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}

}
