import javax.swing.*;
import java.awt.*;

public class TestImageIcon extends JFrame {
  private ImageIcon usIcon, myIcon, frIcon, ukIcon;

  public TestImageIcon() {
    setLayout(new GridLayout(1, 4, 5, 5));
    add(new JLabel(usIcon = new ImageIcon("image\\us.gif")));
    add(new JLabel(myIcon = new ImageIcon("image\\my.jpg")));
    add(new JButton(frIcon = new ImageIcon("image\\fr.gif")));
    add(new JButton(ukIcon = new ImageIcon("image\\uk.gif")));
  }

  public static void main(String[] args) {
    TestImageIcon frame = new TestImageIcon();
    frame.setTitle("TestImageIcon");
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);	 
    frame.setVisible(true);
  }
}
