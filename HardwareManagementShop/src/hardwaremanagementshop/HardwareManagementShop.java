/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardwaremanagementshop;

import javax.swing.UIManager;

/**
 *
 * @author Shatu
 */
public class HardwareManagementShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Thread(){
       public void run() {
                
                try {
                    Thread.sleep(10500);
                    System.out.println("Splash");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                new Login().setVisible(true);
            }
       
    }.start();
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (Exception ex) {
            
        }
    }
    
}
