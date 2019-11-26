/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.io.IOException;
import java.net.URL;
import static javafx.scene.paint.Color.web;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class SwingTester {
  
 public static void main(String args[]) {  
  JTextPane tp = new JTextPane();
  JScrollPane js = new JScrollPane();
  js.getViewport().add(tp);
  JFrame jf = new JFrame();
  jf.getContentPane().add(js);
  jf.pack();
  jf.setSize(400,500);
  jf.setVisible(true); 
  
  try {
    //URL url = new URL("SwingTester.htm");
    //URL url = getClass().getResource("SwingTester.htm");
     URL url = SwingTester.class.getResource("SwingTester.htm");
    tp.setPage(url);
    } 
  catch (Exception e) {
    }
 }
} 