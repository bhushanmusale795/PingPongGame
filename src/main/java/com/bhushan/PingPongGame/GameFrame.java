package com.bhushan.PingPongGame;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    
	private static final long serialVersionUID = 1L;
	GameFrame()
    {
        setTitle("Ping Pong Game");
        //setLayout(null);
        getContentPane().setBackground(Color.black);
        GamePanel panel=new GamePanel();
        add(panel);
        //setSize(1000,555);
//        setFocusable(true);
        pack();
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
       
    	@SuppressWarnings("unused")
		GameFrame g=new GameFrame();
    }
}