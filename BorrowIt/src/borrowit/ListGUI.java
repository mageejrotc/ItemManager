//package borrowit;
//
//
//import java.awt.*;
//import javax.swing.*;
//
//public class ListGUI {
//	
//	private JFrame frame = new JFrame();
//	private JPanel panel = new JPanel();
//	public static final int X = 800;
//	public static final int Y = 600;
//	
//	public ListGUI()
//	{
//		frame.setDefaultCloseOperation(3);
//		frame.setVisible(true);
//		frame.setSize(X , Y);
//		frame.setLayout(new BorderLayout());
//		frame.add(panel);
//	//	panel.setLayout(new BorderLayout());
//		panel.setVisible(true);
//		panel.setBackground(Color.decode("1480045"));
////		panel.setBackground(Color.GREEN);
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		ListGUI gui = new ListGUI();
//	}
//}
import java.awt.*;

import javax.swing.*;

    public class ListGUI {
        
        public static void main(String[]args) {
            JFrame frame = new JFrame("Grocery GUI");
            frame.setPreferredSize(new Dimension(1100,900));
            frame.setLocation(450,100);
            JPanel panel = new JPanel();
            frame.setVisible(true);
            panel.setBackground(Color.red);
            frame.getContentPane();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.add(panel);
            frame.setSize(800,600);
            frame.add(panel);
            
            panel.setLayout(new GridLayout (5, 1, 40, 5));
            JPanel topPanel = new JPanel();
            JPanel middlePanel = new JPanel();
            JPanel bottomPanel = new JPanel();
            JPanel bottomPanel2 = new JPanel();
            JPanel bottomPanel3 = new JPanel();
            
            
            Font topPanelFont = new Font("Sans Serif" , Font.BOLD, 64);
            JLabel welcome = new JLabel("Welcome to Borrow It");
            welcome.setFont(topPanelFont);
            welcome.setForeground(Color.blue);
            topPanel.setBackground(Color.white);
            topPanel.add(welcome);
            
            
            Font middlePanelFont = new Font("Sans Serif" , Font.BOLD, 34);
            JLabel newList = new JLabel("New Lists");
            newList.setFont(middlePanelFont);
            newList.setForeground(Color.blue);
            middlePanel.setBackground(Color.white);
            middlePanel.add(newList);
            
            
            Font bottomPanelFont = new Font("Sans Serif" , Font.BOLD, 34);
            JLabel current = new JLabel("Current Lists");
            current.setFont(bottomPanelFont);
            current.setForeground(Color.blue);
            bottomPanel.setBackground(Color.white);
            bottomPanel.add(current);
            
            Font bottomPanel2Font = new Font("Sans Serif" , Font.BOLD, 34);
            JLabel edit = new JLabel("Edit Items and Lists");
            edit.setFont(bottomPanel2Font);
            edit.setForeground(Color.blue);
            bottomPanel2.setBackground(Color.white);
            bottomPanel2.add(edit);
            
            
            Font bottomPanel3Font = new Font("Sans Serif" , Font.BOLD, 34);
            JLabel remove = new JLabel("Remove Items and Lists");
            remove.setFont(bottomPanel3Font);
            remove.setForeground(Color.blue);
            bottomPanel3.setBackground(Color.white);
            bottomPanel3.add(remove);
    
            
            panel.add(topPanel);
            panel.add(middlePanel);
            panel.add(bottomPanel);
            panel.add(bottomPanel2);
            panel.add(bottomPanel3);
            
            frame.pack();
            

            
            
            
            
        
            
        }

    
            
            
        }
