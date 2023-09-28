//Usually you will require both swing and awt packages
// even if you are working with just swings.
package FirstGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gui implements ActionListener {
   int i = 0;
   String text;
   JTextArea ta = new JTextArea();

   gui() {

        //Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        send.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            text = tf.getText();
            tf.setText("");
            ta.append(text + "\n");
         }
        });


        JButton counter = new JButton("Button");
        
        counter.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            i++;
            ta.setText("times clicked: " + Integer.toString(i));
         }
        });


        JButton reset = new JButton("Reset");
      
        reset.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            ta.setText("");
         }
        });

        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        mb.add(counter);
        

        // Text Area at the Center
        //JTextArea ta = new JTextArea();
        //Adding Components to the frame.

        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
   }

    public static void main(String args[]) {
      gui clicks = new gui();
    }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
   }
}