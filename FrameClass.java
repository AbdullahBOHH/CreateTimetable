//import Jframe,Jpanel
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Desktop;
import java.net.URI;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Class
public class FrameClass implements ActionListener{

    // Declare variables
    private JFrame frame;
    private JPanel panel;
    private JButton downloadBtn;
    private JTextField link;
    private String linkString;
    

    //main function
    public FrameClass() {

        // Initialize variables
        frame = new JFrame("Video To Mp3");
        panel = new JPanel();
        downloadBtn = new JButton("Download");
        //implemet focus listener
        link = new JTextField(50);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Add action listener to the dowloadbutton
        downloadBtn.addActionListener(this);

        // add all the elemnts to the panel
        panel.add(link);
        panel.add(downloadBtn);

        //add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent a) {
       if (a.getSource() == downloadBtn){
        try { Desktop desk = Desktop.getDesktop();
            linkString = link.getText();
             desk.browse(new URI(linkString));

        
        } catch (Exception e) {

        }
        
        
       }
    }

}