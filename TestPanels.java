import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
public class TestPanels extends JFrame{
 // Components of TestPanels - It has two JPanels called p1, and p2
 private JPanel p1, p2;
 public TestPanels(){
 p1 = new JPanel();// Construct p1 & set it's layout to GridLayout
 p1.setLayout(new GridLayout(4,3));
 // and add buttons to p1
 for(int i = 1; i <= 9; i++){
 p1.add(new JButton("" + i));
 }
 p1.add(new JButton("" + 0));
 p1.add(new JButton("Start"));
 p1.add(new JButton("Stop"));
//Construct p2 & set it's layout to BorderLayout
 p2 = new JPanel();
 p2.setLayout(new BorderLayout());
 // and add a JTextField and p1 to p2
 p2.add(new JTextField("Time to be displayed here")
, BorderLayout.NORTH);
 p2.add(p1, BorderLayout.CENTER);
 // add p2, and a JButton this JFrame (defaults to BorderLayout)
 add(p2, BorderLayout.EAST);
 add(new JButton("Food to be placed here"),BorderLayout.CENTER);
 }
 public static void main(String[] args){
 TestPanels frame = new TestPanels();
 frame.setTitle("The Front View of a Microwave Oven");
 frame.setSize(400, 250);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);
 }
}
