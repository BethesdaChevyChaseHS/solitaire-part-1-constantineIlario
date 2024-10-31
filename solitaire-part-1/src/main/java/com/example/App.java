package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame(" "); // Replace "Your Name" with your actual name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(1100, 700);

        JPanel topPanel = new JPanel();
        JLabel titleLabel = new JLabel("Constantine's Solitaire"); // Replace "Your Name" with your actual name
        topPanel.add(titleLabel);
        frame.add(topPanel, BorderLayout.NORTH);

        
        JPanel leftPanel = new JPanel();
        JLabel pileLabel = new JLabel("Pile");
        leftPanel.add(pileLabel);
        frame.add(leftPanel, BorderLayout.WEST);


        JPanel playArea = new JPanel(new GridLayout(1, 7, 5, 5)); // 1 row, 7 columns
        for (int i = 1; i <= 7; i++) {
            JPanel stackPanel = new JPanel();            stackPanel.add(new JLabel("Stack " + i));
            playArea.add(stackPanel);
        }
        frame.add(playArea, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JLabel infoLabel = new JLabel("Welcome to Constantine's Solitatre. Here you will play Solitare and have lots of fun. If you do not know how to play look up directions on google.");
        bottomPanel.add(infoLabel);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        
        frame.setVisible(true);
    }
}