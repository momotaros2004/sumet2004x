/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nangkum;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;



/**
 *
 * @author blyth
 */
public class Main {
    public static void main(String[ ] args) {

        try {
     UIManager.setLookAndFeel( new FlatLightLaf() );
     new KinDaijFrame () .setVisible(b:true);
    
    } catch (Exception e) {
      System.err.println( "Failed to initialize LaF" );
    }
    }

    private static class KinDaijFrame {

        public KinDaijFrame() {
        }
    }

    private static class FlatLightLaf extends LookAndFeel {

        public FlatLightLaf() {
        }
    }
    }
