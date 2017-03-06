import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import java.util.*;

public class randomNumber
{
   Random randomObj = new Random();
   
   int ri1 = randomObj.nextInt(60);
   
   System.out.println(""+ri1);
}