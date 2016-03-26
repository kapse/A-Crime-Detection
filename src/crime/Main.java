
package crime;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Main
{

    public static void main(String[] args)
    {
     
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    JDialog.setDefaultLookAndFeelDecorated(true);
                    MainFrame mf=new MainFrame();
                    mf.setVisible(true);
                    mf.setTitle("Resilient Identity Crime Detection ");
                } catch (Exception e) {
                    System.out.println("e = " + e);
                }
            }
        });
    }
}