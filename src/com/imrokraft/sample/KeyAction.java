package com.imrokraft.sample;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyAction extends JFrame implements KeyListener{

	public KeyAction() {
		setSize(500, 500);
		addKeyListener(KeyAction.this);
		setVisible(true);
	}

	public static void main(String[] args) {

		new KeyAction();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key released");
	}

}
